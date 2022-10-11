package hu.petrik.Autok;

public class Porsche implements Autok {

    private double sebesseg;

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }


    @Override
    public void gyorsul() {
        this.sebesseg = this.getSebesseg() + 10.0;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
    @Override
    public String toString() {
        return String.format(this.getSebesseg() + "km/h ");
    }

}
