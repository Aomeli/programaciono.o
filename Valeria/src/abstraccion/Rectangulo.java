/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class Rectangulo {
float alto;
float ancho;
float area;

    public Rectangulo(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }


void calcularArea(){
   area=(alto*ancho); 
}
}
