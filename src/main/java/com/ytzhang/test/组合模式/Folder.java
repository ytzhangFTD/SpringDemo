package com.ytzhang.test.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Administrator 2017/3/2
 */
public class Folder implements Component {

    private List<Component> list = new ArrayList<Component>();

    public void addComponent(Component t) throws Exception {
        list.add(t);
    }

    public void removeComponent(Component t) throws Exception {
        list.remove(t);
    }

    public Component getChild(int i) throws Exception {
        return list.get(i);

    }

    public void kill() {
        for (Component component : list) {
            component.kill();
        }
    }
}
