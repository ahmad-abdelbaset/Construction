public abstract class Person {
    private String PersonName =" ";
    private int BirthYear = 0;
    private String Phone= "056";


    public Person (){

    }

    public abstract void Spouse(Person spouse); //Abstrac Method

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }


    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPersonName() {
        return PersonName;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public String Phone() {

        return Phone;
    }

}
