package com.mayikt.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2021/1/23.
 */

@Component
public class ScheduledTask {

    @Scheduled(cron = "0 0 0/1 * * ?")
    public void ScheduledTask(){
        System.out.println("定时任务");
    }
}
