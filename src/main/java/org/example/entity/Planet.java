@Entity
@Table(name = "planet")
public class Planet {

    @Id
    private String id;

    @Column(length = 500, nullable = false)
    private String name;
}
