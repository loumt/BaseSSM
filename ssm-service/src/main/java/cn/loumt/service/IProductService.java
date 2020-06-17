package cn.loumt.service;

import cn.loumt.domain.Product;

import java.util.List;

/**
 * @Classname IProductService
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/6/18 1:31
 */
public interface IProductService {
    List<Product> findAll()throws Exception;
}
