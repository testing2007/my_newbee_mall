package com.zander.web01.service;

import com.zander.web01.bean.Carousel;
import com.zander.web01.util.PageQueryUtil;
import com.zander.web01.util.PageResult;

//bean->service(impl)->controller(拥有service接口对象)

public interface NewBeeMallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);
}
