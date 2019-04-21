package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductIdIn() {
        //
        List<String> productIdList = new ArrayList<>();
        productIdList.add("157875196366160022");
        productIdList.add("157875227953464068");

        List<ProductInfo> list = repository.findByProductIdIn(productIdList);
        Assert.assertTrue(list.size() > 0);


    }

}