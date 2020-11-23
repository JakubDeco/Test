package sk.kosickaakademia.deco.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int capacity;
    private List<T> arrList;

    public Stack(int capacity){
        this.capacity=capacity;
        arrList=new ArrayList<>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize(){
        return arrList.size();
    }

    public boolean isEmpty(){
        return arrList.size()==0;
    }

    public boolean isFull(){
        return arrList.size()==capacity;
    }

    public T push(T object){
        if (isFull()){
            System.out.println("Stack is full.");
            return null;
        }
        else {
            arrList.add(object);
            return object;
        }
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        else {
            T help=arrList.get(arrList.size()-1);
            arrList.remove(help);
            return help;
        }
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else
            return arrList.get(arrList.size()-1);
    }

    public void print(){
        System.out.println();
        for(T help:arrList)
            System.out.print(help+"  ");
        System.out.println();
    }

    public void clear(){
        arrList.clear();
    }

    public int search(T object){
        if (arrList.contains(object))
            return arrList.indexOf(object);
        else return -1;
    }


}
