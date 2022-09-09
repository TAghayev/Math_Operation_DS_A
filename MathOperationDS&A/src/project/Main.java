package project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int sel;
        int num1, num2;
        MyStack <MathOperation> operations = new MyStack <MathOperation> ();
        
        Scanner input = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("1) Add Addition\n2) Add Subtraction\n3) Add Multiplication\n4) Add Divsion\n5) Run operations\n6) Reverse Order\n7) Print Top\n8) Remove Top\n9) Author Info\n0) Exit");
            sel = input.nextInt();
            
            switch (sel) {
                case 1 -> operations.push(new AdditionOperation(input));
                case 2 -> operations.push(new SubtractionOperation(input));
                case 3 -> operations.push(new MultiplicationOperation(input));
                case 4 -> operations.push(new DivisionOperation(input));
                case 5 -> MathOperation.printStack(operations);
                case 6 -> operations = MathOperation.reverseOrder(operations);
                case 7 -> System.out.println(operations.peek());
                case 8 -> operations.pop();
                case 9 -> System.out.println("Name: Tamerlan Aghayev\n");
                case 0 -> {
                    break OUTER;
                }
                default -> {
                }
            }
        }
        
    }
}



