package boletin11;

import javax.swing.JOptionPane;

public class Boletin11 {

    public static void main(String[] args) {
        Clase11 obj=new Clase11();
        
        long time_start, time_end;
        obj.mensaje();
        time_start =System.currentTimeMillis();
        obj.escribir();
        time_end =System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tardaches " + ((time_end - time_start)/1000 )+ "  segundos en escribir a frase");
    }
    
}
