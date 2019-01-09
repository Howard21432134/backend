package com.example.wxserver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
//hhh
@Controller
public class testService {

    @PostMapping(value="/test")
    @ResponseBody
    public HashMap<String,Integer> t(){
        HashMap<String,Integer> res = new HashMap<String, Integer>();
        res.put("1",2);
        return res;
    }

    @GetMapping(value="/test2")
    @ResponseBody
    public HashMap<String,Integer> t2(){
        HashMap<String,Integer> res = new HashMap<String, Integer>();
        res.put("1",2);
        return res;
    }
}
