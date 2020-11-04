package cn.testproject.parts.entity;
/*
* 配件类
*/

import lombok.Data;

@Data
public class Parts {
//    @Data：能去除Getter,Setter,equals,hashCode,toString方法，提高代码的简洁
    private String NEWPARTS_ID;
    private String NEWPARTS_NAME;
    private String NEWPARTS_KIND;
    private String NEWPARTS_SINGLEPRICE;
    private String NEWPARTS_GUIGE;
    private String NEWPARTS_UNIT;
    private int NEWPARTS_AMOUNT;
    private int NEWPARTS_LOWAMOUNT;
    private int NEWPARTS_STATUS;
    private int NEWPARTS_USETAG;
    private String NEWPARTS_FROM;

}
