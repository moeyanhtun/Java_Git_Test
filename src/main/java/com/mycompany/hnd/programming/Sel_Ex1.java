package com.mycompany.hnd.programming;

import java.util.Scanner;

public class Sel_Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter The Number: ");
        num = input.nextInt();
        if(num > 0 ){
            System.out.println("Num is Positive");
        }
        if(num == 0 ){
            System.out.println("Num is Zero");
        }
        if(num < 0 ){
            System.out.println("Num is Negative");
        }
    }
}