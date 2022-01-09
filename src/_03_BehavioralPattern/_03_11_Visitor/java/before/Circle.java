package _03_BehavioralPattern._03_11_Visitor.java.before;

public class Circle implements Shape {

  @Override
  public void toPrint(Device device) {
    if (device instanceof Phone) {
      System.out.println("print Circle to Phone");
    } else if (device instanceof Watch) {
      System.out.println("print Circle to Watch");
    }
  }
  
}
