package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student student = new Student("Srinibas", 10, "Math");
		studentList.add(student);
		
		student =  new Student("Gayatree", 20, "Phy");
		studentList.add(student);

		student =  new Student("Abhipsa", 30, "chem");
		studentList.add(student);	
		
		student =  new Student("Ram", 40, "ECE");
		studentList.add(student);
		
		student =  new Student("Shyam", 50, "CSE");
		studentList.add(student);
		
		student =  new Student("Krishna", 60, "Phy");
		studentList.add(student);

		student =  new Student("Sudama", 70, "chem");
		studentList.add(student);	
		
		student =  new Student("SitaRam", 80, "ECE");
		studentList.add(student);
		
		student =  new Student("RamShyam", 90, "CSE");
		studentList.add(student);
		
		
		IntStream phyDeptRollNo = studentList.stream().filter(st -> st.getDept().equals("Phy")).mapToInt(st -> st.getRollNo());
		System.out.println("Phy Students: ");
		phyDeptRollNo.forEach(new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.println(value);
			}
		});
		
		boolean match = studentList.stream().anyMatch(st -> st.getName().startsWith("Ram"));
		System.out.println("matched : " + match);
		
		long RamCount = studentList.stream().filter(st -> st.getName().startsWith("Ram")).count();
		System.out.println("Ram Count: " + RamCount);
		
		Stream<String> nameStream = studentList.stream().map(Student::getName);
		Optional<String> reducedNames = nameStream.reduce((x,y) -> x + ", " + y);
		reducedNames.ifPresent(System.out::println);
		
		List<String> studentsInUppercase = studentList.stream().map(Student::getName).sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.println(studentsInUppercase);
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		Optional<String> reduced = memberNames.stream().reduce((st1, st2) -> st1 + ", " + st2);
		reduced.ifPresent(System.out::println);
		
		
		
	}

}

class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	String name;
	int RollNo;
	String dept;

	public Student(String name, int rollNo, String dept) {
		super();
		this.name = name;
		RollNo = rollNo;
		this.dept = dept;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj ;
		return st.name.equals(this.name) && st.RollNo == this.RollNo && st.dept.equals(this.RollNo);
	}
}
