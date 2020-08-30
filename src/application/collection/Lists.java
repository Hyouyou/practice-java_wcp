package application.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();

		list1.add("りんご");
		list1.add("みかん");
		list1.add(1,"ばなな");

		list1.remove(0);

		System.out.println(list1);
	}

}
