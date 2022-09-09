package project;
import java.util.Scanner;
import java.util.Stack;

/*
 *
 * @author Tamerlan Aghayev
 */

public class MathOperation {
    private int num1, num2;
    private char oper;
    
    public MathOperation(Scanner input)
    {
        System.out.println("Enter values to add");
        num1 = input.nextInt();
        num2 = input.nextInt();
    }
    public MathOperation()
    {
        
    }
    
    public String toString()
    {
        return(String.format("%d ? %d", num1,num2));
    }
    
    public MathOperation(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1()
    {
        return(num1);
    }
    
    public int getNum2()
    {
        return(num2);
    }
    
    public double getResult()
    {
        return(-1);
    }
    
    public String printResult()
    {
        return(String.format("%d %c %d = %f", num1, oper, num2, getResult()));
        
      
    }
    public static void printStack(MyStack<MathOperation> operations){
        if (operations.isEmpty()) {
                return; 

    }
        
        MathOperation pushbackitem = operations.peek();
        operations.pop();
        System.out.println(pushbackitem + " ");
        printStack(operations);
        operations.push(pushbackitem);
        
        
}   
    
     
     public static MyStack<MathOperation> reverseOrder(MyStack<MathOperation> operations){
    MyStack<MathOperation> operations_r = new MyStack<>();
         
         if (operations.isEmpty()){
            System.out.println("Order reversed");
            return (null);
         }
         
         while (operations.size()>0)
         {
         operations_r.push(operations.pop());
         }
         
         operations = operations_r;
         return(operations); 
          
         }
    
        public void setOperation(char oper)
    {
        this.oper = oper;
    }
}
