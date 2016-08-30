package ssa;

import java.util.*;

public class Student implements Comparable<Student> {
	static HashMap<String, Student> map = new HashMap<>();
	static ArrayList<Student> classRoster = new ArrayList<Student>();
	public String id;
	public String firstName;
	public String lastName;
	public String eyeColor;
	public String mothnsEmployed;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getMothnsEmployed() {
		return mothnsEmployed;
	}

	public void setMothnsEmployed(String mothnsEmployed) {
		this.mothnsEmployed = mothnsEmployed;
	}

	void printClassRoster() {
		String[][] students = { { "001122", "Michael", "Clair", "other", "12" },
				{ "004400", "Kevin", "Tran", "other", "12" }, { "001212", "Stephen", "Rook", "blue", "11" },
				{ "474143", "Jonathan", "Stafford", "brown", "13" }, { "005295", "Kyle", "Deen", "blue", "2" },
				{ "132617", "Reuben", "Turner", "blue", "12" }, { "306700", "Li", "Lui", "brown", "12" },
				{ "215296", "Joshua", "Franey", "other", "27" }, { "523420", "Gabriel", "Hamilton", "other", "10" },
				{ "004014", "Aisha", "Covington", "brown", "10" }, { "006789", "Arun", "Soma", "brown", "2" },
				{ "009999", "Steve", "Ellwood", "other", "2" }, { "343769", "Shaquil", "Timmons", "brown", "11" },
				{ "001449", "Karen", "Rieter", "blue", "10" }, { "267252", "Dax", "Richards", "brown", "12" },
				{ "229949", "Mike", "Sykes", "brown", "13" }, { "772223", "Daniel", "Kiros", "brown", "3" },
				{ "004444", "Peter", "Choi", "brown", "2" }, { "005255", "Joe", "Hill", "brown", "13" },
				{ "008888", "Evan", "Tizard", "brown", "12" }

		};
		System.out.println("Student class roster");
		System.out.println("");
		System.out.println("Empl Id" + "\t\t" + "First Name" + "\t\t" + "Last name" + "\t\t" + "EyeColor" + "\t\t"
				+ "Months at SSA" + "\t\t");
		System.out.println("=======" + "\t\t" + "=============" + "\t\t" + "===========" + "\t\t" + "=========="
				+ "\t\t" + "==============");
		for (String[] employee : students) {
			Student student = new Student();
			student.setId(employee[0]);
			student.setFirstName(employee[1]);
			student.setLastName(employee[2]);
			student.setEyeColor(employee[3]);
			student.setMothnsEmployed(employee[4]);
			classRoster.add(student);
		}
		Collections.sort(classRoster);
		for (Student student1 : classRoster) {
			System.out.printf("%-6s\t\t %-11s\t\t %-12s\t\t %-5s\t\t\t\t %-3s\n", student1.getId(),
					student1.getFirstName(), student1.getLastName(), student1.getEyeColor(),
					student1.getMothnsEmployed());

		}

		// map.put(student.id, student);
		// classRoster.add(student);

	}

//	public static void main(String[] args) {
//		Student s = new Student();
//		s.printClassRoster();
//		s.compareAndDisplay();
//		// // s.studentList();
//		// Collections.sort(classRoster,studentIdComparator );
//		// System.out.println(classRoster);
//		//
//	}

	public void compareAndDisplay() {

		for (Student student : classRoster) {
			map.put(student.getId(), student);

		}

		ArrayList sorted = new ArrayList(map.keySet());
		Collections.sort(sorted);
		for (int x = 0; x < map.size(); x++) {
			if (sorted.get(x).equals("523420")) {
				System.out.println("");
				System.out.printf("%-6s\t\t %-11s\t\t %-12s\t\t %-5s\t\t\t\t %-3s\n", map.get(sorted.get(x + 1)).id,
						map.get(sorted.get(x + 1)).firstName, map.get(sorted.get(x + 1)).lastName,
						map.get(sorted.get(x + 1)).eyeColor, map.get(sorted.get(x + 1)).mothnsEmployed);
				System.out.printf("%-6s\t\t %-11s\t\t %-12s\t\t %-5s\t\t\t\t %-3s\n", map.get(sorted.get(x)).id,
						map.get(sorted.get(x)).firstName, map.get(sorted.get(x)).lastName,
						map.get(sorted.get(x)).eyeColor, map.get(sorted.get(x)).mothnsEmployed);
				System.out.printf("%-6s\t\t %-11s\t\t %-12s\t\t %-5s\t\t\t\t %-3s\n", map.get(sorted.get(x - 1)).id,
						map.get(sorted.get(x - 1)).firstName, map.get(sorted.get(x - 1)).lastName,
						map.get(sorted.get(x - 1)).eyeColor, map.get(sorted.get(x - 1)).mothnsEmployed);

			}

		}
	}

	@Override
	public int compareTo(Student student) {
		return this.firstName.compareTo(student.firstName);

	}

};
