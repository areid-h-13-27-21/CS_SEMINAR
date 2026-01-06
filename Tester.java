public class Tester{
  public static void main(String[] args) {
      // Create students
      Students student1 = new Students("Ellie", "PreCalc", "Accelerated","G");
      Students student2 = new Students("Devon", "Geometry","Honors","G");




      // Create a tutor
      Tutors tutor1 = new Tutors("Selina", "Calc", "Honors", "G");




      // Add students to the tutor
      if(isQualified(student1, tutor1)){
          tutor1.addStudent(student1.getName());
      }
      if(isQualified(student2, tutor1)){
          tutor1.addStudent(student2.getName());
      }




      // Display tutor information
      System.out.println("Tutor Name: " + tutor1.getName());
      System.out.println("Current Students: " + tutor1.getCurrentStudents());
  }
   public static boolean isQualified(Students student, Tutors tutor){
      if(!student.getFreeBlock().equals(tutor.getFreeBlock())){
          return false;
      }




      int intTutorLevel = 1;
      int intStudentLevel = 1;
      int intTutorClass = 1;
      int intStudentClass = 1;
      String tutorLevel = tutor.getLevel();
      String studentLevel = student.getLevel();
      String tutorClass = tutor.getLevel();
      String studentClass = student.getLevel();








      //turn tutor level into int
      if(tutorLevel.equals("Honors")){
          intTutorLevel = 3;
      } if(tutorLevel.equals("Accelerated")){
          intTutorLevel = 2;
      }




      // turn student level into int
      if(studentLevel.equals("Honors")){
          intStudentLevel = 3;
      } if(studentLevel.equals("Accelerated")){
          intStudentLevel = 2;
      }




      if(intTutorLevel < intStudentLevel){
          return false;
      }
    
      //turning tutor class into int
      if(tutorClass.equals("Calc")){
          intTutorClass = 4;
      } if(tutorClass.equals("PreCalce")){
          intTutorClass = 3;
      } if(tutorClass.equals("Algebra")){
          intTutorClass = 2;
      }
      // turning student class into int




      if(studentClass.equals("Calc")){
          intStudentClass = 4;
      } if(studentClass.equals("PreCalc")){
          intStudentClass = 3;
      } if(studentClass.equals("Algebra")){
          intStudentClass = 2;
      }
       if(intTutorClass < intStudentClass){
          return false;
      }




      return true;
  }
}

