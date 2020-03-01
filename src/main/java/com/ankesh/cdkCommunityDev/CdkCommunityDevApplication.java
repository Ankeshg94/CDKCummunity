package com.ankesh.cdkCommunityDev;

import com.ankesh.cdkCommunityDev.models.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableTransactionManagement
@MappedTypes(User.class)
@MapperScan("com.ankesh.cdkCommunityDev.mappers")
@SpringBootApplication(scanBasePackages={"com.ankesh.cdkCommunityDev.mappers","com.ankesh.cdkCommunityDev.controllers","com.ankesh.cdkCommunityDev.security"})
@EnableSwagger2
public class CdkCommunityDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdkCommunityDevApplication.class, args);

	}
}
