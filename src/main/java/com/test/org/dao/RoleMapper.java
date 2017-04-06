package com.test.org.dao;

import com.test.org.pojo.Role;

import java.util.List;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectAll();

    List<Role> queryByName(Role role);

    List<Role> queryByName1(String roleName);
}