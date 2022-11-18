import java.util.*;
class LinkedListImplementation
{
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int v1,int v2)
	{
		adj.get(v1).add(v2);
		adj.get(v2).add(v1);
	}
	public static void printGraph(ArrayList<ArrayList<Integer>> adj)
	{
		for(int i=0;i<adj.size();i++)
		{
			System.out.print(i+" ");
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print("-->"+adj.get(i).get(j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<e;i++)
		{
			int v1=s.nextInt();
			int v2=s.nextInt();
			addEdge(adj,v1,v2);
		}
		printGraph(adj);
	}
}