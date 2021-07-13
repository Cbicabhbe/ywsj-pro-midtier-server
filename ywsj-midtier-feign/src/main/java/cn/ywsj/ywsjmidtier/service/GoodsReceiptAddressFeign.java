package cn.ywsj.ywsjmidtier.service;


import cn.ywsj.ywsjmidtier.entity.ProductClassQueryVo;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : GoodReciptAddressFeign
 * @Author : Lenovo
 * @Date: 2021/7/12 16:52
 * @Description :
 */
public interface GoodsReceiptAddressFeign {
    @RequestLine("GET /wechat/productclassmgr/ajaxgetproductclasslist")
    Map<String, Object> ajaxGoodsAddressList(@QueryMap ProductClassQueryVo productClassQueryVo);
}
