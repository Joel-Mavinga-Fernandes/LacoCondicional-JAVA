import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
//No final, mostre a soma dos n�meros digitados.
public class LacoDeRepeticao5 {

	public static void main(String[] args) {
		
		Scanner sis = new Scanner (System.in);
		
		int valor=0, soma=0;
		
		do {
			System.out.println("Digite o valor ");
			valor = sis.nextInt();
			soma+= valor;
		}
		while(valor!=0); {
		
		
		System.out.println("A soma dos valores �: "+ soma);
		}
		
		}
	

}
