package com.gmail.lizaiatsenko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Robot robot1= (ToshibaRobot) context.getBean("robot");
        robot1.speak();
        robot1.go();

        Robot robotMac= (MacRobot) context.getBean("robotMac");
        robotMac.speak();
    }
}
