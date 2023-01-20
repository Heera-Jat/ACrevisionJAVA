public class factorial {
    public static int factorial(int n) {
        int ans = 1;
        for(int i=1; i<=n; i++){
         ans =ans*i;
        }
        return ans;
     }
     public static void main(String[] args) {
         int ans = factorial(3);
         System.out.println(ans);
 
         ans = factorial(4);
         System.out.println(ans);
     }
}
