package com.company;

import com.company.memento.Editor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Editor editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
        System.out.println(editor.getContent());
        }
}
