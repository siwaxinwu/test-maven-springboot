package com.roy.restrictFlow;

/**
 * https://mp.weixin.qq.com/s/tX8htuPsAE4KXsMV8S-dQQ
 */
public class TokenBucketDemo {

    private static long time = System.currentTimeMillis();
    private static int size = 10;
    private static int tokens = 0;
    private static int createTokenRate = 3;

    private static boolean grant1(){
        long now = System.currentTimeMillis();
        int in = (int) (now - time)/50*createTokenRate;
        tokens = Math.min(size, tokens + in);
        time = now;
        if (tokens > 0){
            tokens --;
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new Thread(() -> {
                if (grant1()){
                    System.out.println("execute work");
                }else {
                    System.out.println("limit....");
                }
            }).start();
        }
    }

}
