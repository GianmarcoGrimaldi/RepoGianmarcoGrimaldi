public class Quadrato extends FigureGeometricheAbstract{


     public Quadrato(double lato) {
        super(lato);
    }

    @Override
    public double calcoloArea() {
        return (getDato1()*getDato1());
    }

    @Override
    public double calcolaPerimetro() {
        return (getDato1()*4);
    }
}
