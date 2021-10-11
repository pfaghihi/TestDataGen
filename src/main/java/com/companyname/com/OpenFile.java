package com.companyname.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OpenFile {
    public void openFileToWrite(String filename, String data){
        System.out.println("Open File");
        File file = new File("C:\\Users\\pedra\\Desktop\\workspace\\Java\\JavaProjects\\" + filename);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
