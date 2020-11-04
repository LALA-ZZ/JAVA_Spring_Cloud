package cn.testproject.parts.controller;

import cn.testproject.parts.entity.Parts;
import cn.testproject.parts.service.PartService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@RestController
@RequestMapping("/parts")
public class PartsController {
    @Autowired
    private PartService partService;

//
//    @Value("${server.port}")
//    private String port;
//
//    @Value("${spring.cloud.client.ip-address}") //spring cloud 自动的获取当前应用的ip地址
//    private String ip;

    //查询所有的配件
    @RequestMapping("/selectAllParts")
    public ArrayList<Parts> selectAllParts(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        ArrayList<Parts> parts = partService.selectAllParts(request,resp);
        PrintWriter out;
        resp.setContentType("text/json;charset=UTF-8");
        out = resp.getWriter();
        out.write(JSON.toJSONString(parts));
        out.flush();
        out.close();
        return parts;
    }

    //插入配件
    @RequestMapping("/insertParts")
    public  void  insertParts(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int flag = partService.insertParts(req,resp);
        PrintWriter out;
        resp.setContentType("text/json;charset=UTF-8");
        out = resp.getWriter();
        out.write(JSON.toJSONString(flag));
        out.flush();
        out.close();
    }
    //测试：根据某一配件id查询配件
    @RequestMapping(value = "/partsid={partsid}",method = RequestMethod.GET)
    public  Parts  getPartsById(@PathVariable String partsid) throws IOException {
        Parts parts = partService.getPartsById(partsid);
        return parts;
    }



//    //通过id获取商品信息
//    @RequestMapping(value = "/id={id}",method = RequestMethod.GET)
//    public Product findById(@PathVariable int id) {
//        Product product = productService.findById(id);
//        //	product.setProductName("访问的服务地址:"+ip + ":" + port);
//        return product;
//    }
}
