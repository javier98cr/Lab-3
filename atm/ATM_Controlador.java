import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ATM_Controlador
{
    Cajero cajero;

    public static void main (String args[]){
        String resultado="";
        Cajero cajero=new Cajero ("6 de set de 2019");

        String msg="SELECCIONE OPCION\n";
        msg+="------ADMINISTRADOR-------\n";
        msg+="1. Cargue dinero en el ATM\n";
        msg+="2. Haga el cierre de caja\n";
        msg+="3. Defina moneda\n";
        msg+="---------CLIENTE----------\n";
        msg+="4. Instancie cliente\n";
        msg+="5. Retire dinero del ATM\n";
        msg+="6. Deposite dinero en el ATM\n";
        msg+="--------------------------\n";
        msg+="0. Termine\n";
        String den_S[];
        String cant_S[];
        String r;
        int op=-1;
        while(op != 0){
            op=Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch(op){
                case 1: //instanciacion inicial por la mañana
                //r=JOptionPane.showInputDialog("de denominaciones de billetes orden asc");
                cajero.instancieCajas();
                break;
                case 2:
                for (Caja c: cajero.caja){
                    
                }
                break;
                case 3:
                break;
                case 4:cajero.instancieClientes();
                break;

                case 0:

                break;
            }
        }
    }
}
