

public class Cliente
{
    int id; //identificaciion del cliente
    String nombre; //nombre completo del cliente
    int pin; //numero de identificacion personal
    double saldo;
    
    public Cliente(int i, String n, int p, double s){
        id=i;
        nombre=n;
        pin=p;
        saldo=s;
    }
    
    public double deSaldo(){
        return saldo;
    }
}
