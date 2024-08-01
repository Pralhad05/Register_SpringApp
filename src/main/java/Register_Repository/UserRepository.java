package Register_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Register_Entity.UserDtl;

public interface UserRepository extends JpaRepository<UserDtl,Integer>{
    
}
