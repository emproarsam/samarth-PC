package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.TextEditor;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//      Student student = (Student) context.getBean("student");
//
//      System.out.println("Name : " + student.getName() );
//      System.out.println("Age : " + student.getAge() );
      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}