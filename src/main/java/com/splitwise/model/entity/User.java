/**
 * 
 */
package com.splitwise.model.entity;

import java.sql.Date;

import com.splitwise.model.response.LoginResponse;

import lombok.Data;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * @date 26-Sep-2022
 */
@Data
public class User {

	private Integer userId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Long mobileNumber;
	private String mailId;
	private String cirty;
	private Object profilePhoto;
	
}
