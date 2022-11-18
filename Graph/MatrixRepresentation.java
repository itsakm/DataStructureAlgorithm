import java.util.*;
class MatrixRepresentation
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		int[][] adj=new int[v][v];
		for(int i=0;i<e;i++)
		{
			int v1=s.nextInt();
			int v2=s.nextInt();
			adj[v1][v2]=1;
			adj[v2][v1]=1;
		}
		boolean visited[]=new boolean[v];
		for(int i=0;i<visited.length;i++)//if two graphs are not connected
		{
			if(!visited[i])
			{
				dfs(adj,i,visited);
			}
		}
		// dfs(adj,0,visited);
		bfs(adj,visited,0);
		System.out.println();
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void dfs(int[][] adj,int current,boolean[] visited)
	{
		System.out.print(current+" ");
		visited[current]=true;
		for(int i=0;i<adj.length;i++)
		{
			if(adj[current][i]==1 && !visited[i])
			{
				dfs(adj,i,visited);
			}
		}
	}
	public static void bfs(int[][] adj,boolean[] visited,int current)
	{
		Queue<Integer> q= new LinkedList<>();
		q.add(current);
		visited[current]=true;
		while(!q.isEmpty())
		{
			int ele=q.remove();
			System.out.println(ele+" ");
			for(int i=0;i<adj.length;i++)
			{
				if(!visited[i] && adj[ele][i]==1)
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
	}
	public static boolean haspathdfs(int [][] adj,int source,int dest,boolean[] visited )
	{
		if(source==dest)
		{
			return true;
		}
		visited[source]=true;
		for(int i=0;i<adj.length;i++)
		{
			if(adj[source][i]==1 && !visited[i])
			{
				return haspathdfs(adj,i,dest,visited);
			}
		}

		return false;
	}
	public static ArrayList<Integer> printPathdfs(int[][] adj, int source,int dest,boolean [] visited  )
	{
		if(source==dest)
		{
			ArrayList<Integer> ans=new ArrayList<>();
			ans.add(dest);
			return ans;
		}
		visited[source]=true;
		for(int i=0;i<adj.length;i++)
		{
			if(adj[source][i]==1 && !visited[i])
			{
				ArrayList<Integer> ans = printPath(adj,i,dest,visited);
				if(ans!=null)
				{
					ans.add(i);
				}
				return ans;
			}
		}
		return null;
	}

	public static void getPathbfs(int[][] adj,boolean[] visited,int source,int dest)
}