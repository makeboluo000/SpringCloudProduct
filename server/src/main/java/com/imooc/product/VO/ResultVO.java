package com.imooc.product.VO;

import lombok.Data;


import java.io.Serializable;

/**
 * http 请求返回
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3068837394742385883L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回具体内容
     */
    private T data;

}
