package cn.ywsj.ywsjmidtier.common;

import lombok.Data;

/**
 * @ClassName : YesResponse
 * @Author : Lenovo
 * @Date: 2021/7/12 16:45
 * @Description :
 */
@Data
public class YesResponse<T> {
        private Integer ret;
        private String msg;
        private T data;
}
