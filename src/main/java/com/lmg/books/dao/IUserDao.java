package com.lmg.books.dao;

public interface IUserDao {
	
	/**
	 * 验证手机号是否注册
	 * @param phonenum
	 * @return
	 */
	int checkPhoneNumIsRegist(String phonenum);
	
}
