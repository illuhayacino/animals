public class Dog implements Animal{
  public String move(String name) {
     return (name + " running");
    }
    public String eat( String name){
        return (name + " eating");
    }
      public String high(int h){
        return "high " + h;
      }
      public String weight(int w){
        return "weight " + w;
    }

}
