package com.demo.DemoApplication.Controller;

import com.demo.DemoApplication.Model.DemoModelTS;
import com.demo.DemoApplication.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("time")
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("/post")
    String create(DemoModelTS demoModelTS){
        return demoService.create();
    }
}
