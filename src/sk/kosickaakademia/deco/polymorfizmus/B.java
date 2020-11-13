package sk.kosickaakademia.deco.polymorfizmus;

public class B extends A implements I2{

    public B(){
        System.out.println("I am constructor B");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Cow");
    }

    public void programingLanguage(){
        System.out.println("Class B loves Java");
    }

    @Override//anotacia: prekrytie dedenej metody print
    public void print(){
        System.out.println("Class B : print()");
    }
}
