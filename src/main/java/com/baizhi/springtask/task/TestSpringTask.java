/*
package com.baizhi.springtask.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async
public class TestSpringTask {

    @Scheduled(fixedDelay = 3000)
    public void task1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        //fixedDelay :当定时任务执行完毕开始计时
        Thread.sleep(5000);
        System.out.println("task1"+new Date());
    }

     @Scheduled(fixedRate = 3000)
    public void task2() throws InterruptedException {
        Thread.sleep(5000);
        //fixedRate :当定时任务开启时计时
        System.out.println(Thread.currentThread().getName());
        System.out.println("task2"+new Date());
    }
}
*/
