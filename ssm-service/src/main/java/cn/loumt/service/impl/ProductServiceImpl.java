package cn.loumt.service.impl;

import cn.loumt.dao.IProductDao;
import cn.loumt.domain.Product;
import cn.loumt.service.IProductService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname ProductServiceImpl
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/6/18 1:31
 */
@Service
public class ProductServiceImpl implements IProductService {

    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
