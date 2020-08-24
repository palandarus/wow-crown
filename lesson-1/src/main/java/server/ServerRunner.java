package server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

public class ServerRunner {

    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Server server=context.getBean("server", Server.class);

    }

}
