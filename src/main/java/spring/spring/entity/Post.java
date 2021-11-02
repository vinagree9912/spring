package spring.spring.entity;

import javax.persistence.*;

@Entity
@Table(name ="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name ="description",length = 255)
    private String description;

    @ManyToOne
    private User user;

}
