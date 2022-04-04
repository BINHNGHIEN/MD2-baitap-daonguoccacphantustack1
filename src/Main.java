import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> stack2= new Stack<>();
        int  []arr={1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println( " stack before reverse: "+stack);

        for (int j = 0; j < arr.length; j++) {
            stack2.push(stack.pop());
        }
        System.out.println(" stack after reverse : "+stack2);


    }
}