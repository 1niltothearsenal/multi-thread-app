package com.gooner.threadclass;

import static com.gooner.util.ThreadColor.ANSI_BLUE;
import static com.gooner.util.ThreadColor.ANSI_PURPLE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Hello from " + currentThread().getName());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_PURPLE + "Another thread woke me up.");
            //return immediately terminates another thread instance
            return;
        }

        System.out.println(ANSI_PURPLE+"Three seconds have passed and I'm awake.");
    }

}
