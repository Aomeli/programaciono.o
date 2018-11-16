/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entregabke;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    public void guardar(Usuario u)throws Exception
    {
        File f= new File ("usuarios");
        if(f.exists()) usuarios=leertodos();
        FileOutputStream fos= new FileOutputStream(f);     
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    public ArrayList<Usuario> leertodos() throws Exception
    {
    File f=new File("usuarios");
     FileInputStream fis= new FileInputStream(f);  
     ObjectInputStream ois= new ObjectInputStream(fis);
     usuarios=(ArrayList<Usuario>)ois.readObject();
    return usuarios;
    }
    
    public void Borrar(int id)throws Exception
    {
         usuarios=leertodos();
        usuarios.remove(id);
         File f= new File ("usuarios");
         FileOutputStream fos= new FileOutputStream(f);     
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(usuarios);
        System.out.println("borrados");
    }
        public void actualizar(int id ,Usuario u2)throws Exception
    {
        File f= new File ("usuarios");
          usuarios=leertodos();
        FileOutputStream fos= new FileOutputStream(f);     
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        usuarios.set(id, u2);
        oos.writeObject(usuarios);
        System.out.println("actualizados");
    }
    
}
