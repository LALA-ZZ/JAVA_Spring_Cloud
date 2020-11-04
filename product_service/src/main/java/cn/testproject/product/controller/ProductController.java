package cn.testproject.product.controller;

import cn.testproject.product.entity.Product;
import cn.testproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Value("${server.port}")
	private String port;

	@Value("${spring.cloud.client.ip-address}") //spring cloud 自动的获取当前应用的ip地址
	private String ip;

	//通过id获取商品信息
	@RequestMapping(value = "/id={id}",method = RequestMethod.GET)
	public Product findById(@PathVariable int id) {
		Product product = productService.findById(id);
	//	product.setProductName("访问的服务地址:"+ip + ":" + port);
		return product;
	}

//	@RequestMapping("/a1")
//	public int deleteByID() {
//		long a=1;
//		 productService.delete(a);
//		//	product.setProductName("访问的服务地址:"+ip + ":" + port);
//		return 666;
//	}

}
