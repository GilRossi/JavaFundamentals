package video006;

public class Multiplicacao {

	// multiplicar byte
	byte multiplicarByte(byte num1, byte num2) {
		byte resultado = (byte) (num1 * num2);
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		return resultado;
	}

	// multiplicar short
	short multiplicarShort(short num1, short num2) {
		short resultado = (short) (num1 * num2); 
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		return resultado;
	}	

	// multiplicar double
	double multiplicarDouble(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		return resultado;
	}

	// multiplicar intenger
	int multiplicarInt(int num1, int num2) {
		int resultado = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		return resultado;
	}

	// multiplicar float
	float multiplicarFloat(float num1, float num2) {
		float resultado = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		return resultado;
	}

	//multiplicar long
	long multiplicarLong(long num1, long num2) {
		long resultado = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + resultado);
		return resultado;
	}
}