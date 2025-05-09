public class BFS {
	
	private static List<Integer> getBFS(List<List<Integer>> adj, int v) {
		boolean[] visited = new boolean[v];
		List<Integer> bfs = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		visited[1] = true;
		
		while(!q.isEmpty()) {
			int n = q.poll();
			bfs.add(n);
			
			for(int x : adj.get(n)) {
				if(!visited[x]) {
					visited[x] = true;
					q.add(x);
				}
			}
		}
		return bfs;
	}

	public static void main(String[] args) {
		List<List<Integer>> adj = new ArrayList<>();
		adj.add(new ArrayList<>());
		adj.add(new ArrayList<>(Arrays.asList(2,6)));
		adj.add(new ArrayList<>(Arrays.asList(1,3,4)));
		adj.add(new ArrayList<>(Arrays.asList(2)));
		adj.add(new ArrayList<>(Arrays.asList(2,5)));
		adj.add(new ArrayList<>(Arrays.asList(4,8)));
		adj.add(new ArrayList<>(Arrays.asList(1,7,9)));
		adj.add(new ArrayList<>(Arrays.asList(6,8)));
		adj.add(new ArrayList<>(Arrays.asList(7,5)));
		adj.add(new ArrayList<>(Arrays.asList(6)));
		List<Integer> list = getBFS(adj, adj.size());
		System.out.println(list);
	}

}
