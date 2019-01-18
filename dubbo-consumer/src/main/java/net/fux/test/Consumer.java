package net.fux.test;

import net.fux.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fuxj on 2019/1/18 0018.
 */
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
