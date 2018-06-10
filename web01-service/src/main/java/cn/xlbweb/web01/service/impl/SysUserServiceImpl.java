package cn.xlbweb.web01.service.impl;

import cn.xlbweb.web01.common.server.ServerResponse;
import cn.xlbweb.web01.mapper.SysUserMapper;
import cn.xlbweb.web01.pojo.SysUser;
import cn.xlbweb.web01.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mr.X
 * @date: 2018/6/11 上午1:39
 * @description:
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public ServerResponse findOne(Integer id) {
        SysUser sysUser = sysUserMapper.findOne(id);
        if (sysUser != null) {
            return ServerResponse.success("查询成功", sysUser);
        }
        return ServerResponse.error("无数据");
    }
}
