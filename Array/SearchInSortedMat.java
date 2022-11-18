class SearchInSortedMat
{
	public static void main(String[] args) {
		int mat[][]={{3,30,38},{39,43,60},{62,76,89}};
		int m=3;
		int n=3;
		int x=40;
		for(int i=0;i<m;i++)
		{
			if(x>mat[i][0])
			{
				for(int j=0;j<n;j++)
				{
					if(mat[i][j]==x)
						System.out.println("yes");
				}

			}
		}
	}
}