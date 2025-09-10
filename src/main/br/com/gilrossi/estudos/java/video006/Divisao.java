package video006;

public class Divisao {	

	//dividir byte
	byte dividirByte(byte num1, byte num2) {
		byte resultado = (byte) (num1 / num2);
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		return resultado;
	}

	//dividir short
	short dividirShort(short num1, short num2) {
		short resultado = (short) (num1 / num2); 
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		return resultado;
	}	

	// dividir double
	double dividirDouble(double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		return resultado;
	}

	// dividir intenger
	int dividirInt(int num1, int num2) {
		int resultado = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		return resultado;
	}

	// dividir float
	float dividirFloat(float num1, float num2) {
		float resultado = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		return resultado;
	}

	//dividir long
	long dividirLong(long num1, long num2) {
		long resultado = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + resultado);
		return resultado;
	}
}