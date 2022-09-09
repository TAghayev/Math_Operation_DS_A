package project;
import java.util.ArrayList;

public class MyStack <MathOperation> {
    
    ArrayList<MathOperation> stackList;


    MyStack() {
        stackList = new ArrayList<>();
    }

   boolean isEmpty() {
          if (stackList.isEmpty()){
               return true;
          } else {
                return false;
          }
     }
   
     MathOperation pop() {

         if (!isEmpty()) { 
              MathOperation poppedval = stackList.get(stackList.size() - 1);
              stackList.remove(stackList.size() - 1);           
              return poppedval;
         } else {
              System.out.print("This stack is already empty! ");
             return null;
         }
    }
     
    int size() 
  {
      return(stackList.size());
  }
 
   void push(MathOperation val) {
        stackList.add(val);
    }

    MathOperation peek() {
         return  stackList.get(stackList.size() - 1);
    }
}

  