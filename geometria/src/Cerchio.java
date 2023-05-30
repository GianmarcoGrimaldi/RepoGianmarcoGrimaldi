public class Cerchio extends FigureGeometricheAbstract{
    public Cerchio(double dato1, double dato2, double dato3) {
        super(dato1, dato2, dato3);
    }

    public Cerchio(double dato1, double dato2) {
        super(dato1, dato2);
    }

    public Cerchio(double raggio) {
        super(raggio);
    }

    @Override
    public double calcoloArea() {
        return (getDato1()*getDato1())*3.14;
    }

    @Override
    public double calcolaPerimetro() {
        return (getDato1()*2)*3.14;
    }
}
