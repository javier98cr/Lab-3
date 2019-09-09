
public class Moneda
{
    int id; //numero de moneda
    String nombre; //nombre de la moneda
    double tipo_cambio; //tipo de cambio con el colon costarricense
    String fecha; //fecha en que procede el tipo_cambio
    
    public Moneda(int idM, String n, double ca, String fc){
        id = idM;
        nombre = n;
        tipo_cambio = ca;
        fecha = fc;
    }
    
    public String getName(){
        return nombre;
    }
    
    public double getCurrency(){
        return tipo_cambio;
    }
    
    public void setData(int idM, String n, double ca, String fc){
        id = idM;
        nombre = n;
        tipo_cambio = ca;
        fecha = fc;
    }
}