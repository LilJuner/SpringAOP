package com.JavaEE.springAOP;

import com.itheima.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
    public static  void main(String args[]){
        String xmlPath = "com/JavaEE/springAOP/applicationContext.xml";

        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao) ac.getBean("userDaoProxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}
