package cn.xlbweb.web01.controller;

import cn.xlbweb.web01.common.server.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.X
 * @date: 2018/6/10 下午3:29
 * @description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/abc")
    public ServerResponse abc() {
        return ServerResponse.success("abc");
    }

    @GetMapping("/exception")
    public ServerResponse exceptionTest() {
        int a = 10 / 0;
        return ServerResponse.success("abc");
    }
}
