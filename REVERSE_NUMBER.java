class Solution {
    public int reverse(int x) {
        long a =0;
        while(x!=0){
            int r = x%10;
            a=a*10+r;
            x=x/10;
        }
         if(a>Integer.MAX_VALUE||a<Integer.MIN_VALUE){
            return 0;
        }
        return (int)a;
    }
}
