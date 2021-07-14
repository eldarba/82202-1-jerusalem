package a;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Student {

	@NonNull
	private Integer id;
	@NonNull
	private String name;
	private int age;
	@Exclude
	private List<Integer> grades;

	public static void main(String[] args) {
		Student student1 = new Student(101, "John");
		Student student2 = new Student(102, "John");
		student1.addPayment(4, 5, 9, 8, 7);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1.equals(student2));
		System.out.println(student1.getGrades());
	}

	public void addPayment(int... payments) {
		if (this.grades == null) {
			this.grades = new ArrayList<>();
		}
		for (int payment : payments) {
			this.grades.add(payment);
		}
	}

}
