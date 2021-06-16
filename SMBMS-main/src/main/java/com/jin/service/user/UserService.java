package com.jin.service.user;

import com.jin.pojo.User;

import java.util.List;

public interface UserService {
    //用户登录
    public User login(String userCode, String pwd);

    //根据用户ID修改密码
    public boolean updatePwd(int id, String pwd);

    //查询记录数
    public int getUserCount(String username, int userRole);

    //查询用户列表
    public List<User> getUserList(String queryUsername, int queryUserRole, int currentPageNo, int pageSize);

    //添加用户
    public boolean add(User user);
}
