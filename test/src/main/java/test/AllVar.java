package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
public class AllVar {
	
	static String a="suhas";
	static int b=1;
	static List<Integer> c= Arrays.asList(1,2,3,4);
	static child d1=new child();
	static child d2=new child();
	
}


class child
{
	static int obj=1;
}