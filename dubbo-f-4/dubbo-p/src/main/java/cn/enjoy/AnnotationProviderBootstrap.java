package cn.enjoy;

import cn.enjoy.config.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

public class AnnotationProviderBootstrap {
    public static void main(String[] args) throws Exception {
//        new EmbeddedZooKeeper(2181, false).start();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        System.out.println("dubbo service started.");
        new CountDownLatch(1).await();
    }
}
