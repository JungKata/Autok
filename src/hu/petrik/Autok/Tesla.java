package hu.petrik.Autok;

public class Tesla implements Autok{

    private double sebesseg;

    public Tesla() {
        this.sebesseg = Math.floor(Math.random()* 60) ;
    }

    @Override
    public void gyorsul() {
         this.sebesseg = this.getSebesseg()+ Math.floor(Math.random()*15 + 5);
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }

    @Override
    public String toString() {
        return String.format(this.getSebesseg() + "km/h");
    }

}
