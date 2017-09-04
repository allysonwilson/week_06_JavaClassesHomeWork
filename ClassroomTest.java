
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest{
  Classroom classroom;
  Person student;
  Teacher teacher;


// write a method that teacher takes
// a person out of classroom

@Before
public void before(){
  classroom = new Classroom("English");
  student = new Person();
  teacher = new Teacher();
}

@Test
public void teacherRemovesStudentFromClassroom(){

  assertEquals(9 , classroom.studentCount() );
}

@Test
public void classroomStartsEmpty(){
  assertEquals(0, classroom.studentCount());
}

@Test
public void canAddStudents(){
  classroom.enroll(student);
  assertEquals( 1 , classroom.studentCount() );
}

@Test
public  void classroomIsFull(){
  for(int i = 0; i<10; i++){
    classroom.enroll(student);
  }
  assertEquals( true, classroom.isClassroomFull() );
}

@Test
public void hasName(){
  assertEquals("English", classroom.getName() );
}

@Test
public void emptyClassroomWhenNight(){
  classroom.enroll(student);
  classroom.night();
  assertEquals( 0, classroom.studentCount() );
}
