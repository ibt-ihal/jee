package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl  implements ClientService{
    ClientRepository clientRepository;
    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }
   // public ClientServiceImpl() {
      //  System.out.println("Call ClientServiceImpl ....");
    //}

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }


}
