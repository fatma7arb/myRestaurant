package Maneger;

import java.util.Scanner;

public class NormalBurgerSandwich {

    Scanner sc = new Scanner(System.in);
    protected String name;
    protected double price;
    protected String typeOfMeat;
    protected String typeOfBread;
    protected int extra_cheese;
    protected int extra_tomato;
    protected int chips;
    protected int drink;
    protected double priceOfChips;
    protected double priceOfDrink;
    protected double priceOfCheese;
    protected double priceOfTomato;

    public NormalBurgerSandwich() {
        name = "Normal Burger Sandwich";
        setTypeOfMeat();
        settypeOfRollBread();
        additions();
        priceOfChips = 7.0;
        priceOfDrink = 8.0;
        priceOfCheese = 10.0;
        priceOfTomato = 6.0;
        price = 40.0;
    }

    public NormalBurgerSandwich(String name, String typeOfMeat, String typeOfBread, double price) {
        this.name = name;
        this.price = price;
        this.typeOfMeat = typeOfMeat;
        this.typeOfBread = typeOfBread;
    }

    public double getPriceOfChips() {
        return priceOfChips * chips;
    }

    public void setPriceOfChips(double priceOfChips) {
        this.priceOfChips = priceOfChips;
    }

    public double getPriceOfDrink() {
        return priceOfDrink * drink;
    }

    public void setPriceOfDrink(double priceOfDrink) {
        this.priceOfDrink = priceOfDrink;
    }

    public double getPriceOfCheese() {
        return priceOfCheese * extra_cheese;
    }

    public void setPriceOfCheese(double priceOfCheese) {
        this.priceOfCheese = priceOfCheese;
    }

    public double getPriceOfTomato() {
        return priceOfTomato * extra_tomato;
    }

    public void setPriceOfTomato(double priceOfTomato) {
        this.priceOfTomato = priceOfTomato;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTypeOfMeat() {
        return typeOfMeat;
    }
    public void setTypeOfMeat() {
        System.out.println("Enter Type Of Meat ! \n For Beaf Press 1 \n For Chicken Press 2");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                typeOfMeat = "Beef";
                break;
            case 2: 
                typeOfMeat = "Chicken";
                break;
            default:
                System.out.println("Invalid value of choise");
        }
    }
    public String gettypeOfRollBread() {
        return typeOfBread;
    }
    public void settypeOfRollBread() {
        System.out.println("Enter Type Of RollBread ! \n For White Bread Press 1 \n For Brown Bread Press 2");

        int i = sc.nextInt();
        switch (i) {
            case 1:
                typeOfBread = "White";
                break;
            case 2:
                typeOfBread = "Brown";
                break;
            default:
                System.out.println("Invalid value of choise");
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
      public int getExtra_cheese() {
        return extra_cheese;
    }

    public void setExtra_cheese(int extra_cheese) {
        this.extra_cheese = extra_cheese;
    }
    public int getExtra_tomato() {
        return extra_tomato;
    }

    public void setExtra_tomato(int extra_tomato) {
        this.extra_tomato = extra_tomato;
    }
    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public void setDrink(int drink) {
        this.drink = drink;
    }
   

    public int getDrink() {
        return drink;
    }

    public double gettotalPrice() {
        return (price + getPriceOfChips() + getPriceOfDrink() + getPriceOfCheese() + getPriceOfTomato());
    }

    public void additions() {
        System.out.println("There Are Four Additions !");
        System.out.println("For Extra Cheese press  1 \n To Try Something else Press 2");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("Please Enter How Many Extra Cheese You Want !");
            setExtra_cheese(sc.nextInt());
        }
        System.out.println("For Extra Tomatos press 1 \n To Try Something else Press 2  ");
        i = sc.nextInt();
        if (i == 1) {
            System.out.println("Please Enter How Many  Extra Tomatos You Want ! ");
            setExtra_tomato(sc.nextInt());
        }
        System.out.println("For chips press 1 \n To Try Something else Press 2  ");
        i = sc.nextInt();
        if (i == 1) {
            System.out.println("Please Enter How Many chips You Want ! ");
            setChips(sc.nextInt());
        }
        System.out.println("For Drink press 1 \n To Finish The Order press 2  ");
        i = sc.nextInt();
        if (i == 1) {
            System.out.println("Please Enter How Many Drinks You Want ! ");
            setDrink(sc.nextInt());
        }
    }

    @Override
    public String toString() {
        String h = "\n";

        System.out.println("Your Order is: " + name + ": " + price);
        System.out.println("The Type Of Roll Bread is: " + gettypeOfRollBread());
        System.out.println("The Type Of Meat is: " + getTypeOfMeat());
        if (getExtra_cheese() >= 1) {
            System.out.println(getExtra_cheese() + " Extra Cheese: " + getPriceOfCheese());
        }
        if (getExtra_tomato() >= 1) {
            System.out.println(getExtra_tomato() + " Extra Tomato: " + getPriceOfTomato());
        }
        if (getChips() >= 1) {
            System.out.println(getChips() + " Chips: " + getPriceOfChips());
        }
        if (getDrink() >= 1) {
            System.out.println(getDrink() + " Drinks: " + getPriceOfDrink());
        }
        System.out.println("Your Total Price is : " + gettotalPrice());

        return h;
    }

}
