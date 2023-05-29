package apigym.springapigym.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="users")
@Getter @Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false,unique = true)
    private String email;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersistence(){
        createAt = new Date();
    }

    private static final long serialVersionUID = 1L;
}
