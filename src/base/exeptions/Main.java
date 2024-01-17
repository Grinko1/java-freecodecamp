package base.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {

                System.out.println("Enter the whole number to divide: ");
                int x  = scanner.nextInt();
                System.out.println("Enter the whole number to divide by: ");
                int y  = scanner.nextInt();
                int z = x/y;
                System.out.println("result: " + z);

            } catch (ArithmeticException e) {
                System.out.println("You can't divide by zero");
            }catch(InputMismatchException e){
                System.out.println("Please enter a number OMFG");
            }catch(Exception e){
                System.out.println("Something went wrong");
            }finally {
                System.out.println("This block always runs");
                scanner.close();

            }
        }


}
