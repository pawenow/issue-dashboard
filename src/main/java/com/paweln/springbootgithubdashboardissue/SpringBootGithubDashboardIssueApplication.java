package com.paweln.springbootgithubdashboardissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
public class SpringBootGithubDashboardIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubDashboardIssueApplication.class, args);
	}

}
