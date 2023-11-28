package c_encapsulacion;
    abstract class CuentaBancaria{
        private String titular;
        private double saldo;
        public CuentaBancaria(String titular, double saldoInicial){
            this.titular = titular;
            this.saldo = saldoInicial;
        }
        public void depositar(double monto){
            saldo += monto;
        }
        public void retirar(double monto){
            if(monto <= saldo){
                saldo -= monto;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
        public double obtenerSaldo(){
            return saldo;
    }
}     
public class C_Encapsulacion{    
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Camila Ortega", 1000){};
        miCuenta.depositar(500);
        miCuenta.retirar(200);
        System.out.println("Saldo actual: " + miCuenta.obtenerSaldo());
    }
        
}
