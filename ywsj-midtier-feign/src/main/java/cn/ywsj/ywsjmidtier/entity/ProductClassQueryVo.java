package cn.ywsj.ywsjmidtier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : GoodsReceiptAddressVo
 * @Author : Lenovo
 * @Date: 2021/7/12 16:25
 * @Description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductClassQueryVo {
    private static final long serialVersionUID = 3619888545557266048L;

    private Long id;

    private String classId;

    private String subClassId;

    private String className;

    private Double commissionRatio;

    private Integer length;

    private String sysId;

    private Long custId;

    private Integer classType;

    private String[] classTypes;

    private Integer productLabelSize;
}
