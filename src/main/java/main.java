
import com.formdev.flatlaf.FlatLightLaf;
import com.forms.OrderForm;
import com.forms.StockForm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lordz
 */
public class main {
    public static void main(String args[]) {
        System.setProperty("flatlaf.useNativeLibrary", "false");
        FlatLightLaf.setup();
    java.awt.EventQueue.invokeLater(() -> {
        // Replace 'MyForm' with the exact name of your current Java file
       
        
        new OrderForm().setVisible(true);
    });
}
}
