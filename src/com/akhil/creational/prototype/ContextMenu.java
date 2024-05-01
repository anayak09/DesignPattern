package com.akhil.creational.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        // Add to your document
    }
}
