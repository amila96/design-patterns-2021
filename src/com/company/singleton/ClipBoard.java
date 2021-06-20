package com.company.singleton;

public class ClipBoard {

    private String content;

    private static ClipBoard clipBoard= new ClipBoard();

    private ClipBoard(){
        System.out.println("Clip board object created");
    }

    public static ClipBoard getInstance(){
        if(clipBoard==null){
            clipBoard=new ClipBoard();
        }
        return clipBoard;
    }

    public void copy(String text){
        this.content=text;
    }
    public void paste(){
        System.out.println(this.content);
    }
}
