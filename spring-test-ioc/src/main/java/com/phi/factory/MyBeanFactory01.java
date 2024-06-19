package com.phi.factory;

import com.phi.dao.UserDao;
import com.phi.dao.impl.UserDaoImpl;

/**
 * @Author: Qf.Ding
 * @CreateTime: 2024-06-19
 * @Description:
 * @Version: 1.0
 */
public class MyBeanFactory01 {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
