package cn.testproject.order.controller;

import cn.testproject.order.entity.Product;
import cn.testproject.order.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private ProductFeignClient productFeignClient;


	/**
	 */
	@RequestMapping(value = "/buy/id={id}",method = RequestMethod.GET)
	public Product findById(@PathVariable int id) {
		Product product = null;
		product = productFeignClient.findById(id);
		return product;
	}


}
