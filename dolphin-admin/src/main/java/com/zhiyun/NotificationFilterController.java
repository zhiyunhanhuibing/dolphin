package com.zhiyun;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationFilterController {


    @RequestMapping("notifications/filters")
    public void notificationFile(){
        System.out.println("NotificationFilterController.notificationFile ===== =======");
    }
}
