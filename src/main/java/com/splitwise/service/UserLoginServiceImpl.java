/**
 * 
 */
package com.splitwise.service;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;

import com.splitwise.model.entity.User;
import com.splitwise.model.request.LoginRequest;
import com.splitwise.model.response.LoginResponse;
import com.splitwise.util.Constants;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * @date 23-Sep-2022
 */
@Service
@Slf4j
public class UserLoginServiceImpl implements UserLoginService {

	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		log.info("calling login");
		LoginResponse loginResponse = new LoginResponse();
		try {
			if (loginRequest != null) {
				if (loginRequest.getUsername().equalsIgnoreCase(Constants.USERNAME)) {
					if (loginRequest.getPassword().equals(Constants.PASSWORD)) {
						loginResponse.setCode(200);
						loginResponse.setMessage("Login success");
					} else {
						loginResponse.setCode(401);
						loginResponse.setMessage("Login failed");
					}
				} else {
					loginResponse.setCode(404);
					loginResponse.setMessage("user not found");
					throw new NullPointerException();
				}
			} else {
				loginResponse.setCode(400);
				loginResponse.setMessage("please provide details");
			}
		} catch (Exception e) {
			log.error("Error: " + e.getMessage());
			log.error("Error: " + ExceptionUtils.getStackTrace(e));
			loginResponse.setCode(500);
			loginResponse.setMessage("Internal server error: " + e.getMessage());
		}
		log.info("login end");
		return loginResponse;
	}
}