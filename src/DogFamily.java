public class DogFamily extends Dog{
    @Override
    public String move(String name){
        return (name + " jumping");
    }
    @Override
    public String eat(String name) {
        return (name + " eating");
    }

    @Override
    public String high(int meter, double funt){
        return "high " + meter + " meters, " + funt + " foots";
    }

    @Override
    public String weight(int kg, double foot){
        return "weight " + kg + "kg, " + foot + " funts";
    }
}
