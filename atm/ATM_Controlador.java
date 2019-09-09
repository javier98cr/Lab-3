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
        boolean inicial001 = false;
        boolean inicial002 = false;
        boolean result = true;
        int monto;
        int pinC;
        int c;
        String msg2 = "Seleccione una opcion de moneda:\n";
        msg2 += "1. Colones\n";
        msg2 += "2. Dolares\n";
        msg2 += "3. Euros\n";
        while(op != 0){
            op = Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch(op){
                case 1: //instanciacion inicial por la mañana
                    if(!inicial001){
                        cajero.instancieCajas();
                        inicial001 = true;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    if(!inicial002){
                        cajero.instancieClientes();
                        inicial002 = true;
                    }
                    break;
                case 5:
                    monto = Integer.parseInt(JOptionPane.showInputDialog("Diguite el monto a retirar: "));
                    pinC = Integer.parseInt(JOptionPane.showInputDialog("Diguite el pin de su cuenta: "));
                    c = Integer.parseInt(JOptionPane.showInputDialog(msg2));
                    result = cajero.retiro(monto, pinC, c-1);
                    if(!result){
                        JOptionPane.showMessageDialog(null, "Ocurrio un error al realizar el retiro.\nIntente de nuevo");
                    }else{
                        JOptionPane.showMessageDialog(null, "Retiro realizado con exito");
                    }
                    break;
                case 6:
                    monto = Integer.parseInt(JOptionPane.showInputDialog("Diguite el monto a retirar: "));
                    pinC = Integer.parseInt(JOptionPane.showInputDialog("Diguite el pin de su cuenta: "));
                    c = Integer.parseInt(JOptionPane.showInputDialog(msg2));
                    result = cajero.deposito(monto, pinC, c-1);
                    JOptionPane.showMessageDialog(null, "Deposito realizado con exito");
                    break;
            }
        }
    }
}
