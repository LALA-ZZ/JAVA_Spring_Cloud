package cn.testproject.product.serviceImp;

import cn.testproject.product.entity.Product;
import cn.testproject.product.mapper.ProductMapper;
import cn.testproject.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
//    使用jpa用这个
//    @Autowired
//    private ProductDao productDao;

    @Resource
    private ProductMapper ProductMapper;

    //使用jpa访问数据库
//	@Override
//	public Product findById(Long id) {
//
//		return productDao.findById(id).get();
//	}
    //    @Override
//    public void save(Product product) {
//        productDao.save(product);
//    }
//
//    @Override
//    public void update(Product product) {
//        productDao.save(product);
//    }
//
//    @Override
//    public void delete(Long id) {
//        productDao.deleteById(Long.valueOf(id));
//    }
//

    //使用mybatis访问数据库
    @Override
    public Product findById(int id) {
        Product product = ProductMapper.findById(id);
        return product;
    }


}
