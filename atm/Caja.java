
public class Caja
{
    int id;
    String fecha;
    int[] denom;
    int[] cant;
    Moneda moneda; 

    public Caja(int ident, String f, int d[], int c[], Moneda m){
        id=ident;
        fecha=f;
        moneda=m;
        denom = new int[d.length];
        cant = new int[c.length];
        for (int i=0;i<d.length;i++){
            denom[i] = d[i];
            cant[i] = c[i];
        }
    }

    /**retorna un vector con cantidad de billetes que sumen un monto dado.
     * también actualiza el saldo de billetes en existencia
     */
    public int[] getBills(int monto){
        int[] r = new int[denom.length];
        for (int i = (denom.length - 1); i >= 0; i--){
            r[i] = 0;
        }
        
        for (int i = (denom.length - 1); i >= 0 || monto > 0; i--){
            r[i] = monto / denom[i];
            if((cant[i]-r[i]) >= 0){
                cant[i] -= r[i];
                monto -= r[i]*denom[i];
            }else{
                for(int j = 0; j < r[i]; j++){
                    r[i]--;
                    if((cant[i]-r[i]) >= 0){
                        cant[i] -= r[i];
                        monto -= r[i]*denom[i];
                    }
                }
            }
        }
        
        if(monto > 0){
            for (int i = (r.length - 1); i >= 0; i--){
                cant[i] += r[i];
            }
            r = null;
        }
        return r;
    }
    
    public void setBills(int monto){
        int[] r = new int[denom.length];
        for (int i = (denom.length - 1); i >= 0; i--){
            r[i] = 0;
        }
        
        for (int i = (denom.length - 1); i >= 0 && monto > 0; i--){
            r[i] = monto / denom[i];
            cant[i] += r[i];
            monto -= r[i]*denom[i];
        }
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
