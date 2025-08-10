class University{
    String Uniaddr;
    String city;
    String Country;

    University(String a, String c, String cy){
        Uniaddr=a;
        city=c;
        Country=cy;
    }
}
class Faculty{
    int id;
    String name;
    University uni; // Faculty class is associated to class University
    // because of above statement. is this Faculty resign
    // then address can still be existed. we can re-use the University class
    // for other faculties as well

    Faculty(int i,String n,University u){
        id=i;
        name=n;
        uni=u; // object of University will come here
    }

    void facDisplay()
    {
        System.out.println("Faculty id=" + id);
        System.out.println("Faculty name=" + name);
        System.out.println("University Address=" + uni.Uniaddr);
        System.out.println("University city=" + uni.city);
        System.out.println("University country=" + uni.Country);
    }
}
class Student{
    int id;
    String name;
    University uni; // Student class is associated to class University
    // because of above statement. is this Student pass out
    // then address can still be existed. we can re-use the University class
    // for other Students as well

Student(int i,String n,University u){
    id=i;
    name=n;
    uni=u; // object of University will come here
}

void stuDisplay(){

    System.out.println("Student id=" + id);
    System.out.println("Student name=" + name);
    System.out.println("University address=" + uni.Uniaddr);
    System.out.println("University city=" + uni.city);
    System.out.println("University country=" + uni.Country);

}

}


public class Main {
    public static void main(String[] args) {

        University uni = new University("DG-78 Khayaban-e-Tufail, Phase 7 Ext","karachi","Pakistan");

        Faculty fac = new Faculty(2001,"Mam Sumaira",uni);

        Student stu = new Student(221053,"Maaz Khan",uni);

        fac.facDisplay();
        stu.stuDisplay();
        }
    }