
public class Array {

	public static void main(String[] args) {
		int[] array1;
		array1 = new int[3];
		array1[0] = 7;
		array1[1] = 42;
		array1[2] = 1337;
		System.out.println(array1[2]);
		
		int int1 = 3;
		int int2 = 4;
		int2 = int1;
		int2 = 5;
		System.out.println(int1);
		
		int[] array2;
		array2 = array1;
		array2[0] = 14;
		System.out.println(array1[0]);
		
		String[] blume1;
		blume1 = new String[3];
		blume1[0] = "rose";
		blume1[1] = "tulpe";
		blume1[2] = "nelke";
		System.out.println(blume1[1]);
		
		blume1[1] = blume1[2];
		System.out.println(blume1[1]);
		
	}

}
