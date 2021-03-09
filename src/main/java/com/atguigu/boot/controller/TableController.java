package com.atguigu.boot.controller;

import com.atguigu.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhanghao
 * @date 2021/3/9 15:33
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic(){

        return "/table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic(Model model){

        List<User> users = Arrays.asList(new User("zs", "aaaaaa"),
                new User("lisi", "bbbbbb"),
                new User("ws", "ccccccc"),
                new User("fds", "dddddd"),
                new User("gdfsd", "fdhgf"));

        model.addAttribute("users", users);
        return "/table/dynamic_table";
    }

    @GetMapping(value = "/editable_table")
    public String editable(){

        return "/table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing(){

        return "/table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive(){

        return "/table/responsive_table";
    }
}
