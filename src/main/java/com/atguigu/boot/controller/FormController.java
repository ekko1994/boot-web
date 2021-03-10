package com.atguigu.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhanghao
 * @date 2021/3/10 13:14
 */
@Slf4j
@Controller
public class FormController {

    @GetMapping("/form_layouts")
    public String form_layouts() {

        return "form/form_layouts";
    }


    @GetMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("userName") String userName,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) {
        log.info("测试上传文件请求email={},userName={},headerImg={},photos={}", email, userName, headerImg, photos);

        return "main";
    }
}
