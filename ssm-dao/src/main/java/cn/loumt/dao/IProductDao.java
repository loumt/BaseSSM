package cn.loumt.dao;

import cn.loumt.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname IProductDao
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/6/17 13:26
 */
@Repository
public interface IProductDao {
    List<Product> findAll() throws Exception;
}
