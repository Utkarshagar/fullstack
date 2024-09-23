package fullstack.coodeforces;



public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(print(n));
    }
    public static int  print(int n) {
        if(n==0){
            return 1 ;
        }
        int fac=n*print(n-1);
        return fac;
        
    }
    
}

