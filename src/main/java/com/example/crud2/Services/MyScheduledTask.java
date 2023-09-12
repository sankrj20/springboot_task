package com.example.crud2.Services;

import com.example.crud2.Entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class MyScheduledTask {

    private final MyServices myServices;

    @Autowired
    public MyScheduledTask(MyServices myServices) {
        this.myServices = myServices;
    }

    @Scheduled(cron = "0 34 18 * * ?")
    public void retrieveAllUsers() {

        List<MyEntity> userList = myServices.findAllUsers();
        System.out.println(userList);

    }
}