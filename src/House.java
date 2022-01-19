

public class House {
    private String ownerName;
    private String address;
    private double houseValue;
    private int yearOfValuation;


    public House(String ownerName, String address, double houseValue, int yearOfValuation) {
        this.ownerName = ownerName;
        this.address = address;
        this.houseValue = houseValue;
        this.yearOfValuation = yearOfValuation;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHouseValue() {
        return this.houseValue;
    }

    public void setHouseValue(double houseValue) {
        this.houseValue = houseValue;
    }

    public int getYearOfValuation() {
        return this.yearOfValuation;
    }

    public void setYearOfValuation(int yearOfValuation) {
        this.yearOfValuation = yearOfValuation;
    }

    

}
