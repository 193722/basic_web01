package cn.xlbweb.web01.controller;

import cn.xlbweb.web01.common.server.ResponseCode;
import cn.xlbweb.web01.common.server.ServerResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.X
 * @date: 2018/6/12 下午3:59
 * @description:
 */
@RestController
@RequestMapping("/sys/user")
public class SysLoginController {

    @PostMapping("/login")
    public ServerResponse login(String username, String password) {
        // 校验参数
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return ServerResponse.error(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getMsg());
        }
        // 登陆逻辑
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            subject.login(token);
        } catch (UnknownAccountException e) {
            return ServerResponse.error("账号不存在");
        } catch (IncorrectCredentialsException e) {
            return ServerResponse.error("账号或密码错误");
        }
        return ServerResponse.success("登录成功");
    }
}
