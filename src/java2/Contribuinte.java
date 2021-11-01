package java2;

public abstract class Contribuinte {

     private String name;//ver variaveis que são comuns aos processos das outras classes
    private Double anuallcome;

    public Contribuinte(String name, Double anuallcome) {
        this.name = name;
        this.anuallcome = anuallcome;
    }

    public Contribuinte() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnuallcome() {
        return anuallcome;
    }

    public void setAnuallcome(Double anuallcome) {
        this.anuallcome = anuallcome;
    }

    public abstract Double tax();
}
