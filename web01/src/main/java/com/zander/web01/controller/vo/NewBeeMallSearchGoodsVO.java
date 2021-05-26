package com.zander.web01.controller.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NewBeeMallSearchGoodsVO {
    private Long goodsId;

    private String goodsName;

    private String goodsIntro;

    private String goodsCoverImg;

    private Integer sellingPrice;
}
