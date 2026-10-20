package Pattern;
import java.util.*;
class Item{
    String name;
    int quantity;
    double price;
    Item(String name,int quantity,double price)
    {
        this.name = name;
        this.quantity  = quantity;
        this.price = price;
    }
    double Getrevenue()
    {
        return quantity*price;
    }
}
public class ProductSellingScenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Item> items = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            String name = sc.next();
            int quantity = sc.nextInt();
            double price = sc.nextDouble();
            items.add(new Item(name,quantity,price));
        }
        double totalrevenue = 0;
        Item highest = items.get(0);
        for(Item item : items)
        {
            double Revenue = item.Getrevenue();
            totalrevenue += Revenue;
            if(Revenue > highest.Getrevenue())
            {
                highest = item;
            }
        }
        double avg = totalrevenue/n;
        System.out.println("Highest selling product :"+ highest.price);
        System.out.println("Total sales:"+ totalrevenue);
        System.out.print("Average :"+ avg);


    }
}


