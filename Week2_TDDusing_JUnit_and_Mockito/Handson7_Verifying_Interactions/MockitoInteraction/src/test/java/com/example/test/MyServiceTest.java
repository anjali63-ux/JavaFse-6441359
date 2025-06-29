package com.example.test;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import com.example.service.ExternalApi;
import com.example.service.MyService;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert
        verify(mockApi).getData(); // Verifies that getData() was called
    }
}
