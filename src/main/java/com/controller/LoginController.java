package com.controller;

import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping(value="/login")
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/userlogin")
    public ModelAndView userlogin(ModelAndView mv, HttpServletRequest req, HttpServletResponse res){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+" "+password);
        mv.setViewName("/index");
        return mv;
    }
}
