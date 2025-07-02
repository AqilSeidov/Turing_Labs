package turing;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Output Reng
        String BLUE = "\u001B[34m";

        Random rand = new Random();
        String[] names = {"Huseyn","Aqil","Emin","Sədulla",
                        "Ramzi","Ebulfez","Saleh","Trual",
                        "Yusif","Ayla","Sevinc","Orkhan",
                        "Ulvi","Ays","Assassin"};

        int[] orders = new int[15];
        int index = 0;

        while (index<15){
            int random = rand.nextInt(1,16);

            if(unique(random,orders)){
                orders[index] = random;
                index++;
            }
        }

        //Output
        for (int i = 0; i < orders.length; i++) {
            System.out.printf(BLUE + "%s --> Order: %d\n", names[i], orders[i]);
        }
    }

    public static boolean unique(int n,int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                return false;
            }
        }
        return true;
    }

}