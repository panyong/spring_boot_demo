package com.rambo.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * User: za-panyong
 * Date: 2018/9/18
 * Time: 17:49
 * @author panyong
 */

@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;
    @Value("${server.port}")
    private static Integer b;
    @Value("${rambo.ra}")
    private Integer randomInteger;

    @Autowired
    private Demo demo;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        System.out.println("port:"+port);
        System.out.println("static port"+b);
        System.out.println("random int"+ randomInteger);
        System.out.println(demo.toString());

        throw new RuntimeException();
//        return demo.toString();
    }
}
