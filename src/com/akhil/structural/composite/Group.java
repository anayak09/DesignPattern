package com.akhil.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        for(Component component : components) {
            // No need to explicitly cast it to a specific object now. ( Bcoz everything implements Component)
            component.render();
        }
    }
}
