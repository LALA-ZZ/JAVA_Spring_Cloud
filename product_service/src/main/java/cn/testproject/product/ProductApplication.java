package cn.testproject.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EntityScan("cn.testproject.product.entity")
@MapperScan("cn.testproject.product.mapper")
//激活eurekaClient,新版euraka不写都行,在yml配置就完事了
//@EnableEurekaClient
//@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
