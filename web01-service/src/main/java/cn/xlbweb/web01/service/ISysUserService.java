package cn.xlbweb.web01.service;

import cn.xlbweb.web01.common.server.ServerResponse;
import cn.xlbweb.web01.pojo.SysUser;

/**
 * @author: Mr.X
 * @date: 2018/6/11 上午1:38
 * @description:
 */
public interface ISysUserService {

    /**
     * 根据userId查询用户信息
     *
     * @param id
     * @return
     */
    ServerResponse findOne(Integer id);

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    SysUser findByUsername(String username);
}
