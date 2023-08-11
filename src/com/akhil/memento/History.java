package com.akhil.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastItem = states.get(lastIndex);
        states.remove(lastIndex);

        return lastItem;
    }
}
