package com.jin.dao.role;

import com.jin.dao.BaseDao;
import com.jin.pojo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {
    //获取角色列表
    @Override
    public List<Role> getRoleList(Connection connection) throws SQLException {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Role> roleList = new ArrayList<>();

        if (connection != null) {
            String sql = "select * from smbms_role";
            Object[] params = {}; //不可传null，会有空指针异常 nullPointerException
            rs = BaseDao.execute(connection, pstm, rs, sql, params);

            while (rs.next()) {
                Role role = new Role();
                role.setId(rs.getInt("id"));
                role.setRoleCode(rs.getString("roleCode"));
                role.setRoleName(rs.getString("roleName"));
                roleList.add(role);
            }
            BaseDao.closeResource(null, pstm, rs);
        }
        return roleList;
    }
}
