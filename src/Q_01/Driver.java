package Q_01;

public class Driver {
    public static void main(String[] args) {
        Stack stack=new Stack();

//        stack.push(2);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//
//        stack.display();
//
//        stack.pop();
//        System.out.println("----------------------------");
//        stack.display();


        DecimalToBinaryConvertor(stack,7);
        stack.display();
    }

    public static void  DecimalToBinaryConvertor(Stack stack,int value){
        while(value>=1){
            int binary=value%2;
            value=value/2;
            stack.push(binary);
        }
    }
}
