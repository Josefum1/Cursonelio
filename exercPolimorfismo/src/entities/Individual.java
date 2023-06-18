package entities;

public class Individual extends taxPayer{

    private double healthExpense;

    public void Individual(){
    }

    public Individual(String name, double annualIncome, double healthExpense) {
        super(name, annualIncome);
        this.healthExpense = healthExpense;
    }

    public double getHealthExpense() {
        return healthExpense;
    }

    public void setHealthExpense(double healthExpense) {
        this.healthExpense = healthExpense;
    }

    @Override
    public double tax(){
        if (annualIncome > 20000){
            if (healthExpense > 0){
                return (annualIncome * 0.25) - (healthExpense * 0.5);
            }
            else {
                return annualIncome * 0.25;
            }

        }
        else{
            if(healthExpense > 0){
                return (annualIncome * 0.15) - (healthExpense * 0.5);

            }
            else{
                return (annualIncome * 0.15);
            }
        }

    }
}
