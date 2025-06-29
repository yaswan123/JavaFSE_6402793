package learn;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class ServiceTest {

	@Test
	public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }

}
