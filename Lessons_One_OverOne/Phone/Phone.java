package Phone;

public class Phone {
    private String model;
    private int weight;
    private long phoneNumber;

    public Phone(String model, int weight, long phoneNumber) {
        this.model = model;
        this.weight = weight;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}