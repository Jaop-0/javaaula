package Uga;
import java.util.*;
public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner pratos = new Scanner(System.in);
		System.out.print("Selecione um prato: \n\n 1 - Vegetariano \n 2 - Peixe \n 3 - Frango \n 4 - Carne ");
		
		int prato = pratos.nextInt();
		switch (prato) {
		  case 1:
		    System.out.println("Vegetariano 180 cal");
		    break;
		  case 2:
		    System.out.println("Peixe 230 cal");
		    break;
		  case 3:
		    System.out.println("Frago 250 cal");
		    break;
		  case 4:
		    System.out.println("Carne 350 cal");
		    break;
		  default:
		    System.out.println("Valor inexistente");
		    break;
		 
	}
	



         Scanner Sobremesas = new Scanner(System.in);
         System.out.print("Selecione um prato: \n 1 - Abacaxi \n 2 - Sorvete diet \n 3 - Mouse diet \n 4 - Mouse chocolate");
	 
	        int prato = pratos.nextInt();
		switch (prato) {
         
         int Sobremesa = Sobremesa = Sobremesas.nextInt();
         switch (Sobremesa) {
         case 1:
        	 System.out.println("Abacaxi 75 cal");
        	 break;
         case 2:
                System.out.println("Sorvete 110 cal");
		break;
	case3:	
	
