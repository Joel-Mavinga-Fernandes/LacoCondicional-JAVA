import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

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
			
		System.out.println("A quantidade de n�meros pares s�o: "+ cont);
		System.out.println("A quantidade de n�meros impares s�o: " + con);
		
	}

}
}



