package ca.andre.springboottest;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTest {
	
	@Test
	public void firstMockitoTest() {
		
		List<String> list = Mockito.mock(ArrayList.class);
		
		Mockito.when(list.size()).thenReturn(20);
		
		int size = list.size();
		
		Assertions.assertThat(size).isEqualTo(20);
		
	}
	
	
	

}
