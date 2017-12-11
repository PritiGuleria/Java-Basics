package com.priti.puzzels;

/**
 * JavaJ2eeStrutsHibernate: “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”.
 */
public class CheckStringRotation {

    public static void main(String[] args) {
        String s = "JavaJ2eeStrutsHibernate";
        String s1 =  "StrutsHibernaetJavaJ2ee";

        if(s.length()!=s1.length()){
            System.out.println("Not a rotation");

        }
        else {
            String s3 = s + s;
            if (s3.contains(s1)) {
                System.out.println("It is a rotation");

            }
            else{
                System.out.println("Not rotated");
            }
        }
    }
}
