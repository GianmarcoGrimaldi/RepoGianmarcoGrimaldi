public class Trapezio extends FigureGeometricheAbstract {
    public Trapezio(double baseMaggiore, double baseMinore, double latoObliquo1, double latoObliquo2, double altezza) {
        super(baseMaggiore, baseMinore, latoObliquo1, latoObliquo2, altezza);
    }

    @Override
    public double calcoloArea() {

        return (    ((getDato1()+getDato2())*getDato5())/2   );
    }

    @Override
    public double calcolaPerimetro() {
        return (getDato1()+getDato2()+getDato3()+getDato4());
    }

}

