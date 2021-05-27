package com.zander.web01.service;

import com.zander.web01.controller.vo.NewBeeMallOrderDetailVO;
import com.zander.web01.controller.vo.NewBeeMallShoppingCartItemVO;
import com.zander.web01.controller.vo.NewBeeMallUserVO;
import com.zander.web01.bean.NewBeeMallOrder;
import com.zander.web01.util.PageQueryUtil;
import com.zander.web01.util.PageResult;

import java.util.List;

public interface NewBeeMallOrderService {

    /**
     * 保存订单
     *
     * @param user
     * @param myShoppingCartItems
     * @return
     */
    String saveOrder(NewBeeMallUserVO user, List<NewBeeMallShoppingCartItemVO> myShoppingCartItems);

    /**
     * 获取订单详情
     *
     * @param orderNo
     * @param userId
     * @return
     */
    NewBeeMallOrderDetailVO getOrderDetailByOrderNo(String orderNo, Long userId);
}
