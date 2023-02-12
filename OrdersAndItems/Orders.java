import java.util.ArrayList;

public class Orders {

    public String name;
    public double total;
    public boolean ready;

    //The data type Items comes form the Items.java file
    public ArrayList<Items> items = new ArrayList<Items>();

    // public Orders(String name, double total, boolean ready, ArrayList<String> items){
    //     this.name = name;
    //     this.total = total;
    //     this.ready = ready;
    //     this.items = items;

    //}
}