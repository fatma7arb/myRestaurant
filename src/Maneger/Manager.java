package Maneger;

import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("There Are Three Type Of Burger. \n For Normal Burger Sandwich Press 1 "
                + "\n For Healthy Burger Sandwich Press 2 \n For Deluxe Burger Sandwich Press 3");
        System.out.println("Enter Number");
        int g = sc.nextInt();
        switch (g) {
            case 1:
                NormalBurgerSandwich n = new NormalBurgerSandwich();
                System.out.println(n.toString());
                break;
            case 2:
                HealthyBurger h = new HealthyBurger();
                System.out.println(h.toString());
                break;
            case 3:
                DeluxeBurger d = new DeluxeBurger();
                System.out.println(d.toString());
                break;
        }

    }

}
