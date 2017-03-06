package com.lmg.books.service;

public interface IUserService {
	
	/**
	 * 验证手机号是否注册
	 * @param phonenum
	 * @return
	 */
	int checkPhoneNumIsRegist(String phonenum);

}
