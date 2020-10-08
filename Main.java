 import java.util.Scanner;
/**
 * Arrays example 
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 

    final int MARKS = 5;
    //create an Array with 5 spots
    double[] grades = new double[MARKS];

    //put grades into array using loop
    for(int i = 0; i < grades.length; i++){ 
    System.out.println("Please enter garde " + (i + 1));
    grades[i] = input.nextDouble(); 
    } 

    //create a variable to store the sum 
    double sum = 0;
  
    //use a for looop to go through the array and add to the sum 
    for(int i = 0; i < grades.length; i++){
      //add grade to the sum 
      sum  = sum + grades[i]; 
    } 

    //determine the average 
    double average = sum / MARKS; 

    System.out.println("your average grade is " + average);    

       

    
  }
}
