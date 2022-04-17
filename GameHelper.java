import java.util.*;

public class GameHelper extends SimpleDotCom{
	public String getUserInput(String prompt){
		String inputLines = "";
		System.out.print(prompt+" ");
		try{
			//BufferReader is = new BufferReader(new InputStreamReader(System.in));
			Scanner is = new Scanner(System.in);
			inputLines = is.nextLine();

			//if(inputLine.length() == 0) return null;
		}catch(Exception e){
			System.out.println("IOException: "+e);
		}
		return inputLines;
	}
}