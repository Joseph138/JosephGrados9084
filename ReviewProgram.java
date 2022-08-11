/**
* Class name: ReviewProgram.java
* author: Joseph Grados
* collaborator: Dr. Hyesung Park
* Date: 8/11/2022
*verison 1.1
*description: This program will generate some examples from the ITEC 2140 course.
*
*
*/
public class ReviewProgram{
  public static void main(String [] args){
    ReviewProgram rp = new ReviewProgram(); // create ReviewProgram type object to call instance methods.
    System.out.println("Enter two number");
    Scanner input = new Scanner(System.in);
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    int result = rp.add(number1, number2);
    System.out.println("Result of two numbers " + number1 + " and " + number2 + " is " + resultStatic);
  }
  public int add(int firstNum, int secondNum)// instance method/non-static method
  {
    return firstNum + secondNum;
  }
  public static int addStatic(int firstNum, int secondNum){
    return firstNum + secondNum;
  }
}
