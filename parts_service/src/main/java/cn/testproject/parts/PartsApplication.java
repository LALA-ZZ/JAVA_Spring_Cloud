package cn.testproject.parts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication注解一般放在项目的一个启动类上，
// 用来把启动类注入到容器中，用来定义容器扫描的范围，用来加载classpath环境中一些bean。

// @EntityScan("cn.testproject.product.entity")

//通过使用@MapperScan可以指定要扫描的Mapper类的包的路径
@MapperScan("cn.testproject.parts.mapper")

//激活eurekaClient,新版euraka不写都行,在yml配置就完事了
//@EnableEurekaClient
//@EnableDiscoveryClient
public class PartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartsApplication.class, args);
    }
}
