package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.pojo.bo.UserBO;
import com.imooc.pojo.vo.OrderVO;

import java.util.List;

public interface OrderService {

    //用于创建订单相关信息
    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    //用于修改订单状态
    public void updateOrderStatus(String orderId,Integer orderSatus);
}
