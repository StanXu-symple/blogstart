package com.stan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration //说明这是一个配置类
@EnableSwagger2 //开启Swagger2的自动配置
public class SwaggerConfig {
    @Bean
    public Docket docker() {
        // 构造函数传入初始化规范，这是swagger2规范
        return new Docket(DocumentationType.SWAGGER_2)
                //apiInfo： 添加api详情信息，参数为ApiInfo类型的参数，这个参数包含了第二部分的所有信息比如标题、描述、版本之类的，开发中一般都会自定义这些信息
                .apiInfo(apiInfo())
                .groupName("stan")
                //配置是否启用Swagger，如果是false，在浏览器将无法访问，默认是true
                .enable(true)
                .select()
                //apis： 添加过滤条件,
                .apis(RequestHandlerSelectors.basePackage("com.stan.controller"))
                //paths： 这里是控制哪些路径的api会被显示出来，比如下方的参数就是除了/user以外的其它路径都会生成api文档
                .paths((String a) ->
                        !a.equals("/user"))
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("徐正宇", "hello-world", "1316239136@qq.com");
        return new ApiInfo(
                "博客系统", // 标题
                "StanXu的练手项目", // 描述
                "v1.0", // 版本
                "hello-world", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 ", // 许可
                "XXX", // 许可连接
                new ArrayList<>()// 扩展
        );
    }
}
