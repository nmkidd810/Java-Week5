
public interface Logger {
  void log(String message);
  void error(String Message);

}

class AsteriskLogger implements Logger {
  public void Log(String str){
    System.out.println("***" + str + "***"); // printing stars first then string then again stars
  }
  public void Error(String str){
    String res = "***" + "Error: " + str + "***"; // doing this first so i can get the length of the string
    // then use it to get stars for above and below the error

    String stars = "";
    for (int i=0; i<res.length(); i++) stars += "*"; // making start according to the length of the Error statement

    System.out.println( // printing error log
        stars + 
        "\n" + res +
        "\n" + stars 
        );
  }
  @Override
  public void log(String message) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void error(String Message) {
    // TODO Auto-generated method stub
    
  }
}