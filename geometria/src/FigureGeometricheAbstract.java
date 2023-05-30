public abstract class FigureGeometricheAbstract implements OperazioniInterface {
    private double dato1;
    private double dato2;
    private double dato3;
    private double dato4;
    private double dato5;

    public FigureGeometricheAbstract(double dato1, double dato2, double dato3, double dato4, double dato5) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
        this.dato4 = dato4;
        this.dato5 = dato5;
    }

    public FigureGeometricheAbstract(double dato1, double dato2, double dato3) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    public FigureGeometricheAbstract(double dato1, double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public FigureGeometricheAbstract(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public double getDato3() {
        return dato3;
    }

    public void setDato3(double dato3) {
        this.dato3 = dato3;
    }

    public double getDato5() {
        return dato5;
    }

    public void setDato5(double dato5) {
        this.dato5 = dato5;
    }

    public double getDato4() {
        return dato4;
    }

    public void setDato4(double dato4) {
        this.dato4 = dato4;
    }
}
