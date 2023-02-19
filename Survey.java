import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        //This is a java library for accepting input//
        Scanner scanner = new Scanner(System.in);   
        int counter = 0;

        System.out.println("What is your name?");
        String name = scanner.nextLine();   //This tells the program to wait until data is input
        counter ++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();  //The input data will be stored in the var
        counter ++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter ++;


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter ++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount= scanner.nextInt();
        counter ++;

        double totalCoffee = (coffeePrice*coffeeAmount);
        double totalFood = (foodPrice*foodAmount);

        //You must close when you are done with scanner or you wil get a resource leak error
        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.printf("Thank you %s for answering all %s questions\n", name, counter);
        System.out.printf("Weekly, you spend $%s on coffee\n", totalCoffee);
        System.out.printf("Weekly, you spend $%s on food", totalFood );

    }
}
