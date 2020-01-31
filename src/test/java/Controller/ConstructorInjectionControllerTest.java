package Controller;

import com.vss.demodi.controller.ConstructorInjectionController;
import com.vss.demodi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectionControllerTest {
    private ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    public void Setup() throws Exception {
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURU, constructorInjectionController.sayHello());
    }
}
