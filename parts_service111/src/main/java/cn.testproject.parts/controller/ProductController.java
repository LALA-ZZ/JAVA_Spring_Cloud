package cn.testproject.parts.controller;

import cn.testproject.parts.entity.Product;
import cn.testproject.parts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	public Product findById(@PathVariable int id) { //@PathVariable：接收请求路径中占位符的值
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
