class dfs
{
	public static void main(String[] args) {
	}
	public static void dfs(int[][] adj,int current,boolean[] visited)
	{
		System.out.print(current);
		visited[current]=true;
		for(int i=0;i<adj.length;i++)
		{
			if(adj[current][i]==1 && !visited[i])
			{
				dfs(adj,i,visited);
			}
		}
	} 
}