public class Employee implements EmployeeEducation {
    private String University;
    private String HighSchool;
    private double GPA;
    private char Gender;


    public void Employee() {

    }

    //Personal Data if he is married
    public void PersonalInformation(String gender, String PersonName, int BirthYear, String Phone, Boolean Married, Person SpouseName) {

        if (gender.equals("M") || gender.equals("m")) {

            Male m = new Male();
            m.setPersonName(PersonName);
            m.setBirthYear(BirthYear);
            m.setPhone(Phone);

            if (Married) {
                m.Spouse(SpouseName);
            }


        } else if (gender.equals("f") || gender.equals("F")) {

            Female f = new Female();
            f.setPersonName(PersonName);
            f.setBirthYear(BirthYear);
            f.setPhone(Phone);

            if (Married) {
                f.Spouse(SpouseName);
            }

        }

    }

    //Personal data if he is single
    public void PersonalInformation(String gender, String PersonName, int BirthYear, String Phone) {

        if (gender.equals("M") || gender.equals("m")) {

            Male m = new Male();
            m.setPersonName(PersonName);
            m.setBirthYear(BirthYear);
            m.setPhone(Phone);


        } else if (gender.equals("f") || gender.equals("F")) {

            Female f = new Female();
            f.setPersonName(PersonName);
            f.setBirthYear(BirthYear);
            f.setPhone(Phone);


        }

    }

    public void HighSchool(String school) {
        HighSchool = school;
    }

    public void University(String university) {
        University = university;
    }

    public void GPA(double gpa) {
        GPA = gpa;

    }

    public String HighSchool() {
        return HighSchool;
    }

    public String University() {
        return University;
    }

    public double GPA() {
        return GPA;
    }



}
