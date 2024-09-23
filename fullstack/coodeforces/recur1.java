package fullstack.coodeforces;

public class recur1 {
    public static void main(String[] args) {
        int n=2;
        System.out.println(print(n));
    }
    public static int  print(int n) {
        if(n==0){
            return 1 ;
        }
        int exp=2*print(n-1);
        return exp;
        
    }
    
}
