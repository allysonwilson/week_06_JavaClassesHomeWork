public class Classroom{
  private String name;
  private Person[] students;


public Classroom(String name){
  this.name = name;
  this.students = new Person[10];
}

public int studentCount(){
  int count = 0;
  for ( Person student : students ){
    if ( student != null ){
      count++;
    }
  }
  return count;
}

public void enroll(Person student){
  int studentCount = studentCount();
  this.students[studentCount] = student;
}

public boolean isClassroomFull(){
  return this.studentCount() == this.students.length;
}

public String getName(){
    return this.name;
  }

  public void night(){
    this.students = new Person[10];
  }
}
