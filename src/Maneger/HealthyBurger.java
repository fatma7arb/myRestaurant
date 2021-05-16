package Maneger;

public class HealthyBurger extends NormalBurgerSandwich {
    
public HealthyBurger(){
name ="Healthy Burger Sandwich";
price = 65.0;
}
    public HealthyBurger(String typeOfMeat, double price) {
        super("HealthyBurger", typeOfMeat, "Brown", price);
    }

    @Override
    public void settypeOfRollBread() {
        typeOfBread = "Brown";
    }

    @Override
    public void setChips(int chips) {
        System.out.println("Sorry you can take onley extra_cheese or extra_tomato");
        this.chips = 0;
    }
    @Override
  public void setDrink(int drink) {
         System.out.println("Sorry you can take onley extra_cheese or extra_tomato");
        this.drink = 0;
    }
  @Override
    public double gettotalPrice() {
        return  (getPrice() + getPriceOfChips()+ getPriceOfDrink()+getPriceOfCheese()+ getPriceOfTomato());
    }
@Override
   public void additions() {
          System.out.println("There Are Two Additions !");
        System.out.println("For Extra Cheese press  1 \n To Try Something else Press 2");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("Please Enter How Many Extra Cheese You Want ");
            setExtra_cheese(sc.nextInt());
        }
        System.out.println("For Extra Tomatos press 1 \n To Finish The Order press 2  ");
         i= sc.nextInt();
        if (i == 1) {
            System.out.println("Please Enter How Many Extra Tomatos You Want ");
            setExtra_tomato(sc.nextInt());
        }
   }
}
