import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TestSort
{
   public void arraySwapAny(double []inputArray, int loc1, int loc2) {
    
    double temp;
    temp = inputArray[loc1];
    inputArray[loc1] = inputArray[loc2];
    inputArray[loc2] = temp;
  }
  
  // start and end are optional - some sorting algorithms use them, but you can ignore them
  void sort(double arr[], long start, long end) 
  { 
    for (int j =0; j < arr.length; j++) {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i+1]) {
          arraySwapAny(arr, i,i+1);
        }
      }
    } 
  }
  // yes, I should have called the sorter class something other than "Main"
  
    // Test program 
    public static void main(String args[]) 
    { 
      System.out.println("How many items would you like in your array? Max 1,000,000: ");
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter username");
      
      String userName = myObj.nextLine();  // Read user input
      
      System.out.println("This will test your sorting with 1,000,000 items between +/- 1000000");
      
      double arr[] = new double[1000000];

      for (int i = 0; i < 1000000; i++) {
        arr[i] = new Random().nextDouble() * 2000000 - 1000000;
      }
      // create a sorted version to test.
      double sortedArr[] = arr.clone();
      Arrays.sort(sortedArr);
      System.out.println("sorted array: "); 
      System.out.println(Arrays.toString(sortedArr));
        
       
      Main sorter = new Main(); // create a sorter object
      sorter.sort(arr, 0, arr.length); // call the sort function
  
      System.out.println("*** your sorted array: "); 
      System.out.println(Arrays.toString(arr));
    } 

  
  
  
  
}