import java.util.Scanner;
//Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero)
public class lacoDeRepeticao6 {

	public static void main(String[] args) {
		Scanner sis = new Scanner (System.in);
		
		int num, soma=0, cont=0, media=0;
		
		do {
			System.out.println("Digite os n�meros inteiros: ");
			num = sis.nextInt();
			
		
		
			
				if(num%3==0) {
				
				soma+=num;
				cont++;
				media= soma/cont;
			}
		}
			while(num!=0); {
		
			}
			System.out.println("A m�dia dos n�meros multiplos de 3 �: " + media);
			
		}
				
}
	
	

	


