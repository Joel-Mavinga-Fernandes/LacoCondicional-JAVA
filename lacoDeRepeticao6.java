import java.util.Scanner;
//Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
public class lacoDeRepeticao6 {

	public static void main(String[] args) {
		Scanner sis = new Scanner (System.in);
		
		int num, soma=0, cont=0, media=0;
		
		do {
			System.out.println("Digite os números inteiros: ");
			num = sis.nextInt();
			
		
		
			
				if(num%3==0) {
				
				soma+=num;
				cont++;
				media= soma/cont;
			}
		}
			while(num!=0); {
		
			}
			System.out.println("A média dos números multiplos de 3 é: " + media);
			
		}
				
}
	
	

	


