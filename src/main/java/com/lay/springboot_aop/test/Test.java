package com.lay.springboot_aop.test;

import com.lay.springboot_aop.intercept.impl.MyInterceptor;
import com.lay.springboot_aop.proxy.ProxyBean;
import com.lay.springboot_aop.service.HelloService;
import com.lay.springboot_aop.service.impl.HelloServiceImpl;

public class Test {
    
    public static void main(String[] args) {
        testProxy();
    }
    private static void testProxy() {
        HelloService helloService=new HelloServiceImpl();
        //按照约定获取proxy
        HelloService proxy=(HelloService)ProxyBean.getProxyBean(helloService,new MyInterceptor());
        proxy.sayHello("Lay");
        System.out.println("\n################ name is null!##########################\n");
        proxy.sayHello(null);
    }
}
