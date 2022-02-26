package cigma.pfe;

//import cigma.pfe.controllers.ClientController;
//import cigma.pfe.models.Client;;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
        // ClientController ctrl1;
        // Client client =new Client(1L,"testing");
        // Client.save(client);

        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       // ClientController ctrl = (ClientController)
        // context.getBean("controller"); // controller est l'id dans le fichierSpring.xml


       // ApplicationContext context = new
             //   ClassPathXmlApplicationContext("spring.xml");
      //  ClientController ctrl = (ClientController)
              //  context.getBean("controller"); // controller est l'id dans le fichierSpring.xml
       // Client client = new Client(1,"fati");
        //ctrl.save(client);

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");
       Client clt = new Client("Fatima");
        ctrl.save(clt);

    }
}
