package com.przemo;
import org.w3c.dom.Node;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;



public class Main  {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String [] months ={"Sty","Luty","Marzec","Kwiecien","Maj","Czerwiec","Lipiec"};
        int[]days={31,29,31,30,31,30,31,31};

        for(int i=0;i< months.length;i++){
            System.out.println(months[i]+"-"+days[i]);
        }
        /*==============================================*/
        Month[] tab=new Month[12];
        int elementsCount=0;
        for(int i=0;i< months.length;i++){
            if(i==1)
                tab[i]=new Month(months[i],days[i],true);
            else
                tab[i]=new Month(months[i],days[i]);
            elementsCount++;
        }
        System.out.println("Tab length: "+tab.length);
        for(int i=0;i< tab.length;i++){
            System.out.println("tab["+i+"]="+tab[i]);
        }
        for(int i=0;i<elementsCount;i++){
            System.out.println("tab["+i+"]="+tab[i].getData());
        }

        /*==============================================*/

        Node1 head=null; //pierwszy element listy, identyfikuje nam jakis obiekt(wartosc) trzeba przypisac jakas rzecz poniewaz na razie nie mamy
                             //obiektru ktory moglaby identyfkowac

        System.out.println("head is: "+head);

   /*     for(int i=0;i< months.length;i++){
           //bede chcial tworzyc obiekt klasy month i umieszczac go w obrebie nowo utworzonym node
            Node1 tmp=new Node1();  //tworze obiekt klasy Node
            tmp.month= new Month(months[i],days[i]);
            tmp.next=head;
            head=tmp;
        }*/
        System.out.println("Test node");
            //bede chcial tworzyc obiekt klasy month i umieszczac go w obrebie nowo utworzonym node
            Node1 tmp=new Node1();  //tworze obiekt klasy Node
            tmp.month= new Month(months[0],days[0]);
            tmp.next=head;
            head=tmp;
        System.out.println(head.month.getData());

    }


}






