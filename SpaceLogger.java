
public class SpaceLogger {
  public void Log(String str){
    for (int i=0; i<str.length(); i++){ // iterating over the number of char in the string
      char curr = str.charAt(i); // getting the character at index
      System.out.print(curr + " "); // printing character the a space notice here i am not using println because i dont want neline after printing
    }
    System.out.println(); // just a newline
  }
  public void Error(String str){
    System.out.print("Error: "); // printing error string
    for (int i=0; i<str.length(); i++){ // doing same as previous method
      char curr = str.charAt(i);
      System.out.print(curr + " ");
    }
    System.out.println();
  }
}

