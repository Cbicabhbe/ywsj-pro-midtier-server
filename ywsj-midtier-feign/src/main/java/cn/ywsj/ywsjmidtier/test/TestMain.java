package cn.ywsj.ywsjmidtier.test;


import cn.ywsj.ywsjmidtier.entity.ProductClassQueryVo;
import cn.ywsj.ywsjmidtier.service.impl.GoodsReceiptAddressService;
import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : TestMain
 * @Author : Lenovo
 * @Date: 2021/7/12 17:26
 * @Description :
 */
public class TestMain {
    public static void main(String[] args) {
        GoodsReceiptAddressService goodsService = new GoodsReceiptAddressService();
        Map<String, Object> yesUniversityYesResponse = goodsService.ajaxGoodsAddressList();
        System.out.println(JSON.toJSONString(yesUniversityYesResponse));
    }
}
