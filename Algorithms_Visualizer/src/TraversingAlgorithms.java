import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversingAlgorithms {
	List<Integer>[] graph;
	    int V;

	    public TraversingAlgorithms(int V) {
	        this.V = V;
	        this.graph = new ArrayList[V];
	        for (int i = 0; i < V; i++) {
	            graph[i] = new ArrayList<Integer>();
	        }
	    }

	    public void addEdge(int u, int v) {
	        graph[u].add(v);
	        graph[v].add(u);
	    }

	    public void bfs(int s) {
	        Queue<Integer> q = new LinkedList<Integer>();
	        boolean[] visited = new boolean[V];
	        q.add(s);
	        visited[s] = true;
	        System.out.println("BFS Traversal:");

	        while (!q.isEmpty()) {
	            int u = q.poll();
	            System.out.println("Visiting node: " + u);

	            for (int v : graph[u]) {
	                if (!visited[v]) {
	                    q.add(v);
	                    System.out.println("  Exploring edge: " + u + " -> " + v);
	                    visited[v] = true;
	                }
	            }
	        }
	    }
	
	public void dfs() {
	    int[] visited = new int[graph.length];

	    for (int i = 0; i < graph.length; i++) {
	        if (visited[i] == 0) {
	            dfsHelper(i, visited);
	        }
	    }
	}

	public void dfsHelper(int i, int[] visited) {
	    visited[i] = 1;
	    
	    System.out.println("Visiting node: " + i);
	    
	    for (int j : graph[i]) {
	        if (visited[j] == 0) {
	            System.out.println("  Exploring edge: " + i + " -> " + j);
	            dfsHelper(j, visited);
	        }
	    }
	}
	

}
