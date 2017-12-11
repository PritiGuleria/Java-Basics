package com.priti.exceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by prguleri on 11/4/2017.
 */
public class ChainedExceptions {
    public static void main(String[] args) throws IOException {
        try{try{
            NumberFormatException exception = new NumberFormatException("1st Exception");
            throw exception;

        }
        catch (Exception e){

           throw new SQLException("Other Exception",e);

        }}
        catch (SQLException ex ){
           StackTraceElement[] element = ex.getStackTrace();

           for(StackTraceElement element1 :element){
               System.err.println(element1.getFileName());
               System.err.println(element1.getMethodName());
               System.err.println(element1.getLineNumber());
           }


        }
    }
}


