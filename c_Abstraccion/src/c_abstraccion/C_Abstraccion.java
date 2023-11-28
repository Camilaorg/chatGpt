package c_abstraccion;
abstract class Auto{
    String marca;
    String modelo;
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public String obtenerInformacion(){
        return "Marca: " + marca + "n/ Modelo: " + modelo;
    }
}
public class C_Abstraccion {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla"){};
        System.out.println(miAuto.obtenerInformacion());
    }
    
}
