import java.util.Map;

/**
 * author: CoffeeAndIce
 */

public class Command {
    public Map state;

    public Map getState() {
        return state;
    }

    public void setState(Map state) {
        this.state = state;
    }

    public int execute() {
        System.out.println(this.hashCode());

        state.forEach((k,v)->System.out.println(k + " = " + v));
        return this.hashCode();
    }


}
