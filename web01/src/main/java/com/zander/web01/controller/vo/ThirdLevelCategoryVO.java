package com.zander.web01.controller.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 首页分类数据VO(第三级)
 */
@Data
public class ThirdLevelCategoryVO implements Serializable {

    private Long categoryId;

    private Byte categoryLevel;

    private String categoryName;
}

