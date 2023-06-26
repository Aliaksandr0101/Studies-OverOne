package PeculiaritiesOOP;

public class Car {
    private String brand, model, engineCapacity, yearOfIssue;

    public Car(String brand, String model, String engineCapacity, String yearOfIssue) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.yearOfIssue = yearOfIssue;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) &&
                yearOfIssue.equals(car.yearOfIssue);
    }

    public static void main(String[] args) {
        Car carOne = new Car("audi", "C4", "2.0", "1992");
        Car carTwo = new Car("audi", "C4", "2.0", "1992");
       String result = (carOne.equals(carTwo))
               ? "cars are the same"
               : "cars are not the same";
        System.out.println(result);
    }


}


