

public class Insured_income extends Income implements Insured{

    public Insured_income(String yourName, int yourAge, double incomeAmount) {
        super(yourName, yourAge, incomeAmount);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getInsuranceValue(int year) {
        int count = 65 - getAge();
        double res = (double)count * getIncomeAmount();
        return res;
    }

    @Override
    public double getInsurancePremium(int year) {
        // TODO Auto-generated method stub

        return getInsuranceValue(year)*0.0001;
    }

    @Override
    public void outputPolicyDetails(int year) {
        // TODO Auto-generated method stub
        System.out.println("Ten: "+getName());
    }
    
}
