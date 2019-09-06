import java.util.ArrayList;

public class Transaccion
{
    int trans_id;            //numero de transaccion;
    String fecha;            //fecha de la transaccion
    int cliente_id;          //id del cliente que hizo la transaccion
    int transac_autor_id;    //# de autorizacion de la transaccion
    int moneda_id;           //id del tipo de moneda
    ArrayList <Integer> retiro;  //vector de billetes que se retiro en la transaccion

    public Transaccion(){
        trans_id=0; 
        retiro=new ArrayList <Integer> ();
    }

    public String getData(int denom[], String m[]){
        String r="# transac="+trans_id+" Fecha="+fecha+" #Cliente="+cliente_id+" #Autorizacion="+transac_autor_id+
            " # de id de la Moneda="+moneda_id+"\n";
        int monto=0;
        for(int i=0;i<retiro.size();i++){
            if (retiro.get(i)>0){
                r+=retiro.get(i)+" billetes de "+denom[i]+" "+m[moneda_id];
                monto+=denom[i]*retiro.get(i);
            }
        }
        return r+"\nTotal ="+monto+" "+m[moneda_id];
    }

    public void addTransac( String f, int c, int autor, int m, int[] b, int am){
        trans_id=++trans_id;
        fecha=f;
        cliente_id=c;
        transac_autor_id=autor;
        moneda_id=m;
        for(int i=0;i<b.length;i++){
            retiro.set(i,b[i]);
        }
    }
}
