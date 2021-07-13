package cn.ywsj.ywsjmidtier.common;

import cn.ywsj.ywsjmidtier.entity.VO.GoodsReceiptAddressQueryVo;
import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : YesUniversity
 * @Author : Lenovo
 * @Date: 2021/7/12 16:46
 * @Description :
 */
@Data
public class YesUniversity {
    private String err_code;
    private String err_msg;
    private Map<String, Object> goodsVos;
}
