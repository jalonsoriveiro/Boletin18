/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;

/**
 *
 * @author jose
 */
public class Boletin18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                Metodos obj = new Metodos();
                obj.showArray(obj.creatArray());
                System.out.println("------");
                obj.showArraySort(obj.creatArray());
                       
    }
    
}
