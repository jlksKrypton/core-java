import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class studept {
	public static void main(String[] args) {

		List<student> li = new ArrayList<>();
		department d1 = new department("CSE", "1");
		department d2 = new department("ECE", "1");
		student s1 = new student("a", "b", "10", d1);
		student s2 = new student("b", "a", "12", d1);
		student s3 = new student("c", "d", "11", d2);
		student s4 = new student("d", "c", "13", d2);
		student s5 = new student("e", "e", "50", d2);
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		System.out.println("\n Using Comparaable");
		Collections.sort(li);
		li.forEach(System.out::println);
		System.out.println("\n Using Comparator");
		Collections.sort(li, new Comparator<student>() {
			public int compare(student o1, student o2) {
				return o1.id.compareTo(o2.id);
			}
		});
		li.forEach(System.out::println);
		System.out.println("\n Using Lambda");
		Collections.sort(li, (o1, o2) -> o1.dept.name.compareTo(o2.dept.name) == 0 ? o1.lastName.compareTo(o2.lastName)
				: o1.dept.name.compareTo(o2.dept.name));
		li.forEach(System.out::println);
	}
}