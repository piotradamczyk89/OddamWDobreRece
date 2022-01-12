package piotr.oddamwdobrerece.user;

public interface UserService {

    User findByUserName(String username);
    void saveUser(User user);
}
