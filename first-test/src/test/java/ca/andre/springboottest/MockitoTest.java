package ca.andre.springboottest;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	@Mock
	List<String> list;

	@Test
	public void firstMockitoTest() {

		Mockito.mock(ArrayList.class);
		Mockito.when(list.size()).thenReturn(2);

		int size = list.size();
		list.add("");

		Assertions.assertThat(size).isEqualTo(2);
		
		Mockito.verify(list, Mockito.times(1)).size();
		// Mockito.verify(list, Mockito.never()).size();
		
		InOrder inOrder = Mockito.inOrder(list);
		inOrder.verify(list).size();
		inOrder.verify(list).add("");
		
	}

}
