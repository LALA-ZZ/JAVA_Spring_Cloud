package cn.testproject.infomation.preprocessing.serviceImp;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.testproject.infomation.preprocessing.service.FilesUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class FilesUploadServiceImpl implements FilesUploadService {
    @Override
    //上传预测数据
    public String uploadDemandForecastFile(HttpServletRequest request, @RequestParam("file") MultipartFile multipartFile) throws IOException {
        System.out.println("I am serviceImp");

        //数据表的名字应该是  企业id.xlsx

        /*// 判断文件是.xlsx或者xls结尾。如果不是则抛出提示信息
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!"xlsx".equals(suffix) && !"xls".equals(suffix)) {
            System.out.println("请传入excel文件");
        }*/
        // 如果文件不为空，写入上传路径
        if (!multipartFile.isEmpty()) {
            //1.获取企业id
            String enterpriseid = request.getParameter("enterpriseid").toString();
            System.out.println(enterpriseid);
            // 确定上传文件路径
            String path = "F:/DemandForecastFile/";
            // 上传文件名
            String filename = multipartFile.getOriginalFilename();
            File filePath = new File(path);
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            // 将上传文件保存到一个目标文件当中
            multipartFile.transferTo(new File(path + File.separator + enterpriseid +".xlsx"));
            //System.out.println(filename);
            return "success";
        } else {
            return "error";
        }
    }

}
