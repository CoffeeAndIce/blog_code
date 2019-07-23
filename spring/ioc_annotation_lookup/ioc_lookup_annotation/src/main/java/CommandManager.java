import org.springframework.beans.factory.annotation.Lookup;

import java.util.Map;

/**
 * author: CoffeeAndIce
 */

public abstract class CommandManager {


    public Object process(Map commandState) {
        // grab a new instance of the appropriate Command
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    // 也可以写成 @Lookup("command") 来指定需要注入的bean
    @Lookup
    protected abstract Command createCommand() ;



}