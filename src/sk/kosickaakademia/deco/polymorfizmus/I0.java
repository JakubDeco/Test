package sk.kosickaakademia.deco.polymorfizmus;

public interface I0 {
    public void animal();// public modifier can be omitted as it is implicit

    default public void wildAnimal(){
        System.out.println("Horse");
    }
}
