package com.test.org.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by cytzrs on 17-4-2.
 */
public class SqlSessionUtil {

    private static final String path = "mybatis-config.xml";
    private static SqlSession sqlSession = null;
    private static SqlSessionFactory sqlSessionFactory = null;

    private static final Class CLASS_LOCK = SqlSessionUtil.class;

    private SqlSessionUtil()
    {

    }

    public static SqlSessionFactory initSqlSessionFactory() {
        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        synchronized (CLASS_LOCK) {
            if(null == sqlSessionFactory) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        if(null == sqlSessionFactory) {
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
