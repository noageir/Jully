package com.july.springboot.web;

import com.july.springboot.util.back.ReturnJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
@RestController
@RequestMapping("/hello")
@Api(description = "测试")
public class HelloRest {

    @GetMapping("/hello")
    @ApiOperation(value = "测试", notes = "测试", response = String.class)
    public ReturnJson sendMsg() throws Exception {
        return ReturnJson.success("Hello World!!!");
    }

}
