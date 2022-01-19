
public class Car {
    private  String make;
    private String model;
    private String registration;
    private int yearBuy;
    private double originalPrice;

    public Car(String make, String model, String registration, int yearBuy, double originalPrice) {
        setMake(make);
        setModel(model);
        setRegistration(registration);
        setYearBuy(yearBuy);
        setOrginalPrice(originalPrice);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getYearBuy() {
        return this.yearBuy;
    }

    public void setYearBuy(int yearBuy) {
        this.yearBuy = yearBuy;
    }

    public double getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOrginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

}
