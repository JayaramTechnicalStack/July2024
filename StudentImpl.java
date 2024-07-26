public class StudentImpl {

public static void main(String [] args){

Student s = new Student();

s.setId(1);
s.setFirstName("Ajay");
s.setLastName("Kumar");
s.setMarks(75);


StudentDetails sd = new StudentDetails();
sd.getStudentDetails(s);

}
}
