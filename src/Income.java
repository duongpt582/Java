

public class Income {
    private String name;
    private int age;
    private double incomeAmount;           //thu nhap hien tai.


    public Income(String name, int age, double incomeAmount) {
        this.name = name;
        this.age = age;
        this.incomeAmount = incomeAmount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncomeAmount() {
        return this.incomeAmount;
    }

    public void setIncomeAmount(double incomeAmount) {
        this.incomeAmount = incomeAmount;
    }


}
