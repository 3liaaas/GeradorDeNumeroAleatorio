package br.com.eliasrodrigues;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Diga um número:");
        int num = sc.nextInt();

        int numAleatorio = aleatorio.nextInt(num);
        System.out.println(numAleatorio);
    }

}
