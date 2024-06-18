package Array;

public class MultiDimArray {
	public static void main(String args[]) {
		int matrix[][]  = new int [3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		int rows = matrix.length;
		int columns = matrix[0].length;
		System.out.println("number of rows: " +rows);
		System.out.println("number of columns: " +columns);
		int value = matrix[1][1];
		System.out.println("Value at row , column 1: " +value);
		System.out.println("All values in the array :");
		for(int i =0; i<rows;i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}
  
}
