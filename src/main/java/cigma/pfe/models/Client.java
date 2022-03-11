package cigma.pfe.models;
import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name = "Tcslients")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {


  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
    private long id ;
    private String name;

    public Client(String name) {
        this.name = name; }

    public Client(){}
}
