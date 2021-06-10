import java.util.*;
public class ejercicio4{

	public static void main(String[] args){
		int mayorEdad=0;
		int menorEdad=0;
		int edad;
		Scanner scanner=new Scanner(System.in);

		for(int i=0;i<20;i++){
			System.out.print((i+1) +") Ingrese la edad: ");
			edad=scanner.nextInt();

			if(edad>mayorEdad){
				mayorEdad=edad;
			} 
			else if(edad<mayorEdad){
				menorEdad=edad;
			}
		}
		System.out.println("La edad mayor es: "+mayorEdad+" años");
		System.out.println("La edad menor es: "+menorEdad+" años");
	}
}