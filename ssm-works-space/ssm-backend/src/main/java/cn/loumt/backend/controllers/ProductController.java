package cn.loumt.backend.controllers;

import cn.loumt.domain.Product;
import cn.loumt.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname ProductController
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/6/18 1:29
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource
    private IProductService productService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findAll() {
        System.out.println("Find All");

        System.out.println(productService);
        List<Product> all = null;
        try {
            all = productService.findAll();
        } catch (Exception e) {
            System.out.println(e);
        }
        for (Product product: all){
            System.out.println(product);
        }
        System.out.println("Find All End");

        Map<String,Object> result = new HashMap<>();
        result.put("list", all);
        return result;
    }

}