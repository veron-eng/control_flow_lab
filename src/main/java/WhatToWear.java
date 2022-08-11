import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {

        System.out.println("Enter the weather (Rain,Sun,Snow,Cloudy)");

        Scanner weather = new Scanner(System.in);

        String w = weather.nextLine();

        System.out.println("Enter the average temperature (0-30)");

        Scanner temperature = new Scanner(System.in);

        String t =  temperature.nextLine();

        int temp = Integer.parseInt(t);

        if (w == "Snow"|| temp < 12) {
            System.out.println("Suggest you wear a water proof winter coat ");
        } else if (w == "Rain" || w == "Cloudy" || 12 < temp && temp < 18) {
            System.out.println("Suggest you wear a rain coat");
        } else {
            System.out.println("No need to wear a coat");
        }





    }

}
