package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zhanghao
 * @date 2021/3/9 14:02
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;
    private String password;

}
