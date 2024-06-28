package com.zy.website.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2WebMvc
public class Swagger2Config {

    // admin API信息
    private ApiInfo adminApiInfo(){
        return new ApiInfoBuilder()
                .title("后台管理系统API文档")
                .description("后台管理")
                .version("1.0")
                .contact(new Contact("zhangyu","https://www.zyproject.website","3385682934@qq.com"))
                .build();
    }

    // user API信息
    private ApiInfo userApiInfo(){
        return new ApiInfoBuilder()
                .title("用户API文档")
                .description("用户")
                .version("1.0")
                .contact(new Contact("zhangyu","https://www.zyproject.website","3385682934@qq.com"))
                .build();
    }
    // 第一组
    @Bean
    public Docket webApiConfig(){
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder.name("token")
                .description("用户token")
                .modelRef(new ModelRef("String"))
                .parameterType("header")
                .required(false);
        pars.add(parameterBuilder.build());

        Docket webApi = new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户端接口")
                .apiInfo(userApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zy.website.controller.user"))
                .paths(PathSelectors.regex("/api/.*"))
                .build()
                .globalOperationParameters(pars);
        return webApi;
    }

    @Bean
    public Docket adminConfig(){
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder.name("token")
                .description("管理员token")
                .modelRef(new ModelRef("String"))
                .parameterType("header")
                .required(false);
        pars.add(parameterBuilder.build());

        Docket admApi = new Docket(DocumentationType.SWAGGER_2)
                .groupName("管理端接口")
                .apiInfo(adminApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zy.website.controller.admin"))
                .paths(PathSelectors.regex("/admin/.*"))
                .build()
                .globalOperationParameters(pars);
        return admApi;
    }
}
