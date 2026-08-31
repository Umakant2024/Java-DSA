class Solution {
    public int result(int n){
        if(n==0) return 0;
        if(n==1)return 1;
        return result(n-1)+result(n-2);
    }
    public int fib(int n) {
        return result(n);
    }
}