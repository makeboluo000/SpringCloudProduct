package com.imooc.product.service;


import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有上架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 减库存
     *
     * @param cartDTOList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

}
