package fullstack.coodeforces;

public class recur {
    public static void main(String[] args) {
        int n=2;
        System.out.println(print(n));
    }
    public static int print(int n) {
        if(n==0)
        return 0;
        int sum=n+print(n-1);
        return sum;
        
    }
    
}
