package cn.ywsj.ywsjmidtier.service.impl;


import cn.ywsj.ywsjmidtier.entity.ProductClassQueryVo;
import cn.ywsj.ywsjmidtier.service.GoodsReceiptAddressFeign;
import feign.Feign;
import feign.gson.GsonDecoder;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : GoodsReceiptAddressService
 * @Author : Lenovo
 * @Date: 2021/7/12 17:07
 * @Description :
 */
public class GoodsReceiptAddressService {

    public Map<String, Object> ajaxGoodsAddressList() {
        GoodsReceiptAddressFeign goodsFeign = Feign.builder().decoder(new GsonDecoder()).target(GoodsReceiptAddressFeign.class,"https://www.uxuan24.com");
        ProductClassQueryVo goodsVo = new ProductClassQueryVo();
        goodsVo.setClassId("100");
        goodsVo.setProductLabelSize(3);
        return goodsFeign.ajaxGoodsAddressList(goodsVo);
    }
}
