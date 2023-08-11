public class ToysPro {
    int ID;
    String name;
    double rate;

    public ToysPro(int ID, String name, double rate) {
        this.ID = ID;
        this.name = name;
        this.rate = rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "ID = " + ID + ", название = " + name + ", частота выпадения = " + rate + "";
    }
}
