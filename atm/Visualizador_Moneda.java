import javax.swing.JOptionPane;

public class Visualizador_Moneda
{       

    public void muestre(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    public int leaOpcion(String msg, int in, int ax){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(msg));
            if((op<in) || (op>ax)){
                JOptionPane.showMessageDialog(null, "Valor fuera de rango", "Sea chapa", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }while ((op<in) || (op>ax));
        return op;
    }

    public String leaHil(String h){
        return JOptionPane.showInputDialog(h);
    }

    public double leaDouble(String h){
        return Double.parseDouble(JOptionPane.showInputDialog(h));
    }
}
