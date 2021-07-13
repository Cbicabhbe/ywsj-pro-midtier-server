package cn.ywsj.ywsjmidtier.entity.VO;

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
public class GoodsReceiptAddressQueryVo {
    private static final long serialVersionUID = 1552691743279013981L;

    private String addressId;

    private String consignee;

    private String startDate;

    private String endDate;

    private String status;

    private String custName;

    private Long custId;

    private String sysId;

    private String searchWord;

    private Long userId;

    private String phone;

    private Long buyCustId;

    private Integer removeTag;
}
