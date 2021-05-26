package com.zander.web01.controller.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 商品详情页VO
 */
@Data
@ToString
public class NewBeeMallGoodsDetailVO implements Serializable {

    private Long goodsId;

    private String goodsName;

    private String goodsIntro;

    private String goodsCoverImg;

    private String[] goodsCarouselList;

    private Integer sellingPrice;

    private Integer originalPrice;

    private String goodsDetailContent;
}
