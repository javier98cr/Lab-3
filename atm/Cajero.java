import java.util.ArrayList;

public class Cajero
{
    String fecha;
    int id;                           //# del cajero
    ArrayList<Caja> caja;             //conjunto de cajas que maneja el cajero. Cda caja refiere una moneda diferente
    ArrayList<Transaccion> transac;   //Conjunto de transacciones del dia
    ArrayList<Cliente> cliente;       //Conjunto de clientes que se sirven del ATM

    public Cajero(String f){
        fecha=f;
        id=0;
        caja=  new  ArrayList<Caja>();
        transac= new ArrayList<Transaccion>();
        cliente= new ArrayList<Cliente>();
    }

    public void setCaja(int d[], int c[], Moneda m){
        caja.add(new Caja(id++, fecha, d, c, m));
    }

    public void instancieClientes(){
        cliente.add(new Cliente(1,"Juan Perez", 123, 500000));
        cliente.add(new Cliente(2,"Carmen Bonilla", 111, 2000000));
        cliente.add(new Cliente(3,"Kenneth Cruz", 222, 1200000));
        cliente.add(new Cliente(4,"Pamela Mata", 444, 2400000));
        cliente.add(new Cliente(5,"Ariadna Lopez", 543, 12000));
    }

    public void instancieCajas(){
        Moneda m1 = new Moneda();
        m1.setData(1, "Colon", 1.0, "24 de junio - 1998");
        Moneda m2 = new Moneda();
        m2.setData(2, "Dolar", 582.0, "24 de junio - 1997");
        Moneda m3 = new Moneda();
        m3.setData(1, "Euro", 611.0, "24 de junio - 1995");
        caja.add(new Caja(1,"6 set 19", new int[]{1000, 2000, 5000, 10000, 20000}, 
                new int[]{200, 200, 200, 200, 200}, m1 ));
        caja.add(new Caja(2,"6 set 19", new int[]{1, 2, 5, 10, 20,50,100}, 
                new int[]{200, 200, 200, 200, 200,200,200}, m2));
        caja.add(new Caja(3,"6 set 19", new int[]{5, 10, 20,50, 100, 500}, 
                new int[]{200, 200, 200, 200, 200,200}, m3));
    }

    public int[] deCierreCaja(int i){
        return caja.get(i-1).getBalance();
    }
}
