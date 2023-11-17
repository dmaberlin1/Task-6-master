package web.model;

public class Car {
    private String model;
    private String brand;

    private String color;

    private int engineCapacity;

    public Car() {
    }

    public Car(String model, String brand, String color, int engineCapacity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
