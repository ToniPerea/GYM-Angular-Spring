package apigym.springapigym.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TableExercise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany( targetEntity=Exercise.class )
    private List exerciseList;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersistence(){
        createAt = new Date();
    }

    private static final long serialVersionUID = 1L;
}
