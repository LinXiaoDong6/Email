package com.emall.dao;

import com.emall.pojo.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/27.
 */
public class ProductMapperTest {

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductMapper productMapper = app.getBean(ProductMapper.class);
        Product product = new Product();

       product= productMapper.selectByPrimaryKey(26);
        System.err.println(product.getName());
    }
}