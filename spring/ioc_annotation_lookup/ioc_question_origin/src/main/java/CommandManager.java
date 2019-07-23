import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * author: CoffeeAndIce
 */

public class CommandManager {

    @Autowired
    private Command command;

    public Object process(Map commandState) {
        // grab a new instance of the appropriate Command
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }


}