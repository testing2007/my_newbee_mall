package com.zander.web01.service;

import com.zander.web01.bean.GoodsCategory;
import com.zander.web01.util.PageQueryUtil;
import com.zander.web01.util.PageResult;

public interface NewBeeMallCategoryService {
    PageResult getCategorisPage(PageQueryUtil pageUtil);

    String saveCategory(GoodsCategory goodsCategory);

    String updateGoodsCategory(GoodsCategory goodsCategory);

    GoodsCategory getGoodsCategoryById(Long id);

    Boolean deleteBatch(Integer[] ids);
}
