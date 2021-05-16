package Maneger;

public class DeluxeBurger extends NormalBurgerSandwich {

    public DeluxeBurger() {
        super("DeluxeBurger", "Beef", "White", 45);
        setChips(1);
        setDrink(1);
        setPriceOfChips(7);
        setPriceOfDrink(8);
    }

    @Override
    public void setTypeOfMeat() {
        typeOfMeat = "Beef";
    }

    @Override
    public void settypeOfRollBread() {
        typeOfBread = "White";
    }

    @Override
    public void setExtra_cheese(int extra_cheese) {
        System.out.println("Sorry you can take onley chips or drink");
        this.extra_cheese = 0;
    }

    @Override
    public void setExtra_tomato(int extra_tomato) {
        System.out.println("Sorry you can take onley chips or drink");
        this.extra_tomato = 0;
    }

    @Override
    public double gettotalPrice() {
        return price + getPriceOfChips()+ getPriceOfDrink();
    }
    @Override
    public void additions() {
         System.out.println("There Are Four Additions !");
        System.out.println("For chips press 1 \n To Try Something else Press 2  ");
        int z = sc.nextInt();
        if (z == 1) {
            System.out.println("Please Enter How Many chips You Want ! ");
            setChips(sc.nextInt());
        }
        System.out.println("For Drink press 1 \n To Finish The Order press 2  ");
        z = sc.nextInt();
        if (z == 1) {
            System.out.println("Please Enter How Many Drinks You Want ! ");
            setDrink(sc.nextInt());
        }}

}
