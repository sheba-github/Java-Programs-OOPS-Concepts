package oopsConcepts;

public class AdditionOfMatrices {

	public static void main(String[] args) {
int[][] ar1= {{1,3,4},{3,4,5}};
int ar2[][]= {{1,3,4},{3,4,5}};

int[] sumArr[]=new int[2][3];

for(int i=0;i<ar1.length;i++)
{
	for(int j=0;j<ar2[0].length;j++)
	{
		sumArr[i][j]=ar1[i][j]+ar2[i][j];
		System.out.print(sumArr[i][j]+" ");
	}
	System.out.println();
}

	}

}
