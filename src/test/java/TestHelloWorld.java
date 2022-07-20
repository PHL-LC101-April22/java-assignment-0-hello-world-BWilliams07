import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
public class TestHelloWorld {

    public class HelloWorld {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Hello World!");
        }
    }
    @Test
    public void testSayHello() {
        assertEquals("Hello, World!", HelloWorld.sayHello());
    }

}
