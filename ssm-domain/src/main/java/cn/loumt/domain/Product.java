package cn.loumt.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Classname Product
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/6/18 1:28
 */
@Getter
@Setter
@ToString
public class Product {
    private Long id;
    private String productNum; //产品编号
    private String productName; //产品名
    private String cityName; //出发城市
    private Date departureTime; //出发时间
    private Double productPrice;//产品价格
    private String productDesc; //产品描述
    private Integer productStatus; //状态 0关闭 1开启
}
