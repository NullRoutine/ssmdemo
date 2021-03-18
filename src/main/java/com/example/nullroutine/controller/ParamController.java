package com.example.nullroutine.controller;

import com.example.nullroutine.entity.Account;
import com.example.nullroutine.entity.User;
import com.example.nullroutine.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String userName, String passWord) {
        System.out.println(userName + "====" + passWord);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("===========>" + account);
        return "success";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User account) {
        System.out.println("===========>" + account);
        return "success";
    }

    /**
     * 原生的API
     *
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行了...");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }

    @RequestMapping("/testException")
    public String testException() throws SysException{
        System.out.println("testException开始执行");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("测试testException出错了");
        }
        return "success";
    }
}
