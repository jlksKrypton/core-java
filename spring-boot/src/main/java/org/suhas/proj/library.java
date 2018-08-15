package org.suhas.proj;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class library{
	public static Map<Integer,book> lib=new HashMap<Integer,book>();
	static
	{
		lib.put(1,new book(1,"a"));
		lib.put(2,new book(2,"b"));
		lib.put(3,new book(3,"c"));
		lib.put(4,new book(4,"d"));
		lib.put(5,new book(5,"e"));
		lib.put(6,new book(6,"f"));
		
	}

}
