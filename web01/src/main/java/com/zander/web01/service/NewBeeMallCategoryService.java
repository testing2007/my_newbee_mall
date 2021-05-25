package com.zander.web01.service;

import com.zander.web01.bean.GoodsCategory;
import com.zander.web01.control.vo.NewBeeMallIndexCategoryVO;
import com.zander.web01.util.PageQueryUtil;
import com.zander.web01.util.PageResult;

import java.util.List;

public interface NewBeeMallCategoryService {
    PageResult getCategorisPage(PageQueryUtil pageUtil);

    String saveCategory(GoodsCategory goodsCategory);

    String updateGoodsCategory(GoodsCategory goodsCategory);

    GoodsCategory getGoodsCategoryById(Long id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 根据parentId和level获取分类列表
     *
     * @param parentIds
     * @param categoryLevel
     * @return
     */
    List<GoodsCategory> selectByLevelAndParentIdsAndNumber(List<Long> parentIds, int categoryLevel);

    /**
     * 返回分类数据(首页调用)
     *
     * @return
     */
    List<NewBeeMallIndexCategoryVO> getCategoriesForIndex();
}
