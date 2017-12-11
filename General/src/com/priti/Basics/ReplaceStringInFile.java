package com.priti.Basics;

import java.io.*;

/**
 * Created by prguleri on 10/4/2017.
 */
public class ReplaceStringInFile {

    public static void modifyFile(String path,String old,String chng){
        File modifiedFile = new File(path);
        String oldContent="";
        BufferedReader reader = null;
        FileWriter writer =null;

        try{
            reader = new BufferedReader(new FileReader(modifiedFile));
            String line = reader.readLine();

            while(line !=null){
                oldContent= oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(old,chng);
            writer = new FileWriter(modifiedFile);
            writer.write(newContent);
        }
        catch (Exception e){
             e.printStackTrace();
        }
        finally {
            try
            {
                //Closing the resources
                reader.close();

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        modifyFile("MyFile.txt","85","95");
    }
}
