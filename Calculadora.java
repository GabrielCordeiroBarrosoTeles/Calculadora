package exercicio1;
public class Calculadora {
double resultado;
	public double somar(double a, double b) {
		resultado = a+b;
		return resultado;
	}public double subtrair(double a, double b) {
		resultado = a-b;
		return resultado;
	}public double multiplicar(double a, double b) {
		resultado = a*b;
		return resultado;
	}public double dividir(double a, double b) {
		resultado = a/b;
		return resultado;
	}public double raiz(double a) {
		resultado = Math.sqrt(a);
		return resultado;
	}public double potencia(double a, double b) {
		resultado = Math.pow(a, b);
		return resultado;
}}
