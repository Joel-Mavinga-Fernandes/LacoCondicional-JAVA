import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
//idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//o número de pessoas calmas; 
//o número de mulheres nervosas; 
//o número de homens agressivos; 
//o número de outros calmos;
//o número de pessoas nervosas com mais de 40 anos; 
//o número de pessoas calmas com menos de 18 anos.

public class LacoDeRepeticao4 {
public static void main(String[] args) {
	
	Scanner sis = new Scanner (System.in);
	
	int num=0, idade, sexo, opcoes, calma=0, mulheresNervosas=0, homensAgressivos=0, femenino=0, masculino=0, outrosCalmos=0, nerv40=0, calmo18=0;
	
	while(num<150) {
		System.out.println("Digite a idade: ");
		idade = sis.nextInt();
		
		System.out.println("Digite o sexo: \n 1- Feminino \n 2- Masculinos \n 3-Outros  ");
		sexo = sis.nextInt();
		
		System.out.println("Digite a opções: \n 1-Calmo(a)  \n 2-Nervosa(o) \n 3-Agressivo(a)  ");
		opcoes = sis.nextInt();
		
		num++; 
		if(opcoes==1) {
			calma++;	
		}
		if(sexo==2 && opcoes==2) {
			mulheresNervosas++;
		}
		if(sexo==2 && opcoes==3) {
			homensAgressivos++;
		}
		if(sexo==3 && opcoes==1) {
			outrosCalmos++;
		}
		if(opcoes==2 && idade>40) {
			nerv40++;
		}
		if(opcoes==1 && idade<18) {
			calmo18++;
		}	
		
		System.out.println("O número de pessoas calmas é: "+ calma);
		System.out.println("O número de homes agressivos é: "+ homensAgressivos);
		System.out.println("O número de outos(a) calmos(a) é: "+ outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+ nerv40);
		System.out.println("O número de pessoas calmos(a) com menos de 18 anos é: "+ calmo18);
		

			
			
		}
		
	
	
		
		
		
		
	}
	
}

