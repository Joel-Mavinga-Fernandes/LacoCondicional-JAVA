import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
public class LacoDeRepeticao3 {

	public static void main(String[] args) {
		Scanner sis = new Scanner (System.in);
		
		int idade=0, cont=0, con=0;
		
		while(idade!=-99) {
			
			System.out.println("Digite a idade por favor: ");
			idade = sis.nextInt();
			
			
			
			
			if(idade<21) {
				cont++;
				
			}
			
			if (idade>50) {
				con++;
			}
			
			System.out.println(" O total de pessoas com menos de 21 anos: "+ cont);
			System.out.println(" O total de pessoas com mais de 50 anos: "+ con);
		}
		

	}

}
