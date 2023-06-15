package entities;

public class employee {
    private String name;
    private Integer hours;
    private Double valuePerhour;

    public employee(){

    }
    public employee(String name, int hours, double valuePerhour) {
        this.name = name;
        this.hours = hours;
        this.valuePerhour = valuePerhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public Double payment(){
        return hours * valuePerhour;
    }
}
