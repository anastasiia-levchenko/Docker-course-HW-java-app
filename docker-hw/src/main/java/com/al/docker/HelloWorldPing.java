package com.al.docker;

public class HelloWorldPing {

    public static void main(String args[]) throws Exception{
        for(int i = 0 ; i < 200; i++){
            System.out.println("Updated App Ping " + i );
            Thread.sleep(1000);
        }
    }
}
