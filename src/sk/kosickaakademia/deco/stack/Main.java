package sk.kosickaakademia.deco.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>(5);
        stack.push(20);
        stack.push(89);
        stack.push(2);
        stack.push(50);
        System.out.println("capacity of stack: "+stack.getCapacity());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(-3);
        System.out.println(stack.peek());
        System.out.println();
        stack.pop();
        stack.print();
        //System.out.println(stack.search(12));
        System.out.println(stack.push(12));
    }
}
