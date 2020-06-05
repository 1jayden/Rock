package integers;

public class Integers {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		for(int row=0;row<array.length;row++) {
			System.out.print(array[row]+" ");
		}
		System.out.println();
	for(int row=array.length-1;row>=0;row--) {
		System.out.print(array[row]+" ");
	}
	}

}
