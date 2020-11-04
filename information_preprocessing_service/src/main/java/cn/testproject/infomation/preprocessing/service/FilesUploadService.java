package cn.testproject.infomation.preprocessing.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;



public interface FilesUploadService {

    //上传预测数据
    public String uploadDemandForecastFile(HttpServletRequest request, @RequestParam("file") MultipartFile multipartFile) throws IOException;

}
