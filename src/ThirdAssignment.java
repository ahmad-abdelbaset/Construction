import java.util.Scanner;


public class ThirdAssignment extends Employee{
    private String PersonName = "NA";
    static private int BirthYear = 0;
    private String Phone= "056";
    private String Gender ="NA";
    static private Boolean Married=false;
    static private String HighSchool="NA";
    static private String University="NA";
    static private double GPA=0;
    static private String SpouseName ="NA";


    public static void main(String[] args){
        Employee e = new Employee ();
        System.out.println("Hi, Enter the following:A Employee name (e.g: Ahmad):");
        Scanner scanner = new Scanner(System.in);
        String PersonName = scanner.nextLine();

        System.out.println("Her/His BirthYear (e.g 1994)?");
        String BirthYearString = scanner.nextLine();
        BirthYear = Integer.parseInt(BirthYearString);

        System.out.println("Her/His Phone (e.g 059000000)?");
        String Phone = scanner.nextLine();

        System.out.println("Her/His Gender (e.g M)?");
        String Gender = scanner.nextLine();


        System.out.println("What was her/his High school name (e.g: Shufat)?");
        HighSchool = scanner.nextLine();

        System.out.println("What was her/his University name (e.g: Birzeit)?");
        University = scanner.nextLine();


        System.out.println("What was her/his GPA (e.g: 3.2)?");
        String gpa = scanner.nextLine();
        GPA = Double.parseDouble(gpa);

        System.out.println("Does she/he married (e.g:Y)?");
        String married = scanner.nextLine();


        // If married and male will be asked about his wife.
        if(married.equals("y")|| married.equals("Y")){

            Married= true;

            if (Gender.equals("m") || Gender.equals("M")){
                System.out.println("Please enter his wife name");
                SpouseName = scanner.nextLine();

                Female wife = new Female();
                wife.setPersonName(SpouseName);
                e.PersonalInformation(Gender, PersonName, BirthYear, Phone, Married,wife);

        // If married and Female will be asked about her husband.
            }else if (Gender.equals("F") || Gender.equals("f")){

                System.out.println("Please enter her husband name");
                SpouseName = scanner.nextLine();

                Male husband = new Male();
                husband.setPersonName(SpouseName);

                e.PersonalInformation(Gender, PersonName, BirthYear, Phone, Married,husband);


            }

        } else {

            //if he/she is single
            e.PersonalInformation(Gender, PersonName, BirthYear, Phone);
        }

        e.HighSchool(HighSchool);
        e.University(University);
        e.GPA(GPA);

        System.out.println("Thank You!");


    }

}
