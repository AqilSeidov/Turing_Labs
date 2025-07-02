package turing;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            String whiteSpace=" ".repeat(num - i);
            String stars = "*".repeat(2*i-1);
            System.out.println(whiteSpace+stars);
        }

        for (int i = num-1; i >=1; i--) {
            String whiteSpace=" ".repeat(num - i);
            String stars = "*".repeat(2*i-1);
            System.out.println(whiteSpace+stars);
        }

        //Yadaki basqa yolda var
        for (int i = 1; i <= num; i++) {
            for(int j = num-i ; j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num-1 ; i>0;i--){
            for(int j = num-i; j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}