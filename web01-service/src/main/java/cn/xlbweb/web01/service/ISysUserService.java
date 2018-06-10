package cn.xlbweb.web01.service;

import cn.xlbweb.web01.common.server.ServerResponse;

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
}
