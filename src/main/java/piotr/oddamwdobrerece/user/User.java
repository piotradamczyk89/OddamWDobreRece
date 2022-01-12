package piotr.oddamwdobrerece.user;

import lombok.Getter;
import lombok.Setter;
import piotr.oddamwdobrerece.role.Role;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String password;
    private boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
