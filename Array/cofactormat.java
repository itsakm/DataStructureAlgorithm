class cofactormat
{
	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 2, -1 },
                        { 3, 0, 0, 5 },
                        { 2, 1, 4, -3 },
                        { 1, 0, 5, 0 } };
        int n=4;
		int p=0,q=0;
		int i=0,j=0;
		int temp[][]=new int[n][n];
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
			{
				if(r!=p && c!=q)
				{
					temp[i][j]=mat[r][c];
					j++;//taki first row me sare column bhr jaye
					if(j==n-1)//jab sare column bhr jaye
					{			//to column ko 0 aur
						j=0;	//row ko change kr dia jaye
						i++;
					}
					
				}
			}
		}
		System.out.println(i);
		System.out.println(j);
		for (int k=0;k<n ;k++ ) {
			for(int m=0;m<n;m++)
			{
				System.out.print(temp[k][m]);
			}
			System.out.println("");
		}
	}
}