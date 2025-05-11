package Primitives;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();

        person.name = "reader!";
        person.age = 89;

        car.owner = person;
        car.model = "Toyota";

        System.out.println("Cars model ==> "+ car.model + " cars owner " + car.owner.name);

//        System.out.println("Show the person's name "+person.name + " and the age " + person.age);
    }
}
