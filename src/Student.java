public class Student {
    static int  index=0;
    String name;
    String school_name;

    public Student(String name,String school_name)
    {
        int id=++index;
        System.out.println("Student id :" +id);
        System.out.println("Student name :" +name);
        System.out.println("School name :" +school_name);
    }

}
