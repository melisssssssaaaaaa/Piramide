import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("altura da piramide: ");
		
		double h = entrada.nextFloat();
		System.out.print("Informe AB da piramide: ");
		double ab = entrada.nextFloat();
		
		System.out.print("Informe o tipo de tinta (1 - R$ 127,90;- R$ 258,98; 3 - R$ 344,34): ");
		int tinta = entrada.nextInt();
		double al = calcularAL(ab, h);
		double aTriangulo = calcularATriangulo(ab, h);
		double aBase = calcularABase(ab);
		double aTotal = calcularATotal(ab, h);
		double litros = calcularLitros(aTotal);
		double qtdLatas = calcularLatas(litros);
		double preco = calcularPreco(qtdLatas, tinta);
		double volume = calcularVolume(ab, h);
		System.out.println("AB: " + ab);
		System.out.println("H: " + h);
		System.out.println("AL: " + al);
		System.out.println("Área triangulo: " + aTriangulo);
		System.out.println("Área base: " + aBase);
		System.out.println("Área Total: " + aTotal);
		System.out.println("Tipo da Tinta: " + tinta);
		System.out.println("Litros: " + litros);
		System.out.println("Quantidade de Latas: " + qtdLatas);
		System.out.println("Preço: " + preco);
		System.out.println("Volume: " + volume);
		entrada.close();
	}
	public static double calcularATriangulo(double ab, double h){
		return (ab * 2) * h / 2;
	}
	
	public static double calcularAL(double ab, double h) {
		return Math.sqrt(Math.pow(h, 2) + Math.pow(ab, 2));
	}
	public static double calcularABase(double ab) {
		return Math.pow((ab) * 2, 2);
	}
	public static double calcularATotal(double ab, double h) {
		double al = calcularAL(ab, h);
		double inter = (al * (ab * 2)) / 2;
		double bt = calcularABase(ab);
		return (inter * 4) + bt;
	}
	public static double calcularLitros(double at) {
		return at / 4.76;
	}
	public static double calcularLatas(double litrosP) {
		return Math.ceil(litrosP / 18);
	}
	public static double calcularPreco(double qtdLatas, int tinta) {
		double precoL;
		if (tinta == 1) {
			precoL = qtdLatas * 127.90;
		}else if (tinta == 2) {
			precoL = qtdLatas * 258.98;
		}else {
			precoL = qtdLatas * 344.34;
		}
		return precoL;
	}
	public static double calcularVolume(double ab, double h) {
		return (Math.pow(ab, 2) * h) / 3;
	}
}