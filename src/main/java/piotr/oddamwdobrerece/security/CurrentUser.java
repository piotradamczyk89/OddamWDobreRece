package piotr.oddamwdobrerece.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {

    private final piotr.oddamwdobrerece.user.User user;

    public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       piotr.oddamwdobrerece.user.User user) {
        super(username, password, authorities);
        this.user = user;
    }

    public piotr.oddamwdobrerece.user.User getUser() {
        return user;
    }
}
