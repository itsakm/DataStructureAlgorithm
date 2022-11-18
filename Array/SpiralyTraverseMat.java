class SpiralyTraverseMat
{
	public static void main(String[] args) {
		int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int m=4;
		int n=4;
		int i,r=0,c=0;
		while(r<n && c<n)
		{
			//printing first row
			for(i=r;i<n;i++)
			{
				System.out.print(mat[r][i]+" ");
			}
			r++;
			for(i=r;i<m;i++)
			{
				System.out.print(mat[i][n-1]+" ");
			}
			n--;
			if(r<m)
			{
				for(i=n-1;i>=1;i--)
				{
					System.out.print(mat[m-1][i]+" ");
				}
				m--;
			}
			 if (c < n) { 
                for (i = m - 1; i >= r; --i) { 
                    System.out.print(mat[i][c] + " "); 
                } 
                c++; 
            }

		}
			
			
		
	}
}