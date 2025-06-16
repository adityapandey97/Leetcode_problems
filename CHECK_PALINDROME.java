class Solution {
    public boolean isPalindrome(int x) {
        long a =0;
        long temp = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int r = x%10;
            a=a*10+r;
            x=x/10;
        }
        if(temp==a){
            return true;
        }else return false;


    }
}
