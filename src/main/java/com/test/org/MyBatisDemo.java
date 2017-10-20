package com.test.org;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Created by cytzrs on 17-4-2.
 */
public class MyBatisDemo {
	
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = null;
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
