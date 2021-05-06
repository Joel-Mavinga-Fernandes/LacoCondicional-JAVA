import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class LacoDeRepeticao2 {

	public static void main(String[] args) {
		 
		Scanner sis = new Scanner (System.in);
		
		int i, par=0, impar=0, cont=0, con=0;
		
		for (i=0; i<=10; i++) {
		System.out.println("Digite os valores: ");
		i = sis.nextInt();
		
		
		
		
		if(i%2==0) {
			cont++;

			}
		
		if(i%2!=0){
			con++;

			
			}
			
		System.out.println("A quantidade de números pares são: "+ cont);
		System.out.println("A quantidade de números impares são: " + con);
		
	}

}
}



