import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

public class MathApplicationTest {
    @Test
    void addTest(){
        CalculatorService calculatorService = mock(CalculatorService.class);
        final MathApplication mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);
        when(calculatorService.add(10.0,20.0)).thenReturn(30.0);
        when(calculatorService.subtract(20.0,10.0)).thenReturn(10.0);
        doThrow(new ArithmeticException("can't expressed")).when(calculatorService).divide(1,0);

        assertEquals(30.0,mathApplication.add(10.0,20.0));
        assertEquals(10.0,mathApplication.subtract(20.0,10.0));
        assertThrows(ArithmeticException.class, () -> mathApplication.divide(1,0));
        //assertEquals(50.0,mathApplication.add(10.0,20.0));

        verify(calculatorService,times(1)).add(10.0,20.0);
        //verify(calculatorService,times(2)).subtract(20.0,12.0);
        then(calculatorService).should(times(1)).divide(1,0);

        when(calculatorService.multiply(20.0,10.0)).thenAnswer(new Answer<Object>() {

            @Override
            public Double answer(InvocationOnMock invocation) throws Throwable {
                //get the arguments passed to mock
                Object[] args = invocation.getArguments();

                //get the mock
                Object mock = invocation.getMock();

                //return the result
                return 30.0;
            }
        });

        //test the add functionality
        assertEquals(mathApplication.multiply(20.0, 10.0),30.0,0);

    }

}
