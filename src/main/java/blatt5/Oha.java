package blatt5;

public class Oha {
	public static void main(String[] args) {
		short i;
		byte by;

		boolean bo;
		i = 222;
		by = (byte) i;
		
//		short s = 127;
//		System.out.println( (byte)s );
		
		//byte = 8 bit, Überlauf ab 127
		System.out.println(" i : " + i + " \tby: " + by);
		bo = (i == by);
		System.out.println(" i == by : " + bo);
		i = 127;
		by = (byte) i;
		System.out.println(" i : " + i + "\tby: " + by);
		bo = (i == by);
		System.out.println(" i == by : " + bo);
		i = 128;
		by = (byte) i;
		System.out.println(" i : " + i + "\tby: " + by);
		bo = (i == by);
		System.out.println(" i == by : " + bo);
	}
}
