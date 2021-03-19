# SSM 后端

# 第二章 Spring IoC

## Spring IoC 的基本概念

**控制反转（Inversion of Control, IoC）**：实例不再由调用者创建，而是由Spring容器进行创建。即控制权由调用者转移到Spring容器，控制权发生了反转。

**依赖注入（Dependency Injection, DI）**：Spring容器负责将被依赖对象赋值给调用者的成员变量，相当于为调用者注入它所依赖的实例。

**多态**：父类指向子类的引用，接口指向实现类的引用



**使用控制反转和依赖注入的优点**：用来削减计算机程序的耦合问题

## Spring IoC 容器

### BeanFactory

> 但由于BeanFactory加载配置文件需要填写配置文件的**绝对路径**，所以在实际开发中并不常用。

### ApplicationContent

**1** 通过 ClassPathXmlApplicationContext 创建

```java
ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
```



**2** 通过 FileSystemXmlApplicationContext 创建

> 也是需要写**绝对路径**，不推荐使用

**3** 通过 Web服务器实例化 ApplicationContext 创建

## 依赖注入

> Spring框架采用Java的反射机制进行依赖注入

### 使用构造方法注入

TestDIServiceImpl.java

```java
package com.vayliu.service;

import com.vayliu.dao.TestDIDao;

public class TestDIServiceImpl implements TestDIService {

    private TestDIDao testDIDao;

    // 构造方法，用于实现依赖注入接口对象 testDIDao
    public TestDIServiceImpl(TestDIDao testDIDao) {
        super();
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService 构造方法注入 say: Hello, Study hard!");
    }
}
```

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 将指定类 TestDIDao 配置给 Spring， 让 Spring 创建实例 -->
    <bean id="testDIDao" class="com.vayliu.dao.TestDIDaoImpl"/>

    <!-- 使用构造方法进行注入 -->
    <bean id="testDIService" class="com.vayliu.service.TestDIServiceImpl">
        <!-- 将 testDIDao 注入到 TestDIServiceImpl 类的属性 testDIDao 上 -->
        <constructor-arg index="0" ref="testDIDao"/>
    </bean>

</beans>
```

### 使用属性的 setter 方法注入

TestDIServiceImpl1.java

```java
package com.vayliu.service;

import com.vayliu.dao.TestDIDao;

public class TestDIServiceImpl1 implements TestDIService {

    private TestDIDao testDIDao;

    // 添加 TestDIDao 属性的 setter 方法，用于实现依赖注入
    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        // 调用 TestDIDao 中的 sayHello 方法
        testDIDao.sayHello();
        System.out.println("TestDIService setter 方法注入 say: Hello, Study hard!");
    }

}

```

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 将指定类 TestDIDao 配置给 Spring， 让 Spring 创建实例 -->
    <bean id="testDIDao" class="com.vayliu.dao.TestDIDaoImpl"/>

    <!-- 使用 setter 方法注入 -->
    <bean id="testDIService1" class="com.vayliu.service.TestDIServiceImpl1">
        <!-- 调用 TestDIServiceImpl1 类的 setter 方法，将 testDIDao 注入到 TestDIServiceImpl1 类的属性 TestDIDao 上 -->
        <property name="testDIDao" ref="testDIDao"/>
    </bean>

</beans>
```

# 第三章 Spring Bean

## Bean 的配置

`<bean>`元素的常用属性及其子元素

|  属性或子元素名称   | 描述                                                         |
| :-----------------: | ------------------------------------------------------------ |
|        `id`         | Bean在 BeanFactory中的唯一标识，在代码中通过BeanFactory获取Bean实例时需要以此作为索引名称 |
|       `class`       | Bean的具体实现类，使用类的名                                 |
|       `scope`       | 指定Bean实例的作用域                                         |
| `<constructor-arg>` | `<bean>`元素的子元素，使用构造方法注入，指定构造方法的参数。<br />`index`属性指定参数的序号<br />`ref`属性是定对BeanFactory中其他Bean的引用关系<br />`type`属性指定参数类型<br />`value`属性指定参数的常量值 |
|    `<property>`     | `<bean>`元素的子元素，用于设置一个属性。<br />`name`属性指定Bean实例中相应的属性名称<br />`ref`属性指定属性对BeanFactory中其他Bean的引用关系 |
|      `<list>`       | `<property>`元素的子元素，用于封装List或数组类型的依赖注入。 |
|       `<map>`       | `<property>`元素的子元素，用于封装Map类型的依赖注入。        |
|       `<set>`       | `<property>`元素的子元素，用于封装Set类型的依赖注入。        |
|      `<entry>`      | `<map>`元素的子元素，用于设置一个键值对。                    |

## Bean 的实例化

> 一个bean可以理解成一个Java类的实例化

### 构造方法实例化（最常用）

BeanCLass.java

```java
package com.vayliu.instance;

/**
 * 一个普通的类
 *
 * @author: VayLiu
 **/


public class BeanClass {

    public String message;

    // 普通类有无参构造
    public BeanClass() {
        message = "构造方法实例化Bean";
    }

    public BeanClass(String s) {
        message = s;
    }

}
```

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 将指定类 BeanCLass 配置给 Spring， 让 Spring 创建实例 -->
    <bean id="beanInstance" class="com.vayliu.instance.BeanClass"/>

</beans>
```

### 静态工厂实例化

BeanCLass.java

```java
package com.vayliu.instance;

/**
 * 静态工厂实例化
 *
 * @author: VayLiu
 **/


public class BeanStaticFactory {

    private static BeanClass beanInstance = new BeanClass("调用静态方法实例化Bean");

    public static BeanClass createInstance() {
        return beanInstance;
    }

}

```

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="staticFactoryInstance" class="com.vayliu.instance.BeanStaticFactory" factory-method="createInstance"/>

</beans>
```

### 实例工厂实例化

BeanCLass.java

```java
package com.vayliu.instance;

/**
 * 实例工厂实例化
 *
 * @author: VayLiu
 **/


public class BeanInstanceFactory {

    public BeanClass createBeanClassInstance() {
        return new BeanClass("调用实例工厂方法实例化 Bean");
    }

}

```

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="myFactory" class="com.vayliu.instance.BeanInstanceFactory"/>
    <bean id="myFactory" factory-bean="myFactory" factory-method="createBeanClassInstance"/>

</beans>
```

## Bean的作用域

|  作用域名称   | 描述                                                         |
| :-----------: | ------------------------------------------------------------ |
|  `singleton`  | **默认的作用域**Spring IoC容器每次仅生产和管理一个Bean实例，在使用`id`或`name`获取Bean实例时，IoC都会翻译共享的这一个Bean实例 |
|  `prototyp`   | Spring IoC 容器每次请求都会创建一个新的实例                  |
|   `request`   | 在一次HTTP请求中，容器只返回一个实例；<br />不同的HTTP请求将会返回不同的Bean实例。 |
|   `session`   | 在一个 HTTP Session中，容器只返回同一个Bean实例              |
| `application` | 为每一个ServletContext对象创建一个实例。<br />即同一个应用共享一个Bean实例。 |
|  `Websocket`  | 为每一个WebSocket对象创建一个Bean实例，                      |

## Bean的生命周期

**方法**

- 实例化
- 初始化
- 接受请求
- 销毁

## Bean的装配方式（依赖注入的方式）

> Bean的装配可以理解为将Bean依赖注入到Spring容器中
>
> **Bean的装配即Bean依赖注入**

### 基于XML配置的装配

- 构造方法
- 使用属性的setter方法注入

### 基于注解的装配

- `@Component`该注解是一个泛化的概念，仅表示一个组件对象，可以作用任何层次上，**主要注解到类上**

- `@Repository`用于注解数据访问层（DAO）的类表示

- `@Service`用于注解业务逻辑组件类（Service层）

- `@Controller`用于注解一个控制器组件类（Spring MVC 的 Controller）

- `@Resource`对类的成员变量、方法及构造方法进行注解

  两个属性：

    - `name`指定Bean实例名称
    - `type`指定Bean的类型

- `@Autowired`自动装配

# 第四章 Spring AOP

## Java 反射

> Java反射技术应用广泛，他能够配置：类的全限定名，方法和参数，完成对象的初始化，甚至反射某些方法。这样就大大地增强Java的可配置性，Spring IoC的基本原理采用的是Java的反射和工厂模式。
>
> **Java的反射机制**：Java反射机制是指在运行状态中，对于任意一个类，都能的够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为Java语言的反射机制。
>
> Java的反射内容繁多，包括对象构建，反射方法，注解，接口，参数等等。咱们主要讲解利用Java的反射进行对象构建和方法的反射调用。在Java中，反射是通过java.lang.reflect.*实现的。

## AOP 概念

**AOP（Aspect-Oriented Programming）**：面向切面编程

采取横向抽取机制，将分散在各个方法中的重复代码提取出来，然后在程序编译或运行阶段，再将这些抽取出来的代码应用到需要执行的地方。

> AOP不是OOP的替代品，而是补充，相辅相成

## AOP 术语

- **切面**：封装横切刀系统功能的类

- **连接点**：程序运行中的一些时间点，如方法的调用或异常的抛出

- **切入点**：需要处理的连接点
- **通知（增强处理）**：定义好的切入点处所需要的方法。
- **引入**：允许现有的是先烈添加自定义的方法和属性
- **目标对象**：被通知的对象，一般是数据交互
- **代理**：通知应用到目标对象之后，被动态创建的对象
- **织入**：将切面代码插入到目标对象上

## 动态代理

> Spring AOP常用**JDK**和**CGLIB**两种动态代理技术

### JDK 动态代理

### CGLIB 动态代理

## 基于代理类的 AOP 实现

ProxyFactoryBean



## AspectJ 框架

> AspectJ 是一个基于 Java语言 开发的 AOP框架。

使用AspectJ实现Spring AOP的方式：

- **基于XML配置开发**

- **基于注解开发**

### 基于XML配置开发AspectJ

|        元素名称         | 用途                                                         |
| :---------------------: | ------------------------------------------------------------ |
|     `<aop:config>`      | 开发 AspectJ 的顶层配置元素，在配置文件的`<bean>`下可以包含多个该元素 |
|     `<aop:aspect>`      | 配置（定义）一个切面，`<aop:config>`元素的子元素，属性`ref`指定切面的定义 |
|    `<aop:pointcut>`     | 配置切入点，`<aop:config>`元素的子元素，属性`expression`指定通知增强哪些方法 |
|     `<aop:before>`      | 配置前置通知，`<aop:aspect>`元素的子元素<br />属性`method`指定前置通知方法<br />属性`pointcut-ref`指定关联的切入点 |
| `<aop:after-returning>` | 配置后置返回通知，`<aop:aspect>`元素的子元素<br />属性`method`指定前置通知方法<br />属性`pointcut-ref`指定关联的切入点 |
|     `<aop:around>`      | 配置环绕通知，`<aop:aspect>`元素的子元素<br />属性`method`指定前置通知方法<br />属性`pointcut-ref`指定关联的切入点 |
| `<aop:after-throwing>`  | 配置异常通知，`<aop:aspect>`元素的子元素<br />属性`method`指定前置通知方法<br />属性`pointcut-ref`指定关联的切入点 |
|      `<aop:after>`      | 配置后置（最终）通知，`<aop:aspect>`元素的子元素<br />属性`method`指定前置通知方法<br />属性`pointcut-ref`指定关联的切入点 |
| `<aop:declare-parents>` | 给通知引入新的额接口（了解）                                 |



### 基于注解开发AspectJ

|     注解名称      | 描述                                                         |
| :---------------: | ------------------------------------------------------------ |
|     `@Aspect`     | 用于定义一个切面，注解在切面类上。                           |
|    `@Pointcut`    | 用于定义切入点表达式。<br />在使用时需要定义一个切入点方法，方法是一个返回值void且方法体为空的普通方法。 |
|     `@Before`     | 用于定义前置通知。<br />在使用时通常需要指定value值。        |
| `@AfterReturning` | 用于定义后置返回通知。<br />在使用时通常需要指定value值。    |
|     `@Around`     | 用于定义环绕通知。<br />在使用时通常需要指定value值。        |
| `@AfterThrowing`  | 用于定义异常通知。<br />在使用时通常需要指定value值，另外还有一个throwing属性用于访问目标方法抛出的异常，该属性值与异常通知方法汇总同名的形参一致。 |
|     `@After`      | 用于定义后置（最终）通知。<br />在使用时通常需要指定value值。 |

