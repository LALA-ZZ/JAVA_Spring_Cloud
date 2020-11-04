package cn.testproject.parts.mapper;

import cn.testproject.parts.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    //通过id得到商品
    public Product findById(
            @Param("id") int id
            //用注解来简化xml配置的时候（比如Mybatis的Mapper.xml中的sql参数引入），
            // @Param注解的作用是给参数命名,参数命名后就能根据名字得到参数值,
            // 正确的将参数传入sql语句中（一般通过#{}的方式，${}会有sql注入的问题）
    );

}
