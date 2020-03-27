package io.itrac.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.common.collect.Lists;

import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LakshminD Swagger documentation configuration
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig 
extends 
WebMvcConfigurationSupport {

	public static final String AUTH=
			"Authorization";
	@Override
	protected void addResourceHandlers(
			ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
		.addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**")
		.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	@SuppressWarnings("deprecation")
	@Bean
	public SecurityConfiguration securityInfo() {
		return new SecurityConfiguration(
				null, null, null, null, "", ApiKeyVehicle.HEADER, AUTH, "");
	}

	@Bean
	public Docket docket() {
		return new Docket(
				DocumentationType.SWAGGER_2)
				.select()
				.build()
				.securitySchemes(
						Lists
						.newArrayList(
								apiKey()
								
							));
	}

	private ApiKey apiKey() {
		return new ApiKey(AUTH, AUTH, "header");
	}

}
