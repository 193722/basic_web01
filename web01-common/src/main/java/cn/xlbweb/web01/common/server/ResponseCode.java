package cn.xlbweb.web01.common.server;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Mr.X
 * @date: 2018/6/10 下午3:34
 * @description:
 */
@Getter
@AllArgsConstructor
public enum ResponseCode {

    SUCCESS(0, "成功"),
    ERROR(1, "失败"),
    ILLEGAL_ARGUMENT(2, "参数错误");

    private final int code;
    private final String msg;
}
