

public class InsuredCar extends Car implements Insured{
    private String yourName;
    private int yourAge;
    private int yourRate;
    public InsuredCar(String make, String model, String registration, int yearBuy, double originalPrice, String yourName, int yourAge, int yourRate){
        super(make, model, registration, yearBuy, originalPrice);
        this.yourName = yourName;
        this.yourAge = yourAge;
        this.yourRate = yourRate;
    }

    public String getYourName() {
        return this.yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public int getYourAge() {
        return this.yourAge;
    }

    public void setYourAge(int yourAge) {
        this.yourAge = yourAge;
    }

    public int getYourRate() {
        return this.yourRate;
    }

    public void setYourRate(int yourRate) {
        this.yourRate = yourRate;
    }

    @Override
    public double getInsuranceValue(int year){ //nam can nhap
        int count =  year - getYearBuy();
        double res = getOriginalPrice();
        for(int i = 0; i < count; i++) {
            res  *= 0.9;
        }
        return res; // Gia tri cua bao hiem.
    }

    @Override
    public double getInsurancePremium(int year){
        double insurance_costs = getInsuranceValue(year) * 0.03; // Chi phi cua bao hiem.
        if(yourAge < 25) {
            insurance_costs *= 1.2;
            
        }
        for(int i = yourRate; i>1; i--){
            insurance_costs *= 1.1;
        }
        return insurance_costs;
    }

    @Override
    public void outputPolicyDetails(int year) {
        // TODO Auto-generated method stub
        System.out.println("Ten tai xe: "+yourName);
    }

}