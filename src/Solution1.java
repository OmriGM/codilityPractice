import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.sun.javafx.scene.layout.region.Margins.Converter;

public class Solution1 {

	private static final int MAX_ELEMENT_VALUE = 1000000000;

	public int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : A) {
			if (map.get(new Integer(i)) == null) {
				map.put(new Integer(i), 1);
			} else {
				map.put(new Integer(i), map.get(new Integer(i)) + 1);
			}
		}
		int c = 1;
		while (map.get(new Integer(c)) != null) {
			c++;
		}
		return c;
	}

	public int solution2(int N) {
		String[] str = Integer.toString(N, 2).split("");
		int zeroCount = 0;
		int maxCount = 0;
		for (int i = 0; i < (str.length - 1); i++) {
			if (str[i + 1].equals("0")) {
				zeroCount++;
			} else {
				if (str[i].equals("0"))
					if (zeroCount > maxCount)
						maxCount = zeroCount;
				zeroCount = 0;
			}
		}
		return maxCount;
	}

	public int[] solution3(int[] A, int K) {
		int[] array = new int[A.length];
		if (A.length == 0) {
			return null;
		}
		if (K == A.length) {
			return A;
		}
		for (int i = 0; i < (A.length); i++) {
			array[(i + K) % A.length] = A[i];
		}
		return array;
	}

	public int solution4(String S) {
		Stack<Character> bracketsStack = new Stack<>();
		for (int i = 0; i < (S.length()); i++) {
			char nowChar = S.charAt(i);
			char pickedChar = 's';
			if (!bracketsStack.isEmpty()) {
				pickedChar = bracketsStack.peek();
			}
			if (nowChar == '[' || nowChar == '(' || nowChar == '{') {
				bracketsStack.push(nowChar);
			} else {
				if (pickedChar == '(' && nowChar == ')') {
					bracketsStack.pop();
				}
				if (pickedChar == '[' && nowChar == ']') {
					bracketsStack.pop();
				}
				if (pickedChar == '{' && nowChar == '}') {
					bracketsStack.pop();
				}
			}
		}
		if (bracketsStack.isEmpty()) {
			return 1;
		}
		return 0;
	}

	public int solution5(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			int theNumber = A[i];
			if (map.get(new Integer(theNumber)) == null) {
				map.put(new Integer(theNumber), 1);
			} else {
				map.put(new Integer(theNumber), map.get(new Integer(theNumber)) + 1);
			}
		}
		int k = 1;
		while (map.get(new Integer(k)) != null) {
			k++;
		}

		return k;
	}

	public int solution6(Tree T) {
		return numVisible(T, Integer.MIN_VALUE);
	}

	public int numVisible(Tree T, int maxValue) {
		if (T == null) {
			return 0;
		}

		int num = 0;

		if (T.x >= maxValue) {
			num = 1;
			maxValue = T.x;
		}

		return num + numVisible(T.l, maxValue) + numVisible(T.r, maxValue);
	}

	public int solution7(int[] A) {
		int minSumElements = MAX_ELEMENT_VALUE;
		int p = 1;

		for (int q = 3; q < A.length - 1; q++) {
			minSumElements = Math.min(minSumElements, A[q] + A[p]);

			if (A[p] > A[q - 1]) {
				p = q - 1;
			}

		}
		return minSumElements;
	}

}
