package com.zander.web01.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class NewBeeMallShoppingCartItem {
    private Long cartItemId;

    private Long userId;

    private Long goodsId;

    private Integer goodsCount;

    private Byte isDeleted;

    private Date createTime;

    private Date updateTime;

}