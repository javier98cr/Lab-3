
public class Controlador_Moneda
{
    public static void main (String ars[]){
        Moneda m=null;
        Visualizador_Moneda vm=new Visualizador_Moneda();
        String nombre=vm.leaHil("nombre de la moneda");
        double tipo_cambio=vm.leaDouble("tipo de cambio con el colon costarricense");
        String fecha=vm.leaHil("fecha en que procede el tipo_cambio");
        m=new Moneda();
        m.setData(1,nombre, tipo_cambio, fecha);
    }
}
