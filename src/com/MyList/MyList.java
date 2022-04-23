package com.MyList;

public class MyList {

    private Node1 head;

    public MyList(){
        this.head=null;
    }
    public void addMonth(Month month){
        Node1 tmp=new Node1();
        tmp.month= month;
        tmp.next=head;
        head=tmp;
    }

     public void show(){
        Node1 tmp=this.head;
        while(tmp!=null){
            System.out.println(tmp.month.getData());
            tmp=tmp.next;
        }
     }

}
