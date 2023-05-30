public class TriangoloEquilatero extends FigureGeometricheAbstract {


    public TriangoloEquilatero(double base, double altezza) {
        super(base, altezza);
    }

    public TriangoloEquilatero(double dato1, double dato2, double dato3) {
        super(dato1, dato2, dato3);
    }

    @Override
    public double getDato1() {
        return super.getDato1();
    }

    @Override
    public void setDato1(double dato1) {
        super.setDato1(dato1);
    }

    @Override
    public double getDato2() {
        return super.getDato2();
    }

    @Override
    public void setDato2(double dato2) {
        super.setDato2(dato2);
    }

    @Override
    public double getDato3() {
        return super.getDato3();
    }

    @Override
    public void setDato3(double dato3) {
        super.setDato3(dato3);
    }

    @Override
    public double calcoloArea() {
        return (getDato1() * getDato2()) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return getDato1() * 3;
    }
}
