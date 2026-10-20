package Greedy;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(gasStation(gas,cost));
    }
    static int gasStation(int[] gas, int[] cost){
        int tank = 0;
        int total = 0;
        int start = 0;
        for(int i = 0; i < gas.length;i++){
            int net = gas[i] - cost[i];
            tank += net;
            total += net;
            if(tank < 0){
                start = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? start : -1;
    }
}
