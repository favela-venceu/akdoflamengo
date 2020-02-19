/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretinho.fulero;
import javax.swing.JOptionPane;

/**
 *
 * @author tuxcuiabano
 */
public class PretinhoFulero {
    
     public static void main( String[] args )
   {
      
      String primeiroNumero = 
         JOptionPane.showInputDialog(" informe o primeiro número" );
      String segundoNumero =
          JOptionPane.showInputDialog( "informe  o segundo número" );

    
     double num1 = Integer.parseInt( primeiroNumero  ); 
     double num2 = Integer.parseInt( segundoNumero );
     
    
     
    String Operacao=
            JOptionPane.showInputDialog("digite qual operacao deseja fazer 1-adiçao  2-subtraçao 3-mutiplicaçao 4-divisao ");
     
     int op = Integer.parseInt(Operacao);
     
     if(op == 1 ){
         
       double soma = num1 + num2;
       JOptionPane.showMessageDialog(null, "Resultado é "+soma );
      
     }
     
     if(op == 2 ){
         
       double soma = num1 - num2;
       JOptionPane.showMessageDialog(null, "O resultado é  "+soma );  
     }
     if(op == 3 ){
         
       double soma = num1 * num2;
       JOptionPane.showMessageDialog(null, "O resultado é  "+soma );
     }
      if(op == 4 ){
         
       double soma = num1/num2;
       JOptionPane.showMessageDialog(null, "O resultado é  "+soma );  
       
      }
      
      if (op > 4) {
           JOptionPane.showMessageDialog("Numero invalido  ");
      }
          
     
   
      
      
	    
		
	
    
     
     
            
            
    
            
         
            
            
             
              

    
      
   } 

  
   
   } 
    
    
}

