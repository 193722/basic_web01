package cn.xlbweb.web01.controller;

import cn.xlbweb.web01.common.server.ServerResponse;
import cn.xlbweb.web01.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.X
 * @date: 2018/6/11 上午1:36
 * @description:
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Autowired
    private ISysUserService iSysUserService;

    @GetMapping("findOne")
    public ServerResponse findOne(Integer id) {
        return iSysUserService.findOne(id);
    }
}
