
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class createFile { // and directories also
	
	public static void main(String[] args) throws IOException {
		
		//First way

		String separator=System.getProperty(File.separator);
		String pathSeparator=System.getProperty(File.pathSeparator);
		System.out.println(separator);
		if(new File("C:"+separator+"Users"+separator+"krishnasuhas"+separator+"temp.txt").createNewFile())System.out.println("Done");
		if(new File("temp.txt").createNewFile())System.out.println("Done");
		new File("fol").mkdir();
		if(new File("fol"+separator+"temp.txt").createNewFile())System.out.println("Done");
		
		//Second way
		new FileOutputStream("C:"+separator+"Users"+separator+"krishnasuhas"+separator+"temp2.txt").write(new String("Suhas").getBytes());
		new FileOutputStream("temp2.txt").write(new String("Suhas").getBytes());
		new FileOutputStream("fol"+separator+"temp2.txt").write(new String("Suhas").getBytes());
		
		//Third way
		Files.write(Paths.get("temp3.txt"), new String("Suhas").getBytes());
		
	}
}
