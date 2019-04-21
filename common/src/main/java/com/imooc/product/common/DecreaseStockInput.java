package com.imooc.product.common;

import lombok.Data;

@Data
public class DecreaseStockInput {
    // 商品id
    private String productId;

    // 数量
    private Integer productQuantity;

    // 防止@Data 远程调用序列化失败
    public DecreaseStockInput(){}

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
