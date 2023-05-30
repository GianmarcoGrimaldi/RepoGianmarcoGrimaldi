/*Sviluppare un programma java che possa effettuare le seguenti operazioni:
-calcolo area, perimetro

delle seguenti figure geometriche piane:

-quadrato
-rettangolo
-triangolo equilatero

-cerchio


bonus:
triangoli
pentagono,esagono, ettagono, ottagono
trapezi*/


public class Main {
    public static void main(String[] args) {

        TriangoloEquilatero triangolo1 = new TriangoloEquilatero(23, 4);
        Rettangolo rettangolo1 = new Rettangolo(12,4);
        Cerchio cerchio1 = new Cerchio(5);
        Quadrato quadrato1 = new Quadrato(10);
        Trapezio trapezio1 = new Trapezio(20,12,8,9,10);

        System.out.println();

        System.out.println("TRIANGOLO: ");
        System.out.println("Area:" + triangolo1.calcoloArea());
        System.out.println("Perimetro:" + triangolo1.calcolaPerimetro());

        System.out.println();

        System.out.println("CERCHIO");
        System.out.println("Perimetro:" + cerchio1.calcolaPerimetro());
        System.out.println("Area:" + cerchio1.calcoloArea());

        System.out.println();

        System.out.println("RETTANGOLO");
        System.out.println("Perimetro:" + rettangolo1.calcolaPerimetro());
        System.out.println("Area:" + rettangolo1.calcoloArea());

        System.out.println();

        System.out.println("QUADRATO");
        System.out.println("Perimetro:" + quadrato1.calcolaPerimetro());
        System.out.println("Area:" + quadrato1.calcoloArea());

        System.out.println();

        System.out.println("TRAPEZIO");
        System.out.println("Perimetro:" + trapezio1.calcolaPerimetro());
        System.out.println("Area:" + trapezio1.calcoloArea());
        System.out.println("");

        System.out.println("");
    }

}