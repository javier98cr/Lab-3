

public class Cliente
{
    int id; //identificaciion del cliente
    String nombre; //nombre completo del cliente
    int pin; //numero de identificacion personal
    int saldo;
    
    public Cliente(int i, String n, int p, int s){
        id=i;
        nombre=n;
        pin=p;
        saldo=s;
    }
    
    public double deSaldo(){
        return saldo;
    }
    
    public boolean retire(int monto){
        if(saldo < monto){
            return false;
        }else{
            saldo -= monto;
            return true;
        }
    }
    
    public boolean deposite(int monto){
        saldo += monto;
        return true;
    }
}
