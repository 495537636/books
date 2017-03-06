package com.lmg.books.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lmg.books.dao.IUserDao;
import com.lmg.books.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;

	public int checkPhoneNumIsRegist(String phonenum) {
		int flag = userDao.checkPhoneNumIsRegist(phonenum);
		return flag;
	}

}
