package com.priti;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by prguleri on 12/5/2017.
 */
public class ExecutorInvokeAny {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable<String>> list = new LinkedList<>();

        list.add(new Callable() {
            @Override
            public Object call() throws Exception {
                return "1";
            }
        });
        list.add(new Callable() {
            @Override
            public Object call() throws Exception {
                return "2";
            }
        });
        list.add(new Callable() {
            @Override
            public Object call() throws Exception {
                return "3";
            }
        });

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        String t = executorService.invokeAny(list);
        System.out.println(t);

        executorService.shutdown();

    }
}
