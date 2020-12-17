public class Dog implements Animal{
  public String move(String name) {
     return (name + " running");
    }
    public String eat( String name){
        return (name + " eating");
    }
      public String high(int meter, double funt){
        return "high " + meter + " meters, " + funt + " foots ";
      }
      public String weight(int kg, double foot){
        return "weight " + kg + "kg, " + foot + " funts";
    }

}
