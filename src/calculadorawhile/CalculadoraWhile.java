
package calculadorawhile;

import java.util.Scanner;


public class CalculadoraWhile {

 
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
         
         
         while(true){
             System.out.println("Menu de opciones");
             System.out.println("1.Suma");
             System.out.println("2.Resta");
             System.out.println("3.Multiplicacion");
             System.out.println("4.Division");
             System.out.println("5.Salir");
             System.out.println("Elige una opcion");
             int opcion= entrada.nextInt();
             
             if(opcion==5){
                 System.out.println("Gracias por utilizar nuestros servicios");
                 break;
             }
             System.out.println("Ingresa primer numero");
             double num1=entrada.nextDouble();
             System.out.println("Ingresa el segundo nuemro");
             double num2=entrada.nextDouble();
             double resultado;
             
             switch(opcion){
                case 1:
                    resultado= num1+num2;
                    System.out.println("El resultado de la suma entre"+num1+"+"+num2+"="+resultado);
                     break;
                case 2:
                    resultado= num1-num2;
                    System.out.println("El resultado de la resta entre"+num1+"-"+num2+"="+resultado);
                     break;
                    
                case 3:
                    resultado= num1*num2;
                    System.out.println("El resultado de la multiplicacion entre"+num1+"X"+num2+"="+resultado);
                     break;
                
                case 4:
                    if(num2!=0){
                    resultado= num1/num2;
                    System.out.println("El resultado de la division entre"+num1+"7"+num2+"="+resultado);
                    }else{
                        System.out.println("Error, no se puede dividir por cero");
                    }
                     break;
                default:
                    System.out.println("Opcion no valida");
                     
             }
             
         }
    }
    
}
