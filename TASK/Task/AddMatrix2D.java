package Program; // array concept

public class AddMatrix2D {
	public static void main(String args[]) {
		//creating two array
		int a[][]= {{1,2,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{2,3,4},{9,4,3},{4,4,5}};
		//creating another matrix to store the sum of two matrix
		int[][]c=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];//-for subtraction
				
				System.out.print(c[i][j]+"");
				}
			System.out.println();
		}
		
	}

}
