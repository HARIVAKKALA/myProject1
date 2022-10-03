package DependecyInjection.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app =  new ClassPathXmlApplicationContext("dependency.xml");
    	Student st = app.getBean("stu",Student.class);
    	st.display();
       
    }
}
