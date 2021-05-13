package com.zander.web01.control;

import com.zander.web01.bean.SaleGoods;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRequestController {

    @RequestMapping(value="/test/httpmessageconverter", method = RequestMethod.POST)
    public SaleGoods httpMessageConverterTest(@RequestBody SaleGoods saleGoods) {
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType()+1);
        saleGoods.setGoodsName("商品名："+ saleGoods.getGoodsName());
        System.out.println("======="+saleGoods.toString());
        return saleGoods;
    }
}
