import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
public class readFile {
	public static void main(String[] args) {
	try {
	File readThis;
	File file = new File("toArray.txt");
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	StringBuffer stringBuffer = new StringBuffer();
	String line;
	ArrayList<String> newArray = new ArrayList<String>();
	while ((line = bufferedReader.readLine()) != null) {
				newArray.add(line);
			}
	fileReader.close();
	String[] finalArray = new String[newArray.size()];
	newArray.toArray(finalArray);
	System.out.println(Arrays.toString(finalArray));
		}
			catch (IOException e) {
			e.printStackTrace();
		}
	}
}