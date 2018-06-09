package Factorial;

import java.util.Scanner;

public class Main {

    static int silnia(int a){
        if (a == 1)
            return a;

        return a * silnia(a-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Wpisz liczbe: ");
        int i = s.nextInt();
        System.out.println( i + "! = " + silnia(i));
    }
}
