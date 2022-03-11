package ma.cigma.pfe;

import ma.cigma.pfe.models.*;
import ma.cigma.pfe.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("idCtrl");
        // Test save use case for three clients
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("ismail"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));
// Test modify use case for client with id==1
        ctrl.modify(new Client(3,"IBTIHAL"));
        ctrl.removeById(1);
        Client client = new Client("ibtihal");
        java.util.List<Produit> produits = Arrays.asList(new Produit("tr",20));
        java.util.List<Adresse> adresses = Arrays.asList(new Adresse("oa","fes","maroc",client));
        client.setAdresses(adresses);
        java.util.List<facture> factures = Arrays.asList(
                new facture(120.00, "ab", produits, client),
                new facture(12.00,"ab",produits,client));
        client.setFactures(factures);
        List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
        client.setPromotions(promotions);
        CarteFidelio carteFidelio = new CarteFidelio(client, "one");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctrl.save(client);
        Client found = ctrl.getById(2);
    }
}