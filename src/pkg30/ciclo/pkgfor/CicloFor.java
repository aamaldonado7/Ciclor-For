/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.ciclo.pkgfor;

/**
 *
 * @author Alejandro Maldonado
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* for ( int i =1; i < 10; i++){
            System.out.println (
            "Entrada a bloque No." + i
            );
        }*/
       /*boolean prueba = false;
       
       
       while (prueba){
       System.out.println(
       "Esto es un mensaje, lo veraz una vez"
       );
       
       prueba = false;*/
       
       int numero = 455;
       int digitos = 0;
       
       do {
           numero /= 10;
           digitos++;
       }    
       while (numero > 0);
       
       System.out.println(digitos);
       }
       
        // TODO code application logic here
}
    

