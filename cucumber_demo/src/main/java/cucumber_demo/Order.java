package cucumber_demo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails = new ArrayList<String>();
    private String message;

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "From " + owner + " to " + target + ": " + message;
    }

    public List<String> getCocktails() {
        return cocktails;
    }
}
