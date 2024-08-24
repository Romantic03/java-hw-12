package app;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Протуренко Анастасія Миколаївна",
                "Інжинер",
                "nastia@gmail.com",
                "783547258",
                20
                );
        employee.printEmployee();

        Car car = new Car();
        car.start();
    }
}