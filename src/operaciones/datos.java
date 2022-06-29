package operaciones;

public class datos {

	public static void main(String[] args) {
		int num1=32;
		long num2=5678;
		short num3=5;
		double num4=65475475;
		long suma=num1+num2;
		double resta=num4-num3;
		double multiplicacion=num3*num4;
		long module=num2%num1;
		char b='c';
		String hola="hello";
		String mo="mundo";
		String n=hola+mo;
		String j=mo+num3;
		System.out.println(j);
		System.out.println(n);
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(module);
		System.out.println("hola"+mo);
		System.out.println(mo+b);
	}

}
