package sk.kosickaakademia.deco.polymorfizmus;

public class A implements I1{
    private int number;

    public A(){
        System.out.println("I am constructor A");
        number=35;
    }

    public A(String text){
        this();
        System.out.println("I am constructor A and I receive text as parameter: "+text);
    }

    @Override
    public void animal() {
        System.out.println("Cat");
    }

    public void print(){
        System.out.println("Class A : print()");
    }
}
