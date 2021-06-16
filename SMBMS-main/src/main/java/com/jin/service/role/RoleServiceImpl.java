package com.jin.service.role;

import com.jin.dao.BaseDao;
import com.jin.dao.role.RoleDao;
import com.jin.dao.role.RoleDaoImpl;
import com.jin.pojo.Role;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    //引入DAO
    private RoleDao roleDao;

    public RoleServiceImpl() {
        roleDao = new RoleDaoImpl();
    }

    //获取角色列表
    @Override
    public List<Role> getRoleList() {
        Connection connection = null;
        List<Role> roleList = null;
        try {
            connection = BaseDao.getConnection();
            roleList = roleDao.getRoleList(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeResource(connection, null, null);
        }
        return roleList;
    }

//    @Test
//    public void test() {
//        RoleService roleService = new RoleServiceImpl();
//        List<Role> roleList = roleService.getRoleList();
//        for (Role role: roleList) {
//            System.out.println(role.getRoleName());
//        }
//    }
}

