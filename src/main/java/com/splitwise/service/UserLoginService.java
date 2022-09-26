/**
 * 
 */
package com.splitwise.service;

import com.splitwise.model.entity.User;
import com.splitwise.model.request.LoginRequest;
import com.splitwise.model.response.LoginResponse;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * @date 23-Sep-2022
 */
public interface UserLoginService {
	/**
	 * service will perform user login with database.
	 * 
	 * @param loginRequest
	 * @return LoginResponse
	 */
	public LoginResponse login(LoginRequest loginRequest);
}
