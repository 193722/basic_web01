package cn.xlbweb.web01.pojo;

import lombok.Data;

/**
 * @author: Mr.X
 * @date: 2018/6/11 上午1:31
 * @description:
 */
@Data
public class SysUser {
    /**
     * ID主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
