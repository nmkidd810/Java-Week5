
public class Week5 {

  public static void main(String[] args) {
    
        // Object og Asterisk class
        AsteriskLogger AL = new AsteriskLogger();
        AL.Log("Hello"); // printing log from asterisk class
        System.out.println(); // printing newline for a clear output
        AL.Error("Hello"); // printing error from asterisk class
        System.out.println();// printing newline for a clear output

        SpaceLogger SL = new SpaceLogger();
        SL.Log("Hello"); // printing log from SpaceLogger class
        System.out.println(); // printing newline for a clear output
        SL.Error("Hello"); // printing error from SpaceLogger class
        System.out.println(); // printing newline for a clear output
      }
    }
  

