package com.roy.restrictFlow;

public class CounterDemo {
    private static long timeStamp = System.currentTimeMillis();
    //限制一秒钟100个请求
    private static long limitCount = 100;
    private static  long interval = 1000;

    private static  long reqCount = 0;
    private static boolean grant(){
        long now = System.currentTimeMillis();
        if (now < timeStamp + interval){
            if (reqCount < limitCount){
                reqCount ++;
                return true;
            } else {
                return false;
            }
        }else {
            timeStamp = System.currentTimeMillis();
            reqCount = 0;
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new Thread(() -> {
                if (grant()){
                    System.out.println("execute work");
                }else {
                    System.out.println("limit....");
                }
            }).start();
        }
    }

}
