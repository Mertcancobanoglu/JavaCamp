package entities;

public class Car {
    private String carName;
    private int age;
    private int engineNumber;
    private float dailyPrice;
    private String model;

    public Car(String carName, int age, int engineNumber, float dailyPrice, String model) {

        this.carName = carName;
        this.age=age;
        this.engineNumber = engineNumber;
        this.dailyPrice = dailyPrice;
        this.model = model;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public float getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(float dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
