package com.cn.hnust.service;

import com.cn.hnust.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int getdeleteUser(int userid);
	public int getInsert(User user);
	public int getUpdate(User user);
}
