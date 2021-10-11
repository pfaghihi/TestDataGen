package com.companyname.com;

import java.util.Random;

public class TestData {

    // Open file to write
    public void writeData(String filename, String data, int numOfRecords){
        OpenFile fileOpen = new OpenFile();
        String dataFormat = generateData(data, numOfRecords);
        fileOpen.openFileToWrite(filename, dataFormat);
   }

    // generate Data
    public String generateData(String data, int numOfRecords){
            StringBuilder line = new StringBuilder();
            for (int i =0; i <= numOfRecords; i++) {
                String dataGen = randomUser(data);
                line.append(dataGen + ",");
            }
            return line.toString();

    }

    // Random User
    public String randomUser(String data){

        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        System.out.println(data + randomNum);
        return (data + randomNum);


    }

}
