package java2;

public class Individual extends Contribuinte{

    private Double healthExpenditures;


    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anuallcome, Double healthExpenditures) {
        super(name, anuallcome);
        this.healthExpenditures = healthExpenditures;
    }

    public Individual() {
        super();
    }



    @Override
    public Double tax() {
            double basicTax;
            if (getAnuallcome() < 20000) {
                basicTax = getAnuallcome() * 0.15;
            }
            else {
                basicTax = getAnuallcome() * 0.25;
            } // Condição ternaria double basicTax = (getAnuallcome()< 20000) ? getAnuallcome() *0.15 : basicTax= getAnuallcome()*0.25;
            basicTax -= (getHealthExpenditures() * 0.5);
            if (basicTax < 0.0) {
                basicTax = 0.0;
            }
            return basicTax;
        }
    }

