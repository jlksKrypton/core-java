import java.io.File;
import java.io.IOException;

public class deleteFile {

	static String separator=System.getProperty("file.separator");
	static String pathSeparator=System.getProperty("path.separator");
	
	public static void main(String[] args) throws IOException {
		System.out.println(separator);
		System.out.println(pathSeparator);
		if(new File("C:"+separator+"Users"+separator+"krishnasuhas"+separator+"temp.txt").delete())System.out.println("Done");
		if(new File("temp.txt").delete())System.out.println("Done");
		if(new File("fol").delete())System.out.println("Done");
		if(new File("fol"+separator+"temp.txt").delete())System.out.println("Done");
		
		
		//deleting folder which contains only files
		System.out.println("log"+pathSeparator+"check"+separator+"log");
		File[] listfiles=new File("check"+separator+"log").listFiles();
		for(File f:listfiles)
		{
			System.out.println(f.getName());
			f.delete();
		}
		new File("log").delete();//works only when the folder is empty
		deldir("fol1");//deleting the directories which contains sub directories
	}
	
	static void deldir(String a)
	{
		File[] listfiles=new File(a).listFiles();
		for(File f:listfiles)
		{
			if(f.isDirectory()==true)deldir(a+separator+f.getName());
			System.out.println(f.getName());
			f.delete();
		}
		new File(a).delete();
	}
}
