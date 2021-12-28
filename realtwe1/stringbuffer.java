public class stringbuffer {
    public static void main(String[] args) {
      StringBuffer stringName = new StringBuffer(" Welcome");
      System.out.println(stringName);
      stringName.insert(8, " to ");
      System.out.println(stringName);
      stringName.insert(12, "TechVidvan ");
      System.out.println(stringName);
      stringName.insert(22, " Tutorial ");
      System.out.println(stringName);
      stringName.insert(31, " of ");
      System.out.println(stringName);
      stringName.insert(35, "Java");
      System.out.println(stringName);
    }
  }