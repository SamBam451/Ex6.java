package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean a = true;
        String doub;
        String stri;
        String num;
        String inputs;
        while (a) {
            System.out.println("Enter a double:");
            doub = input.nextLine();
            DoubleCheck(doub);

            System.out.println("Enter a integer:");
            num = input.nextLine();
            IntCheck(num);

            System.out.println("Enter a string:");
            stri = input.nextLine();
            StringCheck(stri);

            System.out.println("Exit? Y/N");
            inputs = input.nextLine();
            if(inputs.equals("Y") || inputs.equals("y")){
                a = false;
            }
        }
    }

    static void DoubleCheck(String doub) {
        boolean b = true;
        while (b) {
            try {
                double doubl = Double.parseDouble(doub);
                if(doubl % 1 == 0){
                    System.out.println(doub + " is not a double!");
                    System.out.println("Enter a double:");
                    doub = input.nextLine();
                }else{
                System.out.println(doubl + " is a double!");
                b = false;
                }
            }catch (Exception e) {
                System.out.println(doub + " is not a double");
                System.out.println("Enter a double:");
                doub = input.nextLine();
            }
        }
    }

    static void IntCheck(String num) {
        boolean c = true;
        while (c) {
            try {
                int numb = Integer.parseInt(num);
                System.out.println(numb + " is a Integer!");
                c = false;
            } catch (Exception e) {
                System.out.println(num + " is not a integer");
                System.out.println("Enter a integer:");
                num = input.nextLine();
            }
        }
    }

    static void StringCheck(String stri) {
        boolean d = true;
        boolean a1 = false;
        boolean a2 = false;
        while(d){
            try {
                try {
                    double doubl = Double.parseDouble(stri);
                    System.out.println("Input is not a string");
                    System.out.println("Enter a string:");
                    stri = input.nextLine();
                    a1 = false;
                    a2 = false;
                }catch(Exception ignored){
                    a1 = true;
                }
                try {
                    int numb = Integer.parseInt(stri);
                    System.out.println("Input is not a string");
                    System.out.println("Enter a string:");
                    stri = input.nextLine();
                    a1 = false;
                    a2 = false;
                }catch(Exception ignored){
                    a2 = true;
                }
            } catch (Exception ignored) {}
            if(a1 && a2){
                System.out.println(stri + " is a string!");
                d = false;
                a1 = false;
                a2 = false;
            }
        }
    }
}
