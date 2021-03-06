package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author Yaozheng Wang
 * @email Wang-yaozheng@outlook.com
 * @date 2022-04-12 23:31:56
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

