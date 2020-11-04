package cn.testproject.parts.entity;

import lombok.Data;

/**
 * 商品实体类
 */
@Data
//@Entity
//@Table(name="tb_product")
//对应数据库返回的值
public class Product {

	//@Id
	private int id;
	private String product_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
}
