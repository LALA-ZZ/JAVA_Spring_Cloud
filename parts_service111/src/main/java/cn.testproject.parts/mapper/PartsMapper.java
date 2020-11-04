package cn.testproject.parts.mapper;

import cn.testproject.parts.entity.Parts;
import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;

public interface PartsMapper {
    //查询所有的配件
    public ArrayList<Parts> selectAllParts(@Param("keywords")String keywords);
    //插入配件
    public int insertParts(String partid, String partname, String kind, String singleprice, String guiGe, String unit, int amount, int lowamount, int status, int usetag, String from);

}
