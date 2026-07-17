import java.util.*;
public class linearsearch {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter 5 numbers:");
    //Array 
    for(int i=0; i<5; i++){
      arr[i] = sc.nextInt();
    } 
    System.out.println("Enter element to search:");
    int key = sc.nextInt();
    boolean found = false;

    //linear search 
    for(int i=0; i<5; i++) {
      if(arr[i]==key) {
        found = true;
        System.out.println("element found at index"+i);
        break;
      }
    }
    if(found==false){
      System.out.println("Element not found");
    }
  }
}
