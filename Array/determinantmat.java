class determinantmat
{
	static void getCofactor(int mat[][],int temp[][],int p,int q,int n)
	{
		int i=0,j=0;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				//now we are copying those
				//elements which are not in the
				//given row and column
				if(row!=p && col !=q)//ye us cheez ka dhyan
				{			//rkhega ki us line aur column ki cheeze print na ho			
					temp[i][j++]=mat[row][col];
					if(j==n-1)
					{
						j=0;
						i++;
					}
				}
			}
		}
	}
	static int determinantmatrix(int mat[][],int n)
	{
		int d=0;//result variable

		if(n==1)
			return mat[0][0];
		//to store cofactores
		int temp[][]=new int [n][n];

		int sign=1;

		//iterate for each element of first row

		for(int f=0;f<n;f++)
		{
			getCofactor(mat,temp,0,f,n);
			d+=sign*mat[0][f]*determinantmatrix(temp,n-1);
			sign=-sign;
		}
		return d;

	}
	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 2, -1 },
                        { 3, 0, 0, 5 },
                        { 2, 1, 4, -3 },
                        { 1, 0, 5, 0 } };
 
        System.out.print("Determinant "
                         + "of the matrix is : "
                         + determinantmatrix(mat, 4));
	}
}