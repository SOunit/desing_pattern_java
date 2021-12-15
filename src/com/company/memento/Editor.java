package com.company.memento;

import java.util.Stack;

public class Editor {
    private String content;
    private Stack<String> keep = new Stack<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        keep.push(content);
    }

    public void undo(){
        if(this.keep.empty()){
             return;
        }

        this.keep.pop();

        if(this.keep.empty()){
            this.content = null;
            return;
        }

        String text = this.keep.peek();
        this.content = text;
    }
}
