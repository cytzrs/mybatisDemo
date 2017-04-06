package com.test.org;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.test.org.dao.RoleMapper;
import com.test.org.pojo.Role;
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
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			for(int i = 0; i < 100; i++) {
				Role role = new Role();
				role.setRoleName("test");
				role.setNote("testNote");
				int ret = roleMapper.insert(role);
				System.out.println(ret);
			}
			sqlSession.commit();
			List<Role> list = roleMapper.selectAll();
			System.out.println("----"+list.size());

			Role role1 = new Role();
			role1.setRoleName("test1");
			List<Role> list_1 = roleMapper.queryByName(role1);

			List<Role> list_2 = roleMapper.queryByName1("test1");

			System.out.println(list_1.size() + "     " + list_2.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
