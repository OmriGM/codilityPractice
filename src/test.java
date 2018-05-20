import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Tree {
	public Tree(int i, Tree l, Tree r) {
	}

	public int x;
	public Tree l;
	public Tree r;
}

public class test {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();

		int[] array = { 5, 2, 4, 6, 3, 7, 1, 2 };
		String q4Array = "{()()}[{}]";

		Tree root = new Tree(8, new Tree(2, new Tree(8, null, null), new Tree(7, null, null)), new Tree(6, null, null));
		Tree root3 = new Tree(5, new Tree(3, new Tree(20, null, null), new Tree(21, null, null)),
				new Tree(10, new Tree(1, null, null), null));

		System.out.println(sol.solution(array));
		System.out.println(sol.solution2(529));
		System.out.println(Arrays.toString(sol.solution3(array, 2)));
		System.out.println(sol.solution4(q4Array));
		System.out.println(sol.solution5(array));
		System.out.println(sol.solution6(root3));
		System.out.println(sol.solution6(root));
		System.out.println(sol.solution7(array));
	}
}
