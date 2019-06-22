package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    //@RequestBody：请求body中的参数
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("hdb".equals(employee.getUsername())&&"hdb123".equals(employee.getPassword())){
            return AjaxResult.me().setObject(null);
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }

    }

    @RequestMapping(value = "/log",method = RequestMethod.GET)
    public AjaxResult login1(){
       return AjaxResult.me();

    }
}
