package Interviewpreps;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int res[] = noncollide(asteroids);
        for(int i = 0 ; i < res.length; i++)
        {
            System.out.print(res[i]+ " ");
        }
    }
    static int[] noncollide(int[] asteroids)
    {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids)
        {
            if(a > 0) {
                stack.push(a);
            }
            else {
                while(!stack.isEmpty() && stack.peek() > 0 &&
                stack.peek() < -a)
                {
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0)
                {
                    stack.push(a);
                }
                if(stack.peek() == -a){
                    stack.pop();
                }

            }

        }
        int[] res = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.isEmpty()){
            res[i--] = stack.pop();
        }
        return res;
    }
}
