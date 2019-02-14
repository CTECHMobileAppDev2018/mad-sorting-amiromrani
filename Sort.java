import java.util.Arrays;

class Main 
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
  
  // Test program 
  public static void main(String args[]) 
  { 
    double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
    System.out.println("original array: "); 
    System.out.println(Arrays.toString(arr));
    
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
