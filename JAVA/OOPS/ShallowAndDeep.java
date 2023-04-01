import java.util.*;

class ShallowAndDeep{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "sneha";
        s1.roll = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
            s1.marks[2] = 90;
            for(int i = 0 ; i<3; i++){
                System.out.print(s2.marks[i]);
            
        }
    }
}

class Student{
     String name ;
     int roll;
     int marks[];


    //shallow copy
    //  Student(Student s1){
    //     marks = new int[3];
    //     this.name = name;
    //     this.roll = roll;
    //     this.marks = s1.marks;
    //  }


     //deep copy

     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0 ; i<marks.length ; i++){
            this.marks[i] = s1.marks[i];
        }
        
     }
   Student(){
    marks = new int[3];

   }

}