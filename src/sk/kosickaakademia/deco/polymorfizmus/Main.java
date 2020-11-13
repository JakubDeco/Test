package sk.kosickaakademia.deco.polymorfizmus;

public class Main {
    public static void main(String[] args) {
        B object1=new B();
        object1.print();

        A Object2=new C();
        Object2.print();//ak by tu nebol @override
        ((B)Object2).print();
    }
}
