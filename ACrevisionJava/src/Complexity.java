public class Complexity {
    public static int binarySearch(int numbers[],int key) {
       int start=0;int end=numbers.length+1;
       while(start<=end){
         int mid=(start+end)/2;
         if(numbers[mid]==key){
            return mid;
         }
         if(numbers[mid]<key){
            start=mid+1;
         }
         else {
            end =mid-1;
         }
       } return -1;
    }
    public static void main(String[] args) {
     int numbers []= {1,2,3,4,5,6,7,8,9};
     int key=5;
     System.out.println(binarySearch(numbers, key));//O(log(N))
 
     System.out.println(numbers[4]);//O(1)
 
        for(int i=0; i<numbers.length;i++){
          System.out.println(numbers[i]);//)(N)
        }
    }
   
 }
