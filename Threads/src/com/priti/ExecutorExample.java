package com.priti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by prguleri on 11/9/2017.
 */
public class ExecutorExample {

    static class CallableTsk implements Callable{

        @Override
        public Object call() throws Exception {
            Thread.sleep(2000);
            System.out.println("Doing something"+ Thread.currentThread().getId());
            return "Priti";
        }
    }




    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableTsk c1 = new CallableTsk();
        CallableTsk c2 = new CallableTsk();
        CallableTsk c3 = new CallableTsk();
        CallableTsk c4 = new CallableTsk();
        CallableTsk c5 = new CallableTsk();
        CallableTsk c6 = new CallableTsk();

        List<CallableTsk> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
      ExecutorService service = Executors.newFixedThreadPool(3);

        for(CallableTsk tsk: list){
            Future future =service.submit(tsk);
        }



        service.shutdown();







    }

}
