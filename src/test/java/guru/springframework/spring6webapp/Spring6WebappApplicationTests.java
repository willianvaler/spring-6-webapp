package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappApplicationTests
{
    @Autowired
    ApplicationContext context;

    @Autowired
    MyController controller;

    @Test
    void testAutoWiredOfController()
    {
           System.out.println(controller.sayHello());
    }

    @Test
    void testGetControllerFromCtx()
    {
        MyController controller = context.getBean(MyController.class);

        System.out.println( controller.sayHello() );
    }

    @Test
    void contextLoads()
    {

    }

}
