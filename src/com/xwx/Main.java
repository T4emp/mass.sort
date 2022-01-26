package com.xwx;
import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("mass.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader((file)));
        int[] mass = new int[42];
        int m = 0;
        String str;
        while((str = bufferedReader.readLine()) != null)
        {
            mass[m] = Integer.parseInt(str);
            m++;
        }
        Arrays.sort(mass);
        for(int i = 0; i < mass.length; i++)
        {
            System.out.println("["+i+"] - " + mass[i]);
        }
    }
}