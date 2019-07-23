import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * author: CoffeeAndIce
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:application.xml")
public class TestSington {
    @Autowired
    CommandManager commandManager;
    @Test
    public void testss() {
        Map a = new HashMap();
        a.put(0,1);
        a.put(1,2);
        System.out.println("测试单例bean和原型bean的调用");
        int i = 0;
        while (i < 3) {
            i++;
            commandManager.process(a);
        }
    }

    ;
}
