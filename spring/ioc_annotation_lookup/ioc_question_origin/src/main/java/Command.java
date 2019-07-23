import java.util.Map;

/**
 * author: CoffeeAndIce
 */

public class Command {
    public Map state = null;

    public Map getState() {
        return state;
    }

    public void setState(Map state) {
        if(this.state!=null){
            System.out.println("not null");
        }
        this.state = state;
    }

    public int execute() {
        System.out.println(this.hashCode());
        state.forEach((k,v)->System.out.println(k + " = " + v));
        return this.hashCode();
    }


}
