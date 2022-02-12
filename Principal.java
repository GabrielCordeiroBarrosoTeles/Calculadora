package exercicio1;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
		int opcao;
		double a, b, resultado = 0;
		Scanner ent = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		System.out.println("\tCalculadora\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Raiz\n6 - Potência");
		System.out.println("Escolha uma opção acima: ");
		opcao = ent.nextInt();
		System.out.println("Digite o valor de A: ");
		a = ent.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = ent.nextDouble();
		switch(opcao) {
			case 1:
				resultado = calc.somar(a, b);
				break;
			case 2:
				resultado = calc.subtrair(a, b);
				break; 
			case 3:
				resultado = calc.multiplicar(a, b);
				break;
			case 4:
				resultado = calc.dividir(a, b);
				break;
			case 5:
				System.out.println("A raiz será calculada com o valor de a");
				resultado = calc.raiz(a);
				break;
			case 6:
				resultado = calc.potencia(a, b);
				break;
			default:
				System.out.println("Opção inválida!!!");
				break;
		}System.out.println("Resultado= "+resultado);   }   }

