	public class Main {
		public static void main(String[] args) throws Exception {

			// MATRIZ 1
			int[][] matrix = new int[3][3];

			matrix[0][0] = 0;
			matrix[0][1] = 1;
			matrix[0][2] = 0;

			matrix[1][0] = 1;
			matrix[1][1] = 0;
			matrix[1][2] = 1;

			matrix[2][0] = 0;
			matrix[2][1] = 1;
			matrix[2][2] = 0;



			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}

			// MATRIZ 2
			int[][] matrix1 = new int[4][4];

			matrix1[0][0] = 0;
			matrix1[0][1] = 1;
			matrix1[0][2] = 0;
			matrix1[0][3] = 1;

			matrix1[1][0] = 1;
			matrix1[1][1] = 0;
			matrix1[1][2] = 1;
			matrix1[1][3] = 0;

			matrix1[2][0] = 0;
			matrix1[2][1] = 1;
			matrix1[2][2] = 0;
			matrix1[2][3] = 0;

			matrix1[3][0] = 1;
			matrix1[3][1] = 0;
			matrix1[3][2] = 0;
			matrix1[3][3] = 0;

			System.out.println("\n");

			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1.length; j++) {
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.println();
			}

			//MATRIZ 3
			int[][] matrix2 = new int[3][3];

			matrix2[0][0] = 1;
			matrix2[0][1] = 1;
			matrix2[0][2] = 0;

			matrix2[1][0] = 1;
			matrix2[1][1] = 0;
			matrix2[1][2] = 1;

			matrix2[2][0] = 0;
			matrix2[2][1] = 1;
			matrix2[2][2] = 0;

			System.out.println("\n");

			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2.length; j++) {
					System.out.print(matrix2[i][j] + " ");
				}
				System.out.println();
			}

			// MATRIZ 4
			int[][] matrix3 = new int[4][4];

			matrix3[0][0] = 0;
			matrix3[0][1] = 1;
			matrix3[0][2] = 0;
			matrix3[0][3] = 0;

			matrix3[1][0] = 1;
			matrix3[1][1] = 0;
			matrix3[1][2] = 1;
			matrix3[1][3] = 1;

			matrix3[2][0] = 0;
			matrix3[2][1] = 1;
			matrix3[2][2] = 0;
			matrix3[2][3] = 0;

			matrix3[3][0] = 0;
			matrix3[3][1] = 1;
			matrix3[3][2] = 0;
			matrix3[3][3] = 0;

			System.out.println("\n");

			for (int i = 0; i < matrix3.length; i++) {
				for (int j = 0; j < matrix3.length; j++) {
					System.out.print(matrix3[i][j] + " ");
				}
				System.out.println();
			}

			// MATRIZ 4
			int[][] matrix4 = new int[4][4];

				matrix4[0][0] = 0;
				matrix4[0][1] = 0;
				matrix4[0][2] = 0;
				matrix4[0][3] = 1;

				matrix4[1][0] = 1;
				matrix4[1][1] = 0;
				matrix4[1][2] = 0;
				matrix4[1][3] = 1;

				matrix4[2][0] = 0;
				matrix4[2][1] = 0;
				matrix4[2][2] = 0;
				matrix4[2][3] = 1;

				matrix4[3][0] = 1;
				matrix4[3][1] = 1;
				matrix4[3][2] = 1;
				matrix4[3][3] = 0;

				System.out.println("\n");

				for (int i = 0; i < matrix4.length; i++) {
					for (int j = 0; j < matrix4.length; j++) {
						System.out.print(matrix4[i][j] + " ");
					}
					System.out.println();
				}				// ----- Fin de métodos para mostrar lista de adyacencia de un vértice -----//
		}

}
