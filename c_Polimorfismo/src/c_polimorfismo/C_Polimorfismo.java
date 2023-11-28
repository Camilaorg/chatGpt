package c_polimorfismo;
interface Sonido{
    void hacerSonido();
}
class Perro implements Sonido{
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
}
class Gato implements Sonido{
    public void hacerSonido(){
        System.out.println("El gato maulla");
    }
}
public class C_Polimorfismo {
    public static void main(String[] args) {
        Sonido miMascota = new Perro();
        miMascota.hacerSonido();
        miMascota = new Gato();
        miMascota.hacerSonido();
    }
    
}