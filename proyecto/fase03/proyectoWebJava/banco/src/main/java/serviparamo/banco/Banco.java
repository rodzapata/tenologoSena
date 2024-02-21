package serviparamo.banco;

public class Banco {
    private Cliente cliente1, cliente2, cliente3;
    
    public Banco(){
       cliente1=new Cliente("Samuel");
       cliente2=new Cliente("cecilia");
       cliente3=new Cliente("Juan miguel");
        
    }
    
    public void operar(){
        cliente1.depositar(1000);
        cliente2.depositar(2500);
        cliente3.depositar(3000);
    }
    
    public void depositosTotales(){
        int total=cliente1.retornarMonto()+cliente2.retornarMonto()+cliente3.retornarMonto();
        System.out.println("El deposito total es de "+total);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
        
    }

    public static void main(String[] args) {
        System.out.println("---- Movimiento del Banco Sudameris -----");
        
        Banco banco1= new Banco();
        banco1.operar();
        banco1.depositosTotales();
        
    }
}
