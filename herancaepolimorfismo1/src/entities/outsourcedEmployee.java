package entities;

public class outsourcedEmployee extends employee {

    private Double additionalCharge;

    public outsourcedEmployee() {

    }
    public outsourcedEmployee(String name, int hours, double valuePerhour, Double additionalCharge) {
        super(name, hours, valuePerhour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
