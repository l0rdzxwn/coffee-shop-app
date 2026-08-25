
import com.formdev.flatlaf.FlatLightLaf;
import com.forms.Login;

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
        new Login().setVisible(true);
    });
}
}
