package com.example.cmarket;
import com.example.cmarket.singleton.SingletonService;
import com.example.cmarket.user.UserService;

public class SingletonApp {
    static AppConfig appConfig = new AppConfig();
    static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();

    public static void main(String[] args){
        System.out.println("singletonService1 : " + singletonService1 );
        System.out.println("singletonService2 : " + singletonService2 );
    }
}
