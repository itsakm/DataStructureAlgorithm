class Rotate90Mat
{
	static void Rotate90Matr(int n,int mat[][]){
		for(int i=0;i<n/2;i++)//n/2 kyunki 4x4 matrix me
		{						//2 rotation hongi
			for(int j=i;j<n-i-1;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][n-1-i];
				mat[j][n-1-i]=mat[n-1-i][n-1-j];
				 mat[n - 1 - i][n - 1 - j] = mat[n - 1 - j][i]; 
                mat[n - 1 - j][i] = temp; 
			}
		}
	}
	public static void main(String[] args) {
	int n=4;
	int mat[][] = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 }, 
            { 13, 14, 15, 16 } 
        }; 	

        Rotate90Matr(4, mat);
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print( 
                    " " + mat[i][j]); 
  
            System.out.print("\n"); 
        } 
	}
}