package com.zander.web01.bean;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class SaleGoods {
    private Integer id;
    private String goodsName;
    private float weight;
    private int type;
    private Boolean onSale;
}
