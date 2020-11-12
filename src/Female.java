public class Female extends Person {

    public void Female(){

    }

    @Override
    public void Spouse(Person husband){

        Male m = new Male();
        m.setPersonName(husband.getPersonName());

    }


}