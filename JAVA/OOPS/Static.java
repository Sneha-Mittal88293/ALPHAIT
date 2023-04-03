class Static{
    public static void main(String args[]){
       Student s1 = new Student();
       s1.schoolName = "juet";

       Student s2 = new Student();
       System.out.print(s2.schoolName);
       
       Student s3 = new Student();
       s3.schoolName = "jnv";
       System.out.print(s3.schoolName);
       System.out.print(s2.schoolName);

    }
}

class Student{
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}