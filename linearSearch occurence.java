import java.util.*;
public class linearSearch {
    public static void main(String[]args) {
        
        int[]arr = {5,10,25,20,5,30} ;
        int target = 5;
        
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index:" +i);
            }
        }
    }
}
