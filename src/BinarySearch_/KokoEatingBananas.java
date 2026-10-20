package BinarySearch_;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(kokoEatingBanana(piles,h));
    }
    static int kokoEatingBanana(int[] piles, int h){
        int low = 1;
        int hi = 0;
        for(int pile : piles) hi = Math.max(hi,pile);
        while(low < hi){
            int mid = low + (hi - low) / 2;
            if(canFinish(piles,mid,h)){
                hi = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean canFinish(int[] piles, int speed, int h){
        int hours = 0;
        for(int pile : piles){
            hours += (pile + speed - 1) / speed;
        }
        return hours <= h;
    }
}
