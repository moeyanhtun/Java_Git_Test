package com.mycompany.hnd.programming;

import java.util.Scanner;

public class Sel_Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Password;
        String VPassword = "moeyanhtun@123";
        System.out.println("Enter the Password");
        Password = input.next();
        if(Password.equals(VPassword)){
            System.out.println("Correct Password");
        }else{
            System.out.println("Incorrect Password");
        }

    }
}
