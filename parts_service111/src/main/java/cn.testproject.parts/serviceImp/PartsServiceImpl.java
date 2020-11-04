package cn.testproject.parts.serviceImp;

import cn.testproject.parts.entity.Parts;
import cn.testproject.parts.mapper.PartsMapper;
import cn.testproject.parts.service.PartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Service
public class PartsServiceImpl implements PartService {
    //    使用jpa用这个
//    @Autowired
//    private ProductDao productDao;

    @Resource
    private PartsMapper partsMapper;
//    private ProductMapper productMapper;

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
    public ArrayList<Parts> selectAllParts(HttpServletRequest res, HttpServletResponse resp){
        String keywords = "";
        keywords = (res.getParameter("keywords").toString()==null?"":res.getParameter("keywords").trim());
        ArrayList<Parts> parts = partsMapper.selectAllParts(keywords);
        return parts;
    }

    @Override
    public int insertParts(HttpServletRequest request, HttpServletResponse resp){
        String partid=request.getParameter("partID");
        String partname=request.getParameter("partsName");
        String kind=request.getParameter("kind");
        String guiGe=request.getParameter("guiGe");
        String singleprice=request.getParameter("singlePrice");
        String unit=request.getParameter("unit");
        int amount=Integer.parseInt(request.getParameter("amount"));
        int lowamount=Integer.parseInt(request.getParameter("lowAmount"));
        int status=Integer.parseInt(request.getParameter("status"));
        int usetag=Integer.parseInt(request.getParameter("usetag"));
        String from=request.getParameter("from");
        int flag = partsMapper.insertParts(partid,partname, kind,singleprice,guiGe, unit,amount,lowamount, status, usetag, from);
        return flag;
    }

//    public Product findById(int id) {
//        Product product = ProductMapper.findById(3);
//        return product;
//    }

}
