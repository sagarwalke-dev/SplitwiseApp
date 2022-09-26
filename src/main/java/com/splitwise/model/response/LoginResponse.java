/**
 * 
 */
package com.splitwise.model.response;

import lombok.Data;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * @date 26-Sep-2022
 */
@Data
public class LoginResponse extends Response{
	private String username;
	private String token;
}
