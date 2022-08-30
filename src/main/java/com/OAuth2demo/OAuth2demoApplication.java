package com.OAuth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class OAuth2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2demoApplication.class, args);
	}

}
