import java.util.Scanner;

public class User
{

    public static void main(String[] args)
    {
        System.out.println("Enter your choice:1)Receptionist 2)Paient 3)Doctor");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        do{
            switch(choice)
            {
                case 1: Receptionist R = new Receptionist();
                    R.Choice();
                    break;
                case 2: Patient P = new Patient();
                    P.Choice();
                    break;
                case 3: Doctor D = new Doctor();
                    D.Choice();
                    break;
            }
        }while(choice!=4);
    }

}
class Receptionist extends User
{
    private int r_id;
    private String r_name;

    public void Choice(){
        System.out.println("Enter your choice:1)GiveAppoint 2)GenerateBill");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice){
            case 1: GiveAppoint();
                break;
            case 2: GenerateBill();
                break;
            case 3:  main(null);
        }




    }
    public void GenerateBill(){

        Billing B = new Billing();
        int b_no =B.getB_no();
        String p_name =B.getP_name();
        int p_id = B.getP_id();
        int b_amt = B.getB_amt();
        System.out.println("BillNO: "+b_no +"\n PatientID: "+p_id+"\nPatientName: "+p_name+"\nBillAmount: "+b_amt);

    }

    public void GiveAppoint(){

        Patient P = new Patient();
        String p_name =P.getP_name();
        int p_id = P.getP_id();
        Doctor D = new Doctor();
        int d_id = D.getD_id();
        String d_name = D.getD_name();
        System.out.println("\n PatientID: "+p_id+"\nPatientName: "+p_name+"\nAppointment with Doctor \nDoctorID: "+d_id+
                "\nDoctorName"+d_name);

    }

}


class Patient extends User
{
    private int p_id=101;
    private String p_name="Anushka";

    public void Choice(){
        System.out.println("Enter your choice:1)PayBill");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice){
            case 1: PayBill();
                break;
            case 2: main(null);

        }

    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void PayBill(){
        System.out.println("Thanks For Paying Bill");
    }
}

class Doctor extends User
{
    private int d_id=301;
    private String d_name="Raju Rastogi";

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public void Choice(){
        System.out.println("Enter your choice:1)CheckPatient");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch(choice){
            case 1: CheckPatient();
                break;
            case 2: main(null);

        }
    }

    public void CheckPatient(){
        Patient P = new Patient();
        String p_name =P.getP_name();
        int p_id = P.getP_id();
        System.out.println("Doctor: "+d_name+" has check patient "+p_name);
    }
}



 class Billing
{
    private int b_no=201;
    private int b_amt=1000;
    Patient P = new Patient();
    String p_name =P.getP_name();
    int p_id = P.getP_id();
    public String getP_name() {
        return p_name;
    }
    public int getB_no() {
        return b_no;
    }
    public int getB_amt() {
        return b_amt;
    }
    public Patient getP() {
        return P;
    }
    public int getP_id() {
        return p_id;
    }

}
