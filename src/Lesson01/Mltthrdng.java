package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calc extends Thread{

    int n;

    public Calc(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        double result = 1;

        for (int i =2; i<n ; i++){

            result *=i;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}

public class Mltthrdng {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


for (int i = 0; i <= 10; i++) {
    System.out.println("Enter number");
    int n = Integer.parseInt(reader.readLine());

        }
    }

}