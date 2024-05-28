package datastructureex;

public class TwoArray2 {

	public static void main(String[] args) {
		int [] iArr = new int [3]; // 3행
		
		int[][] iArr2 = new int[3][];

		iArr2[0] = new int[3];
		iArr2[1] = new int[2];
		iArr2[2] = new int[4];
		
		iArr2[0][0] = 1;
		iArr2[0][1] = 2;
		iArr2[0][2] = 3;
		
		iArr2[1][0] = 10;
		iArr2[1][1] = 20;
		
		iArr2[2][0] = 100;
		iArr2[2][1] = 200;
		iArr2[2][2] = 300;
		iArr2[2][3] = 400;
	}
}
