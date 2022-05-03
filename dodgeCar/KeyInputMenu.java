import java.util.HashMap;

public class KeyInputMenu {
    private HashMap<String, KeyInputMenuItem> items = new HashMap<>();

    public void addItem(String key, KeyInputMenuItem item) {
        items.put(key, item);
    }

    public void selectItem(String key) {
        KeyInputMenuItem item = items.get(key);
        if(item != null) {
            item.invoke();
        }
    }
}