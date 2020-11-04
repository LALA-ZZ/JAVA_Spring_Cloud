package cn.testproject.parts.service;

import cn.testproject.parts.entity.Parts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public interface PartService {
    //查询所有的配件
    public ArrayList<Parts> selectAllParts(HttpServletRequest res, HttpServletResponse resp);
    //插入配件
    public int insertParts(HttpServletRequest res, HttpServletResponse resp);
//    public int insertParts(String partid, String partname, String kind, String singleprice, String guiGe, String unit,int amount,int lowamount, int status,int usetag,String from);

}
