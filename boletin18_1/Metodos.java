/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Metodos {
 
    
    public int[] creatArray(){  
       int x =Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Array"));
        int boletin18[] = new int[x];        
        for(int i=0;i<boletin18.length;i++){
            int y = (int) (Math.random()*((50-0)+1));
            boletin18[i]=y;
        }
    return boletin18;
    }
    public void showArray(int[] p_array){   
       
        for(int i=0;i<p_array.length;i++){
            System.out.println(p_array[i]);            
        }
    }
    public void showArraySort(int[] p_array){   
       Arrays.sort(p_array);
        for(int i=0;i<p_array.length;i++){
            System.out.println(p_array[i]);            
        }
    }
}
