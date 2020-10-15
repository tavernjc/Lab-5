import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    Student student2 = new student();
    double sum = 0;
    student2.setname("Jordan Tavernier");
    student2.setgpa(3.4);
    student2.setMajor("Information Systems");


// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";
    student1.print();
    student2.print();

    Arraylist<double> gpas = new arraylist<double>();
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    for(int 1= 0; 1 <gpas.size(); 1++) {
      sum = += gpas.get(1);
    }

    system.out.println("The average GPA is " + sum/gpas.size()));
    
// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
   
  }
}