class employee{
    int empid;
    String name;
   static String company1;
    employee(int empid,String name,String company){
        this.empid = empid;
        this.name = name;
        employee.company1 = company;
    }
    void display(){
        System.out.println(empid + " " + name + " "+ employee.company1);
    }
}

class test1 {
    static  int a = 10;
    void ml()
    {
        int b = 20 ;
        System.out.println(test1.a);  // error illegal expression

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        test1 l = new test1();
        l.ml();



        employee c = new employee(101,"Maaz","Temperas");
        c.display();
        employee c2 = new employee(102,"Farrukh","Temperas");
        c2.display();


    }
}