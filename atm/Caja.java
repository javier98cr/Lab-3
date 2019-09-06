
public class Caja
{
    int id;
    String fecha;
    int denom[];
    int cant[];
    Moneda moneda; 

    public Caja(int ident, String f, int d[], int c[], Moneda m){
        id=ident;
        fecha=f;
        moneda=m;
        for (int i=0;i<d.length;i++){
            denom[i]=d[i];
            cant[i]=c[i];
        }
    }

    /**retorna un vector con cantidad de billetes que sumen un monto dado.
     * también actualiza el saldo de billetes en existencia
     */
    public int[] getBills(int t, int am){
        int []r=new int[denom.length];
        for (int i=denom.length-1; i>=0; i--){
            r[i]=0;
        }

        for (int i=denom.length-1; i>=0 && am>0; i--){
            r[i]=am/denom[i];
            cant[i]-=r[i];
            am-= r[i]*denom[i];
        }
        return r;
    }

    /** 
    retorna un vector con las diferentes denominaciones de billetes en existencia
     */
    public int[] getDenom(){
        int []r=new int[denom.length];

        for (int i=denom.length-1; i>=0; i--){
            r[i]=denom[i];
        }
        return r;
    }
    
    /** 
    retorna el saldo de billetes de cada denominacion 
    */
    public int[] getBalance(){
        int []r=new int[denom.length];

        for (int i=denom.length-1; i>=0; i--){
            r[i]=cant[i];
        }
        return r;
    }
}
