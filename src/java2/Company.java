package java2;

public class Company extends Contribuinte{

    private Integer numberOfEmployees;


    public Company(String name, Double anuallcome, Integer numberOfEmployees) {
        super(name, anuallcome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company() {
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double z = (getNumberOfEmployees() < 10) ? getAnuallcome() * 0.16 : getAnuallcome() * 0.14;
        return z;
        }
}
