/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entregabke;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class Probar {
    
    public static void main(String[] args) {
       
            Usuario u1=new Usuario("ana",20,8000);
            Usuario u2=new Usuario("sam",23,1000);
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
           //p.guardar(u2);
         // p.Borrar(1);
                  //p.actualizar(0,u2);

            for(Usuario u:p.leertodos())
            {
                System.out.println(u);
            }
        } catch (Exception ex) {
            Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
        
        
        
    }
}
