package serviparamo.banco;
public class Cliente {
    private String nombre;
    private int monto;


    public Cliente(String nom) {
        nombre = nom;
        monto = 0;
    }
    
    
    
    public void depositar(int m){
        monto=monto+m;
    }
    
    public void extraer(int m){
        monto=monto-m;
    }
    public int retornarMonto(){
        return monto;
    }
    public void imprimir(){
        System.out.println("el cliente "+nombre+ " tiene un saldo de "+monto);
    }
}
