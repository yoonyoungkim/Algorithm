package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DisjoinSetTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 1<=n<=1,000,000
		int m = Integer.parseInt(st.nextToken());	// 1<=m<=100,000
		
		
		DisJointNode three = new DisJointNode(3);
		DisJointNode seven = new DisJointNode(7);
		DisJointNode five = new DisJointNode(5);
		DisJointNode four = new DisJointNode(4);
		DisJointSet setA = new DisJointSet();
		setA.addNode(three);
		setA.addNode(seven);
		setA.addNode(five);
		setA.addNode(four);
		System.out.println("Three Parent : " + three.getParent());
		System.out.println("Seven Parent : " + seven.getParent());
		System.out.println("Five Parent : " + five.getParent());
		System.out.println("Four Parent : " + four.getParent());

		System.out.println("");

		DisJointNode one = new DisJointNode(1);
		DisJointNode two = new DisJointNode(2);
		DisJointNode eight = new DisJointNode(8);
		DisJointNode nine = new DisJointNode(9);
		DisJointSet setB = new DisJointSet();
		setB.addNode(one);
		setB.addNode(two);
		setB.addNode(eight);
		setB.addNode(nine);
		System.out.println("One Parent : " + one.getParent());
		System.out.println("Two Parent : " + two.getParent());
		System.out.println("Eight Parent : " + eight.getParent());
		System.out.println("Nine Parent : " + nine.getParent());

		System.out.println("");

		System.out.println("Three Find Set : " + find(three));
		System.out.println("Five Find Set : " + find(five));

		System.out.println("One Find Set : " + find(one));
		System.out.println("Two Find Set : " + find(two));
		union(setA, setB);
		System.out.println("Union setA, setB");

		System.out.println("After Union One Find Set : " + find(one));
		System.out.println("After Union Two Find Set : " + find(two));

	}
	
	public static DisJointNode find(DisJointNode node) {
		DisJointNode temp = node;

		while (temp.getParent() != null) {
			temp = temp.getParent();
		}

		return temp;
	}

	public static void union(DisJointSet leftSet, DisJointSet rightSet) {
		if (rightSet != null && rightSet != null)
			rightSet.getRoot().setParent(leftSet.getRoot());
	}

}

class DisJointSet {
	private DisJointNode root;

	public DisJointNode getRoot() {
		return root;
	}

	public void addNode(DisJointNode node) {
		if (root == null)
			root = node;
		else
			node.setParent(root);
	}
}

class DisJointNode {
	private int data;
	private DisJointNode parent;

	public DisJointNode(int data) {
		this.data = data;
	}

	public DisJointNode(int data, DisJointNode parent) {
		this.data = data;
		this.parent = parent;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DisJointNode getParent() {
		return parent;
	}

	public void setParent(DisJointNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "" + getData();
	}

}
