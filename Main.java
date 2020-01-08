
public class Main {

	public static void main(String[] args) {
		int myVaule = 10000;
		int myMinIntVaule = Integer.MIN_VALUE;
		int myMaxIntVaule = Integer.MAX_VALUE;
		System.out.println("Integer min vaule = " + myMinIntVaule);
		System.out.println("Integer max vaule = " + myMaxIntVaule);
		
		long myLongVaule = 100L;
		long myMinLongVaule = Long.MIN_VALUE;
		long myMaxLongVaule = Long.MAX_VALUE;
		System.out.println("Long min vaule = " + myMinLongVaule);
		System.out.println("Long max vaule =" + myMaxLongVaule);
		
		byte myMaxByte = Byte.MAX_VALUE;
		short myShort = Short.MAX_VALUE;
		System.out.println("MAx byte = " + myMaxByte);
		System.out.println("MAx short = " + myShort);
		
		byte byteVaule = 100;
		short shortVaule = 1000;
		int intVaule = 10000;
		long longVaule = 50000 + 10 *( byteVaule + shortVaule + intVaule);
		

	}

}
