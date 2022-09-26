/**
 * 
 */
package com.splitwise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Sagar Walke
 * @email sagarwalke7030@gmail.com
 * @date 26-Sep-2022
 */
@Configuration
public class SwaggerConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Splitwise App API documentation").build();
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).forCodeGeneration(true).select()
				.apis(RequestHandlerSelectors.basePackage("com.splitwise")).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}
}