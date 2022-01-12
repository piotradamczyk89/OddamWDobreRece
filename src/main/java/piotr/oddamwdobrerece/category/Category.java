package piotr.oddamwdobrerece.category;


import lombok.Getter;
import lombok.Setter;
import piotr.oddamwdobrerece.donation.Donation;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Donation donation;
}
