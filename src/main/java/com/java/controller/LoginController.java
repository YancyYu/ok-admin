package com.java.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String toLogin(HttpServletRequest request, Model model){
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception = (String) request.getAttribute("shiroLoginFailure");
        String msg = "";
        if (exception != null) {
            if (UnknownAccountException.class.getName().equals(exception)) {
                msg = "账号或密码不正确";
            } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
                msg = "账号或密码不正确";
            } else if ("kaptchaValidateFailed".equals(exception)) {
                msg = "kaptchaValidateFailed -- > 验证码错误";
            } else {
                msg = "系统错误"+exception;
                System.out.println("else -- >" + exception);
            }
            model.addAttribute("msg",msg);
        }
        // 此方法不处理登录成功,由shiro进行处理
        return "admin/login";
    }


}
