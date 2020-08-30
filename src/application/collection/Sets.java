package application.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");

		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		set1.remove("スイカ");
		set1.remove("なし"); // 何もしない

		System.out.println(set1.size());
	}
}
