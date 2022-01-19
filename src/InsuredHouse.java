
public class InsuredHouse extends House implements Insured{
    private int ownerAge;
    private double contentValue;

    public InsuredHouse(String ownerName, int ownerAge, String address, double houseValue, int yearOfValuation, double contentValue) {
        super(ownerName, address, houseValue, yearOfValuation);
        this.ownerAge = ownerAge;
        this.contentValue = contentValue;
    }

    public int getOwnerAge() {
        return this.ownerAge;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public double getContentValue() {
        return this.contentValue;
    }
    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }


    @Override
    public double getInsuranceValue(int year) {
        // TODO Auto-generated method stub
        double res = getHouseValue();
        int count = year - getYearOfValuation();
        for (int i = 0; i < count; i++) {
            res *= 1.05;
        }
        return res+getContentValue();
    }

    @Override
    public double getInsurancePremium(int year) {
        // TODO Auto-generated method stub
        double res = getInsuranceValue(year)*0.05;
        if(ownerAge > 65){
            res *= 0.9;
        }
        return res;
    }

    @Override
    public void outputPolicyDetails(int year) {
        // TODO Auto-generated method stub
        System.out.println("Tuoi cua chu so huu: "+getOwnerAge());
    }
    
}
