package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "mass.txt";
        File file = new File(path);

        if(file.exists())
        {
        System.out.println("File exists");
        }
        else
        {
            System.out.println("File created");
        }

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int  a = 0;
        String i;
        while ((i = bufferedReader.readLine()) != null)
        {
            if(Integer.parseInt(i) % 2 != 0)
            {
                a++;
            }
        }

        System.out.println(a);




    }
}
