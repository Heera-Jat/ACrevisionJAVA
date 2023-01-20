public class Mainclass {
   public static void main1(String[] args) {
      int N[]={2,4,6,8,10};
      for(int i =0; i<N.length; i++){
         for(int j=i; j<N.length;j++){
            for(int k=i; k<=j;k++){
               System.out.print(N[k]+" ");
            }
            System.out.println();
         }
         System.out.println();
   }
   }

   public static void main(String[] args) {
      int N[]={2,4,6,8,10};
      int currentsum=0;
      int maxsum= Integer.MIN_VALUE;
      for(int i =0; i<N.length; i++){
         for(int j=i; j<N.length;j++){
            currentsum=0;
            for(int k=i; k<=j;k++){
               //System.out.print(N[k]+" ");
               currentsum += N[k];
            }
            System.out.println(currentsum+" ");
            if(maxsum<currentsum){
               maxsum=currentsum;
            }
         }
         System.out.println();
      } System.out.println("Max sum: "+maxsum );
   }
}