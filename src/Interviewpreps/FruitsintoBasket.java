package Interviewpreps;
import java.util.HashMap;
//Longest subarray atmost 2 distinct elements

public class FruitsintoBasket {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(maxfruits(fruits));
    }
    static int maxfruits(int[] fruits)
    {
        HashMap<Integer,Integer> basket = new HashMap<>();
        int left = 0;
        int maxfruits = 0;
        for(int right = 0; right < fruits.length; right++)
        {
            int currentcount = basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right], currentcount+1);
            while(basket.size() > 2)
            {
                int fruitcount = basket.get(fruits[left]);
                if(fruitcount == 1)
                basket.remove(fruits[left]);
                else{
                    basket.put(fruits[left], fruitcount - 1);
                    left++;
                }
            }
            maxfruits = Math.max(maxfruits, right - left+1);

        }
        return maxfruits;
    }
}
