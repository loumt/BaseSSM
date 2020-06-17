package cn.loumt.common.enums;

/**
 * @Classname ProductStatus
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description 商品状态
 * @Date 2020/6/18 1:34
 */
public enum ProductStatus {
    IN(1,"入库"),
    OUT(2, "出库");

    private Integer num;
    private String desc;

    ProductStatus(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }
}
