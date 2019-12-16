import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class ArithmaticTest {
    private static Arithmatic arithmatic;
    private static int first, second, result;

    @BeforeAll
    public static void init(){
        System.out.println("init()");
        arithmatic = new Arithmatic();
    }

    @ParameterizedTest
    @ValueSource(ints = {4,6,8})
    public void BasicTest(int i){
        System.out.println(i);
        assertTrue(arithmatic.sum(3,3)==i);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,4","2,3,5","1,2,6","6,4,10"})
    public void BasicTest2(int a, int b, int res){
        assertTrue(arithmatic.sum(a,b)==res);
    }


}
