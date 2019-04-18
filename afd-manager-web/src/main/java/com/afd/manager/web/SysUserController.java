package com.afd.manager.web;

import com.afd.manager.api.SysService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class SysUserController {

    @Reference
    SysService sysService;

    @RequestMapping("hello")
    public String sayHello(){
        return sysService.sayHello();
    }
}
