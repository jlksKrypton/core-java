import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;

public class move_nameFile {
	static String separator=System.getProperty("file.separator");
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(separator);
		
		new File("check"+separator+"log"+separator+"c1.txt").renameTo(new File("check"+separator+"c1shift.txt"));
		
		System.out.println(new File("check"+separator+"c1shift.txt").length());
		
		String fname=new File("check"+separator+"c1shift.txt").getName();
		System.out.println("File extension is: "+fname.substring(fname.lastIndexOf(".")+1));
		
		System.out.println(new File("temp1.txt").exists());
		
		System.out.println(new Date(new File("temp2.txt").lastModified()));
		
		
		File[] filenames=new File(".").listFiles((d, n)->{return n.toLowerCase().endsWith(".txt");});
		for(File f:filenames)System.out.println(f.getName());
		
		
		InputStream is=new FileInputStream("temp2.txt");
		OutputStream os= new FileOutputStream("temp3.txt");
		byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
        is.close();
        os.close();
        
        Files.copy(Paths.get("temp2.txt"), Paths.get("temp1.txt"));
        
        List<String> allLines = Files.readAllLines(Paths.get("temp2.txt"));
        allLines.forEach(System.out::println);
	}
}
