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
    public String high(int h) {
        return "high " + h;
    }

    @Override
    public String weight(int w) {
        return "weight " + w;
    }
}
