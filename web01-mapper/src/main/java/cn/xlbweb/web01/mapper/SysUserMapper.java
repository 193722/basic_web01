package cn.xlbweb.web01.mapper;

import cn.xlbweb.web01.pojo.SysUser;

/**
 * @author: Mr.X
 * @date: 2018/6/11 上午1:34
 * @description:
 */
public interface SysUserMapper {

    /**
     * 根据userId查询用户信息
     *
     * @param id
     * @return
     */
    SysUser findOne(Integer id);
}
