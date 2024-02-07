public class Solution {

    public int reverse(int x) {
        // x = 123
        // output = 321
        // x = -123
        // output = -321

        if(x<0){
            x*=-1;
            x=((x%10)*100) + (x/100) + (((x/10)-((x/100)*10))*10);
            x*=-1;
        }else x=((x%10)*100) + (x/100) + (((x/10)-((x/100)*10))*10);

     return x;
    }

}
