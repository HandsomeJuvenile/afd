package com.afd.manager.serviceImpl;

import com.afd.manager.api.SysService;
import com.afd.manager.pojo.po.SysUser;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = SysService.class,interfaceName = "sysService",timeout = 5000)
@Component
public class SysUserServiceImpl implements SysService{

    @Override
    public String sayHello() {
        SysUser user = new SysUser();
        user.setUsername("何伟");
        user.setAddress("北京");
        return user.toString();
    }

}
