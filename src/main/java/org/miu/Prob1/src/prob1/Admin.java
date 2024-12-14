package org.miu.Prob1.src.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		if(students==null||students.isEmpty()) throw new IllegalArgumentException("Student list cannot be null or empty");
		HashMap<Key, Student> studentHashMap=new HashMap<>();
		for(Student student:students){
			if(student!=null){
				Key studentKey=new Key(student.getFirstName(),student.getLastName());
				studentHashMap.put(studentKey,student);
			}
		}
		return studentHashMap;
	}
}
