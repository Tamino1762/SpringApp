package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.teacher.MeanTeacher;
import spring.beans.teacher.NiceTeacher;


public class SpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        NiceTeacher niceTeacher = context.getBean("myNiceTeacher", NiceTeacher.class);
        MeanTeacher meanTeacher = context.getBean("myMeanTeacher", MeanTeacher.class);

        System.out.println(niceTeacher.getInstrument() + " lessons!");
        System.out.println("Today you will play " + niceTeacher.getPiece());
        System.out.println("Nice Teacher Says " + niceTeacher.getComment());

        System.out.println();
        System.out.println("_________________________________________");
        System.out.println();

        System.out.println(niceTeacher.getInstrument() + " lessons!");
        System.out.println("Today you will play " + meanTeacher.getPiece());
        System.out.println("Mean teacher says " + meanTeacher.getComment());

        context.close();

    }
}
