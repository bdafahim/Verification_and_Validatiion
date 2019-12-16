
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class AccountTest {
    private static Account account;

    @BeforeAll
    static void init(){
        System.out.println("initalization");
        account = new Account("abc","1234");
    }

    @Test
    void getName(){
        System.out.println("1");
        assertEquals("abc",account.getName());
        //assertEquals("zzz",account.getName());
    }

    @Test
    void setName(){
        System.out.println("2");
        account.setName("vxd");
        assertEquals("vxd",account.getName());
    }

    @Test
    void getPassword(){
        assertEquals("1234",account.getPassword());
    }

    @Test
    void getPasswordError(){
        assertEquals("3254",account.getPassword());

    }
    @Test
    void getPasswordLEN(){
        assertEquals("12",account.getPassword());
    }

    @Test
    void setPassword(){
        account.setPassword("456");
        assertEquals("456","456");
    }

    @Test
    void setPasswordError(){
        account.setPassword("654");
        assertEquals("654","456");
    }


}
