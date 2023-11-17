package web.model;

public class Phone {
    public String model;
    public Integer weight;
    public Double display;
    public OS operatingSystem;


    public Phone(String model, Integer weight, Double display, OS operatingSystem) {
        this.model = model;
        this.weight = weight;
        this.display = display;
        this.operatingSystem = operatingSystem;
    }


    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getDisplay() {
        return display;
    }

    public void setDisplay(Double display) {
        this.display = display;
    }

    public OS getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
