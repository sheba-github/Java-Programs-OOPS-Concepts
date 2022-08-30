package oopsConcepts;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {

		int arr1[][]= {{1,2,3},{1,2,3}};
		int arr2[][]= {{2,3,4},{2,3,4}};
		int mul[][]=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
			{
				mul[i][j]=arr1[i][j]*arr2[i][j];
				System.out.println(mul[i][j]+" ");
			}
			System.out.println();
			
			
			
		}
	}

}
