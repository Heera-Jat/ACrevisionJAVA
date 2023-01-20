public class ArrayPairs {
    public static void main(String[] args) {
        int N[]={2,4,6,8,10};
        int totalPairs=0;
        for(int i=0; i<N.length;i++){
           for(int j=i+1;j<N.length;j++){
              System.out.print("(" +N[i] +"," +N[j]+"),");
              totalPairs ++; 
           }
         System.out.println();  
        } 
        System.out.println(totalPairs);  
     }
}
