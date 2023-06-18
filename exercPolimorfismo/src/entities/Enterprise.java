package entities;

public class Enterprise extends taxPayer{

    private int workers;

    public void Enterprise(){

    }

    public Enterprise(String name, double annualIncome, int workers) {
        super(name, annualIncome);
        this.workers = workers;
    }

    @Override
    public double tax(){
        if(workers > 10){
           return annualIncome * 0.14;
        }
        else {
            return annualIncome * 0.16;
        }
    }

}
