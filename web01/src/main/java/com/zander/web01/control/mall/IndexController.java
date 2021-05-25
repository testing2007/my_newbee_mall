package com.zander.web01.control.mall;

import com.zander.web01.common.Constants;
import com.zander.web01.control.vo.NewBeeMallIndexCarouselVO;
import com.zander.web01.control.vo.NewBeeMallIndexCategoryVO;
import com.zander.web01.service.NewBeeMallCarouselService;
import com.zander.web01.service.NewBeeMallCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Resource
    private NewBeeMallCarouselService newBeeMallCarouselService;

    @Resource
    private NewBeeMallCategoryService newBeeMallCategoryService;

    @GetMapping({"/index", "/", "/index.html"})
    public String indexPage(HttpServletRequest request) {
        List<NewBeeMallIndexCategoryVO> categories = newBeeMallCategoryService.getCategoriesForIndex();
        List<NewBeeMallIndexCarouselVO> carousels = newBeeMallCarouselService.getCarouselsForIndex(Constants.INDEX_CAROUSEL_NUMBER);
        request.setAttribute("categories", categories);
        request.setAttribute("carousels", carousels);
        return "mall/index";
    }
}
