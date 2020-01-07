package disjointset.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(6);
		l.add(4);
		l.add(3);
		l.add(9);
		DisJointSet<Integer> dj = new DisJointSet<>();
		dj.makeSet(l);
		dj.union(1, 2);
		dj.union(6, 4);
		dj.union(3, 4);
		dj.union(1, 9);
		System.out.println(dj.findSet(1).parent.data);
		System.out.println(dj.findSet(2).parent.data);
		System.out.println(dj.findSet(3).parent.data);
		System.out.println(dj.findSet(4).parent.data);
		System.out.println(dj.findSet(6).parent.data);
		System.out.println(dj.findSet(9).parent.data);
	}
}
