package generics;

import java.util.List;

public class genClass {

	public static class oldGen
	{
		private Object t;
		
		public Object getT() {
			return t;
		}

		public void setT(Object t) {
			this.t = t;
		}
	}
	
	static class newGen<T>
	{
		private T t;

		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}
	}
	
	public static void main(String[] args) {
		
		oldGen o =new oldGen();
		o.setT("Suhas");
		String name=(String)o.getT();
		System.out.println(name);
		newGen<String> n =new newGen<String>();
		n.setT("Suhas");
		name=n.getT();
		System.out.println(name);
	}
}
