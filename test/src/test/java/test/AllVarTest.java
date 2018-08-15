package test;


import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

public class AllVarTest {
	@Test
	public void all()
	{

		assertThat(AllVar.b).isEqualTo(1);
		assertThat(AllVar.a).startsWith("su");
		assertThat(AllVar.c).contains(2);
	}
	@Test
	public void all2()
	{
		assertThat(AllVar.d1.obj).isEqualTo(AllVar.d2.obj);
	}
}
