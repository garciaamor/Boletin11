package boletin11;

import javax.swing.JOptionPane;

public class Boletin11 {

    public static void main(String[] args) {
        Clase11 obj=new Clase11();
        
        long por, time_end;
        obj.mensaje();
        por =System.currentTimeMillis();
        obj.escribir();
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR");
        time_end =System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tardaches " + ((time_end - por)/1000 )+ "  segundos en escribir a frase");
    }
    
}
