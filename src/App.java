public class App {
    public static void main(String[] args){ 
    suma(10,15,25);

    coche miCoche = new coche();
    miCoche.IncrementoPuerta();

    System.out.println(miCoche.puertas);
    }

    public static void suma(int a,int b,int c) {
        int resultado;
        resultado = a + b + c;

        
        System.out.println(resultado);}

}
