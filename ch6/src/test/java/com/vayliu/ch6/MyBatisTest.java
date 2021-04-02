package com.vayliu.ch6;

import com.vayliu.ch6.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: VayLiu
 **/


public class MyBatisTest {
    public static void main(String[] args) {
        try {
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 通过ID查询
            User user = sqlSession.selectOne("com.vayliu.ch6.mapper.UserMapper.selectUserById", 1);
            System.out.println(user);

            // 查询所有数据
            List<User> userList = sqlSession.selectList("com.vayliu.ch6.mapper.UserMapper.selectAllUser");
            System.out.println(userList);

            // 插入一条数据
//            User newUser = new User();
//            newUser.setUname("刘锐松");
//            newUser.setAccount(1111);
//            sqlSession.insert("com.vayliu.ch6.mapper.UserMapper.addUser", newUser);
//            sqlSession.commit();

            // 修改一条数据
//            User updateUser = new User();
//            updateUser.setUid(6);
//            updateUser.setUname("VayLiu");
//            updateUser.setAccount(1500);
//            sqlSession.insert("com.vayliu.ch6.mapper.UserMapper.updateUser", updateUser);
//            sqlSession.commit();

            // 删除一条数据
//            sqlSession.delete("com.vayliu.ch6.mapper.UserMapper.deleteUser", 1);
//            sqlSession.commit();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
