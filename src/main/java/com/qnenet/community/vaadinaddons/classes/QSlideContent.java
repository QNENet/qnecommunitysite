package com.qnenet.community.vaadinaddons.classes;

public class QSlideContent {
    private String htmlStr;
    private String backgroundColor;

    public QSlideContent() {
        // kryo needs constructor with no params
    }

    public QSlideContent(String htmlStr, String backgroundColor) {
        this.htmlStr = htmlStr;
        this.backgroundColor = backgroundColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


    public void setHtmlStr(String s) {
        this.htmlStr = s;
    }

    public String getHtmlStr() {
        return htmlStr;
    }
}
