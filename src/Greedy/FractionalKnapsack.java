package Greedy;

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10,20,30};
        int W = 10;
        System.out.println(Fracknapsack(val,wt,W));
    }
    static Double Fracknapsack(int[] val,int[] wt, int W){
        int n = wt.length;
        double[][] item = new double[n][2];
        for(int i = 0; i < n; i++){
            item[i][0] = val[i];
            item[i][1] = wt[i];
        }
        Arrays.sort(item, (a,b) -> Double.compare(b[0]/b[1],a[0]/a[1]));
        double totalMax = 0;
        int remaining = W;
        for(int i = 0; i < n; i++){
            double vals = item[i][0];
            double wts = item[i][1];
            if(remaining >= wts){
                totalMax += vals;
                remaining -= wts;

            }
            else{
                totalMax += vals * ((double) remaining / wts);
                break;
            }
        }
        return Math.round(totalMax * 1e6) / 1e6;

    }
}
