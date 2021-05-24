import java.util.Scanner;

public class Menu {


    public void showMenu() {
        System.out.println("--- Here is your Menu ----- ");
        System.out.println("1: Bread\n2: Cheese \n3: Toppings\n4: Veggies\n5: None ");
    }


    public INGREDIENTS_TYPE getChoice() {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1: return INGREDIENTS_TYPE.BREAD;
            case 2: return INGREDIENTS_TYPE.CHEESE;
            case 3: return INGREDIENTS_TYPE.TOPPING;
            case 4: return INGREDIENTS_TYPE.VEGGIES;
            default: return INGREDIENTS_TYPE.NONE;
        }
    }
}
