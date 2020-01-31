package Controller;

import com.vss.demodi.controller.PropertyInjectionController;
import com.vss.demodi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    public void setup() throws Exception {
        this.propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_GURU, propertyInjectionController.sayHello());
    }
}
