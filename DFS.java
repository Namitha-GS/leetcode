public class DFS {
	
	private static List<Integer> getDFS(List<List<Integer>> adj) {
		List<Integer> list = new ArrayList<>();
		int n = adj.size();
		boolean[] visited = new boolean[n];
		dfs(visited, 1, list, adj);
		return list;
	}
	
	private static void dfs(boolean[] visited, int node, List<Integer> list, List<List<Integer>> adj) {
		visited[node] = true;
		list.add(node);
		
		for(int x : adj.get(node)) {
			if(!visited[x]) {
				dfs(visited, x, list, adj);
			}
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> adj = new ArrayList<>();
		adj.add(new ArrayList<>());
		adj.add(new ArrayList<>(Arrays.asList(2,3)));
		adj.add(new ArrayList<>(Arrays.asList(1,5,6)));
		adj.add(new ArrayList<>(Arrays.asList(1,4,7)));
		adj.add(new ArrayList<>(Arrays.asList(3,8)));
		adj.add(new ArrayList<>(Arrays.asList(2)));
		adj.add(new ArrayList<>(Arrays.asList(2)));
		adj.add(new ArrayList<>(Arrays.asList(3,8)));
		adj.add(new ArrayList<>(Arrays.asList(4,7)));
		List<Integer> l = getDFS(adj);
		System.out.println(l);
	}

}
