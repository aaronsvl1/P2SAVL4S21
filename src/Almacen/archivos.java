/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import infomacion.Datos;
import infomacion.convertir;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shack
 */
public class archivos {
    List<Datos> contenido = new ArrayList<>();
    
    public List<Datos> Leer(){
        String linea;
        Datos datos;
        try {
            FileReader archivo = new FileReader("DATOS.ser");
            BufferedReader br = new BufferedReader(archivo);
            
            while((linea = br.readLine())!= null){
                datos = new Datos();
                convertir Convertir = new convertir();
                datos = Convertir.aclass(linea);
                System.out.println("valor de linea" +linea );
                contenido.add(datos);
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contenido;
    }
    public boolean grabar(Datos cadena){
        convertir Convertir= new convertir();
        boolean estado= true;
        FileWriter archivo;
        try {
            archivo = new FileWriter("DATOS.ser", true);
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write(Convertir.ajson(cadena)+"\n");
            bw.close();
            archivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            estado = false;
        } 
        return estado;
    }
}
