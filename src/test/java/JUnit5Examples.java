import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {
    @BeforeAll
    static void setUp(){
        System.out.println("###     @BeforeAll !");
    }
    @BeforeEach
    void beforeEach() {
        //open ("google.com")
        System.out.println("###     @BeforeEach !");
    }
    @AfterEach
    void AfterEach() {
        //open ("google.com")
        System.out.println("###     @AfterEach !");
    }
    @Test
    void firstTest() {
        System.out.println("###    @Test firstTest !");
        assertTrue(3>2);
    }
    @Test
    void secondTest(){
        System.out.println("###     @Test secondTest() !");
        assertFalse(4>2);
    }

}
