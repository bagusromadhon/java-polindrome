/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
 import java.util.Scanner;
/**
 *
 * @author USER
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
//       int target = 9 ;
//       int total ;
//       
//       int nums[]={2, 7, 11, 15};
//       
//       for (int i = 0; i < 3; i++) 
//        {
//         total = nums[i]+nums[1+i];
//            if (total == target) 
//            {
//                System.out.println("["+i+","+(1+i)+"]");
//            }
//        }
        // TODO code application logic here
//       
//    int target = 6;
//    int total;
//    
//    int nums[]={3, 2, 4};
//    
//        for (int i = 0; i < 2; i++) {
//            total = nums[i]+nums[1+i];
//            if (total == target) 
//            {
//                System.out.println(i+","+(1+i));    
//            }
//            
//        }
    
        int nilai =keyboard.nextInt();
        String temp = Integer.toString(nilai);
        int [] nilais = new int[temp.length()];
        for (int i = 0; i<temp.length(); i++){
               nilais[i] = temp.charAt(i)- '0';
              
        }
        
//        membandingkan nilai awal dan nilai akhir
        int nilaiakhir = nilais.length;
        if (nilais[0]==nilais[nilaiakhir-1]) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        
    }
    
}
