package cn.testproject.infomation.preprocessing.controller;

import cn.testproject.infomation.preprocessing.service.FilesUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
@RequestMapping("/FilesUpload")
public class FilesUploadController {
    //注入Service服务对象
    @Autowired
    private FilesUploadService filesUploadService;
    //上传预测excel文件
    @ResponseBody
    @RequestMapping("/uploadDemandForecastFile")
    public void uploadDemandForecastFile(HttpServletRequest request, @RequestParam("file") MultipartFile multipartFile,HttpServletResponse response) throws IOException {
        System.out.println("I am controller");
        if(multipartFile!=null){
            String info = "no";
            try {
                info = filesUploadService.uploadDemandForecastFile(request,multipartFile);
                info="ok";
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            PrintWriter out;
            response.setContentType("text/json;charset=UTF-8");
            out = response.getWriter();
            out.write(info);
            out.flush();
            out.close();
        }

    }

    //通过企业id来读取企业存的数据表中字段名，形成一个字段名列表
    @RequestMapping("/getfieldNameById")
    public void getfieldName(){

    }
}
