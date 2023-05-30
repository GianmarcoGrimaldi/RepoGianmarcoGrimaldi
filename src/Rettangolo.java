public class Rettangolo extends FigureGeometricheAbstract {


    public Rettangolo(double base, double altezza, double ipotenusa) {
        super(base, altezza, ipotenusa);
    }

    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    public Rettangolo(double base) {
        super(base);
    }

    @Override
    public double calcoloArea() {
        return(getDato1()*getDato2()) ;
    }

    @Override
    public double calcolaPerimetro() {
        return (getDato1()+getDato2())*2;
    }
}
