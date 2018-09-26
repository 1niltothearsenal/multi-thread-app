package com.gooner.threadclass;

import static com.gooner.util.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnable's implementation of run.");
    }
}
