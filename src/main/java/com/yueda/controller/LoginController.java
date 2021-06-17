package com.yueda.controller;


import com.alibaba.fastjson.JSON;
import com.yueda.entity.UserInfo;
import com.yueda.entity.vo.Back;
import com.yueda.entity.vo.Data;
import org.springframework.web.bind.annotation.*;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2021/6/17 00:00
 */
@RestController
@RequestMapping("/api/")
public class LoginController {

    @PostMapping("user/login")
    public String login(@RequestBody UserInfo userInfo) {
        System.out.println("userInfo = " + userInfo);

        Data  data = new Data();
        data.setToken("admin-token");
        Back b = new Back();
        b.setCode(20000);
        b.setData(data);
        String jsonStr = JSON.toJSONString(b);
        System.out.println("jsonObject = " + jsonStr);

        System.out.println("b = " + b);
        // {"code":20000,"data":{"token":"admin-token"}}
        return jsonStr;

    }

    @GetMapping("user/info")
    public String getToken(@RequestParam("token") String token) {
        String s = "{\"code\":20000,\"data\":{\"roles\":[\"admin\"],\"introduction\":\"I am a super administrator\",\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\",\"name\":\"Super Admin\"}}";
        return s;
    }

}
