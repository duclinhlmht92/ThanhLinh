public class StudentByName implements  Comparable<Student>{
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
