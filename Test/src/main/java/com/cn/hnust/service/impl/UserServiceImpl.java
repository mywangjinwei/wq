package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public int getdeleteUser(int userid) {
		return this.userDao.deleteByPrimaryKey(userid);
		
	}
	@Override
	public int getInsert(User user) {
		
		return this.userDao.insert(user);
	}
	@Override
	public int getUpdate(User user) {
		return this.userDao.updateByPrimaryKeySelective(user);
	}

}
