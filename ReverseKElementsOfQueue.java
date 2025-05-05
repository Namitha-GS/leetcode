import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsOfQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1); 
		q.add(2); 
		q.add(3);
		q.add(4);
		q.add(5); 
		q.add(6);
		int k=4;
		//reverseUsingDeque(q, k);
		reverseUsingStack(q, k);
		System.out.println(q);
	}
	
	private static void reverseUsingStack(Queue<Integer> q, int k) {
		Stack<Integer> s = new Stack<>();
		// Step 1
		for(int i=0; i<k; i++) {
			s.push(q.poll());
		}
		// Step 2
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		// Step 3
		for(int i=0; i < q.size()-k; i++) {
			q.add(q.poll());
		}
	}
	
	private static void reverseUsingDeque(Queue<Integer> q, int k) {
		Deque<Integer> d =new ArrayDeque<>();
		// Step 1
		for(int i=0; i<k; i++) {
			d.push(q.poll());
		}
		// Step 2
		while(!d.isEmpty()) {
			q.add(d.pop());
		}
		// Step 3
		for(int i=0; i < q.size()-k; i++) {
			q.add(q.poll());
		}
	}

}
