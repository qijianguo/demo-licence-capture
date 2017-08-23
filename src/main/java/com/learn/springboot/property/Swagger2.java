package com.learn.springboot.property;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: Swagger2 配置文件
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 9:21
 */
@Configuration  // 让spring管理配置文件
@EnableSwagger2  // 启动 Swagger2
public class Swagger2 {

    /**
     * 创建Docket的Bean
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()           // 返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
                // Swagger2会扫描这个包下的所有controller, 除了被@ApiIgnore指定的请求
                .apis(RequestHandlerSelectors.basePackage("com.learn.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该Api的基本信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("程序猿DD")
                .version("1.0")
                .build();
    }


}
