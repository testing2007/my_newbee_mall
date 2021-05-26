package com.zander.web01.controller.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 购物车页面购物项VO
 */
@Data
@ToString
public class NewBeeMallShoppingCartItemVO implements Serializable {

    private Long cartItemId;

    private Long goodsId;

    private Integer goodsCount;

    private String goodsName;

    private String goodsCoverImg;

    private Integer sellingPrice;

}

