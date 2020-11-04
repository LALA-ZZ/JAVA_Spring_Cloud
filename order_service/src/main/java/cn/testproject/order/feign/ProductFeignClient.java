package cn.testproject.order.feign;

import cn.testproject.order.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 声明需要调用的微服务名称
 *  @FeignClient
 *      * name : 服务提供者的名称:service-product(9001)
 */
@FeignClient(name="service-product")
public interface ProductFeignClient {

	/**
	 * 配置需要调用的微服务接口
	 * 于是,请求就成了order通过Feign从eureka上获取注册的product信息
	 */
	@RequestMapping(value="/product/id={id}",method = RequestMethod.GET)
	public Product findById(@PathVariable("id") int id);
}
