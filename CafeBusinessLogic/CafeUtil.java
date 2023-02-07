import java.util.ArrayList;

public class CafeUtil {




    public int getStreakGoal() {
        int sum = 0;
        for(int i = 0; i < 11; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double totalPrice = 0;
        for(int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
            //System.out.println(totalPrice);
        }
        return totalPrice;
    }

    public void displayMenu (ArrayList<String> menuItems) {
        // ArrayList<String> itemsMenu = new ArrayList<String>();
        
        for(int i = 0; i < menuItems.size(); i++) {

            System.out.println( i +  " " + menuItems.get(i));
        }

    }

    public void addCustomer(ArrayList<String> customerList) {


        
        System.out.println("Please print your name");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people in front of you.\n", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);


    }


}
