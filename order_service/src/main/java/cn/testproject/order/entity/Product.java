package cn.testproject.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 商品实体类
 */
@Data
public class Product {
	private int id;
	private String product_name;

}
