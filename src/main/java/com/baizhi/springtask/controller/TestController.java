package com.baizhi.springtask.controller;

import com.baizhi.springtask.task.ControllerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private ControllerTask controllerTask;

    @RequestMapping("test")
    public String test() {
        controllerTask.run();
        System.out.println("111");
        return "OK";
    }
}
