package assigment;

public class Question1 {
	public static void main (String[] args) {
		
		byte age = 25;
		short classNumber = 365;
		float height = 1.80f;
		
		System.out.println("Your age is : " + age);
		System.out.println("Your Class number is : " + classNumber);
		System.out.println("Your heigt is : " + height + " cm\n");
		
		System.out.println("Char type : " + (int)Character.MIN_VALUE +" ... "+ (int)Character.MAX_VALUE);
		System.out.println("Byte type : " + Byte.MIN_VALUE +" ... "+ Byte.MAX_VALUE);
		System.out.println("Short type : " + Short.MIN_VALUE +" ... "+ Short.MAX_VALUE);
		System.out.println("Integer type : " + Integer.MIN_VALUE +" ... "+ Integer.MAX_VALUE);
		System.out.println("Long type : " + Long.MIN_VALUE +" ... "+ Long.MAX_VALUE);
		System.out.println("Float type : " + Float.MIN_VALUE +" ... "+ Float.MAX_VALUE);
		System.out.println("Double type : " + Double.MIN_VALUE +" ... "+ Double.MAX_VALUE);
	}

}