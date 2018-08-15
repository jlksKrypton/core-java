import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		String input = "I  recenetly joined in   KsquareIt";
		String[] inputarray = input.split("\\s+");
		System.out.println(Arrays.toString(inputarray));
		List<String> output = new ArrayList<String>();
		for (String s : inputarray)output.add(new StringBuffer(s).reverse().toString());
		System.out.println(String.join(" ", output));
	}
}