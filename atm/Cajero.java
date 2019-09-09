import java.util.ArrayList;

public class Cajero
{
    String fecha;
    int id;                           //# del cajero
    ArrayList<Caja> cajas;             //conjunto de cajas que maneja el cajero. Cda caja refiere una moneda diferente
    ArrayList<Transaccion> transac;   //Conjunto de transacciones del dia
    ArrayList<Cliente> clientes;       //Conjunto de clientes que se sirven del ATM

    public Cajero(String f){
        fecha = f;
        id = 0;
        cajas = new ArrayList<Caja>();
        transac = new ArrayList<Transaccion>();
        clientes = new ArrayList<Cliente>();
    }

    public void instancieClientes(){
        clientes.add(new Cliente(1,"Juan Perez", 123, 500000));
        clientes.add(new Cliente(2,"Carmen Bonilla", 111, 2000000));
        clientes.add(new Cliente(3,"Kenneth Cruz", 222, 1200000));
        clientes.add(new Cliente(4,"Pamela Mata", 444, 2400000));
        clientes.add(new Cliente(5,"Ariadna Lopez", 717, 12000));
    }

    public void instancieCajas(){
        Moneda m1 = new Moneda(1, "Colon", 1.0, "24 de junio - 1998");
        Moneda m2 = new Moneda(2, "Dolar", 582.0, "24 de junio - 1997");
        Moneda m3 = new Moneda(3, "Euro", 611.0, "24 de junio - 1995");
        cajas.add(new Caja(1,"6 set 19", new int[]{1000, 2000, 5000, 10000, 20000}, 
                new int[]{200, 200, 200, 200, 200}, m1 ));
        cajas.add(new Caja(2,"6 set 19", new int[]{1, 2, 5, 10, 20, 50, 100}, 
                new int[]{200, 200, 200, 200, 200, 200, 200}, m2));
        cajas.add(new Caja(3,"6 set 19", new int[]{5, 10, 20, 50, 100, 500}, 
                new int[]{200, 200, 200, 200, 200, 200}, m3));
    }
    
    public boolean retiro(int monto, int pinC, int c){
        boolean r1 = true;
        boolean r2 = true;
        Cliente client = null;
        for (Cliente cliente: clientes) {
            if(cliente.pin == pinC){
                r1 = cliente.retire(monto);
                client = cliente;
            }
        }
        if(!r1){
            return false;
        }
        Caja caja = cajas.get(c);
        int[] billetes = caja.getBills(monto);
        if(billetes == null){
            client.deposite(monto); //Rollback del retiro
            return false;
        }
        return true;
    }
    
    public boolean deposito(int monto, int pinC, int c){
        boolean r1 = true;
        for (Cliente cliente: clientes) {
            if(cliente.pin == pinC){
                r1 = cliente.deposite(monto);
            }
        }
        Caja caja = cajas.get(c);
        caja.setBills(monto);
        return true;
    }
    
    public int[] deCierreCaja(int i){
        return cajas.get(i-1).getBalance();
    }

    public void setCaja(int d[], int c[], Moneda m){
        cajas.add(new Caja(id++, fecha, d, c, m));
    }
}
