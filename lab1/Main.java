//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Abdirahman Nur
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    // Create an array with values
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};
    
    // Output the array in order using a while loop
    int i = 0;
    while(i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }

    System.out.println();

    // Output the array in reverse using a for loop    
    for(int j = nums.length-1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }

    System.out.println();

    // Output the first and last values of the array
    System.out.print(nums[0] + ", ");
    System.out.print(nums[nums.length-1]);
    System.out.println();

    // Call the methods created in Lab
    System.out.println("max("+nums[0]+","+nums[1]+"): " + lab.max(nums[0], nums[1]));
    System.out.println("min("+nums[0]+","+nums[1]+"): " + lab.min(nums[0], nums[1]));
    System.out.println("sum(nums): " + lab.sum(nums));
    System.out.println("max(nums): " + lab.max(nums));
    System.out.println("min(nums): " + lab.min(nums));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if(a > b) {
      return a;
    }
    return b;
  }

  public int min(int a, int b) {
    if(a < b) {
      return a;
    }
    return b;
  }

  public int sum(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public int max(int[] nums) {
    int max = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] > max){
        max = nums[i];
      }
    }
    return max;
  }

  public int min(int[] nums) {
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] < min){
        min = nums[i];
      }
    }
    return min;
  }
}