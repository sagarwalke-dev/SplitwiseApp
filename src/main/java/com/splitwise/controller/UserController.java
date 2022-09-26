/**
 * 
 */
package com.splitwise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.splitwise.model.request.LoginRequest;
import com.splitwise.model.response.LoginResponse;
import com.splitwise.service.UserLoginService;

import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * @date 26-Sep-2022
 */
@RestController("/user")
@Slf4j
@Validated
public class UserController {

	private UserLoginService userLoginService;
	/**
	 * constructor to initialize properties.
	 */
	@Autowired
	public UserController(UserLoginService userLoginService) {
	this.userLoginService=userLoginService;
	}
	
	/**
	 * This API will perform user login validation.
	 * 
	 * @param loginRequest
	 * @return LoginResponse
	 */
	@PostMapping(path = "/login",consumes = "application/json")
	@ApiOperation("user login API")
	public LoginResponse login(@RequestBody @NonNull LoginRequest loginRequest) {
		log.info("start login user API");
		return userLoginService.login(loginRequest);
	}
}
