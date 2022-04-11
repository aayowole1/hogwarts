package edu.tcu.cs.hogwartsartifactsonline.service;

import edu.tcu.cs.hogwartsartifactsonline.dao.UserDao;
import edu.tcu.cs.hogwartsartifactsonline.dao.WizardDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService  {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(Integer id) {
        return userDao.findById(id).get();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(Integer id, User user) {
        user.setId(id);
        userDao.save(user);
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userDao.findByUsername(username);
//        if(user != null){
//            return new MyUserPrincipal(user);
//        }else{
//            throw new UsernameNotFoundException(username);
//        }
//
//    }
}
