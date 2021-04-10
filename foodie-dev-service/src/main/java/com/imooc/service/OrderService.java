package com.imooc.service;

import com.imooc.pojo.Carousel;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.pojo.bo.UserBO;
import com.imooc.pojo.vo.OrderVO;

import java.util.List;

public interface OrderService {
    /**
     * 使用定时任务关闭超期未支付订单，会存在的弊端
     * 1。会有时间差，程序不严谨
     *   10：39下单，11：00检查不足1小时，12：00检查，超过1小时
     * 2。不支持集群（单个节点同时部署多个）
     * @param submitOrderBO
     * @return
     */

    //用于创建订单相关信息
    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    //用于修改订单状态
    public void updateOrderStatus(String orderId,Integer orderSatus);

    //查询订单状态
    public OrderStatus queryOrderStatusInfo(String orderId);

    //关闭超时未支付订单
    public void closeOrder();


}
