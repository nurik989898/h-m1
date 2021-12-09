package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	double[] book ={23, -3, 1, -7, 11, -34, 43, -73, 3, 0, 1, 33, 56, -99, 31};
        System.out.println(Arrays.toString(book));
        double sum = 0;
        int col = 0;
        boolean otr = false;
        for (double no: book) {
            if (no < 0) {
                otr = true;
            }
        else if (otr){col++;
        sum += no;}
        }
        System.out.println("Sred orif: " + sum / col);
        sortirovka();
    }

    public static void sortirovka(){
        double[] hak ={24, 56, 78, 9, -10};
        for (int i = 0; i < hak.length; i++) {
            System.out.print(hak[i] + " ");
        }
        System.out.print("sortirovka\n");
        Arrays.sort(hak);
        for (int i = 0; i < hak.length; i++) {
            System.out.print(hak[i] + " ");


        }
    }
}
