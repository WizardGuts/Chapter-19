import java.util.ArrayList;

public class Exercise19_09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(14);
		list.add(24);
		list.add(4);
		list.add(42);
		list.add(5);
		
		Exercise19_09.<Integer>sort(list);
		
		System.out.print(list);
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
	
	E currentMin;
	int currentMinInt;
	
		for (int i = 0; i < list.size() - 1; i++) {
			currentMin = list.get(i);
			currentMinInt = i;
			
				for (int l = i + 1; l < list.size(); l++) {
					if (currentMin.compareTo(list.get(l)) > 0) {
						currentMin = list.get(l);
						currentMinInt = l;
					}
				}

			
			if (currentMinInt != i) {
				list.set(currentMinInt, list.get(i));
				list.set(i, currentMin);
			}
		}
	}
}