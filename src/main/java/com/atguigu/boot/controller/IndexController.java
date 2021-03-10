package com.atguigu.boot.controller;

import com.atguigu.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author zhanghao
 * @date 2021/3/9 13:53
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {

        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {

        if (StringUtils.hasText(user.getUserName()) && "123456".equals(user.getPassword())) {

            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名密码错误");
            return "/login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        return "main";
    }

}
