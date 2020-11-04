package cn.testproject.product.mapper;

import cn.testproject.product.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    //通过id得到商品
    public Product findById(
            @Param("id")int id
    );

}
