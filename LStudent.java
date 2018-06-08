import java.util.ArrayList;
//class LStudent
public class LStudent {

    //instance vars
    private static ArrayList<Student> students = new ArrayList(); 

    //adds a Student s to the list of students
    public static void addStudent(Student s){
	students.add(s);
    }

    public static ArrayList<Student> getStudents() {
	return students;
    }

    //checks if the username and password of a student match
    public static int checkStudent(String u, String p){
	for (Student s: students){
	    if (s.check(u,p)){
		return s.getId();
	    }
	}
	return -1;
    } 

    //prints out all of the students
    public static void printStudents() {
	for (Student s : students) {
	    System.out.println(s);
	}
    }

    //gets a student by their id
    public static Student getStudent(int id) {
	for (Student s : students) {
	    if (s.getId() == id)
		return s;
	}
	return null;
    }

    //removes a student by their id
    public static Student removeStudent(int id) {
	Student s = getStudent(id);
	for (int i = 0; i < students.size(); i++) {
	    if (students.get(i) == s) {
		return students.remove(i);
	    }
	}
	return null;
    }
    
    //returns the biggest ID in the arrayList
    public static int biggestID() {
	return students.get(students.size()-1).getId();
    }

	
}
