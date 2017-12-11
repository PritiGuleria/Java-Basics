
package com.priti.puzzels;

/**
 * Created by prguleri on 10/31/2017.
 */
public class PreserveSpacePosition {
    public static void main(String[] args) {


        String s ="I   am";

        char[] c = s.toCharArray();
        char[] c1 = new char[c.length];


        for(int i =0;i<c.length;i++){
            if(c[i] == ' '){
                c1[i] =c[i];

            }
        }

        int j = c1.length-1;
        System.out.println(j);

        for(int i =0;i<=c.length-1;i++){

            if(c[i]!=' '){

               while(c1[j] ==' '){
                    System.out.println("I am blank");
                    j--;
                }
                c1[j]=c[i];
                j--;
            }

        }

        for(char s1 :c1){
            System.out.print(s1);
        }
    }
}
