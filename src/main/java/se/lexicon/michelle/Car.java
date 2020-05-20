package se.lexicon.michelle;

public class Car {
    int id;
    String brand,
            model;

    public Car(int id, String brand, String model) {
        setId(id);
        setBrand(brand);
        setModel(model);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
