package sk.kosickaakademia.deco.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>(5);
        System.out.println(q.isEmpty());
        q.push(20);
        System.out.println(q.isEmpty());
        q.push(12);
        q.push(12);
        q.push(12);
        System.out.println(q.pop());
        q.print();
        q.clear();
        System.out.println(q.isEmpty());
    }
}
