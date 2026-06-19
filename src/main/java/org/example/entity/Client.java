@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @OneToMany(mappedBy = "client")
    private List<Ticket> tickets = new ArrayList<>();
}
