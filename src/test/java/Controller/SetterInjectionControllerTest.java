package Controller;

import com.vss.demodi.controller.SetterInjectionController;
import com.vss.demodi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SetterInjectionControllerTest {

    SetterInjectionController setterInjectionController;

    @BeforeEach
    public void setup() throws Exception {
        this.setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURU, setterInjectionController.sayHello());
    }
}
