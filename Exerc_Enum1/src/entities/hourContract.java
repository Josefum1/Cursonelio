package entities;

import java.util.Date;

public class hourContract {

    private Date date;
    private Double valuePerhour;

    private Integer hours;

    public hourContract(){

    }

    public hourContract(Date date, Double valuePerhour, Integer hours) {
        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerhour * hours;
    }
}
