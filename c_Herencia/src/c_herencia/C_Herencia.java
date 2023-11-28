package c_herencia;
    abstract class Vehiculo{
        protected String marca;
        public Vehiculo(String marca){
            this.marca = marca;
        }	
        public void arrancar(){
            System.out.println("Arrancando el vehiculo");
        }
    }
    abstract class Automovil extends Vehiculo{
        private String modelo;
        public Automovil(String marca, String modelo){
            super(marca);
            this.modelo = modelo;
        }
        public void conducir(){
            System.out.println("Counduciendo el automóvil");
        }
    }
public class C_Herencia{
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota","Corolla"){};
        miAuto.arrancar();
        miAuto.conducir();
    }
}

