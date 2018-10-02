/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author T-101
 */
public class IMC {
    float peso;
    float altura;
    float indice;

    public IMC(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

   void calcularIMC(float indice) {
        indice =(peso/altura*altura);
    }
    
            
}
