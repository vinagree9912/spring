package spring.spring.repository;



import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.spring.DTO.UserDTO;
import spring.spring.entity.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value ="SELECT u FROM User u WHERE u.email =:email ")
   // @Query(value ="SELECT u FROM User u WHERE u.email =:?1 ")
    Optional<User> findbyUserEmail(String email);

    @Query(value = "SELECT x FROM User x WHERE x.name LIKE %:name% ")
    List<User> findAndSort(String name, Sort sort);

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndName(String email, String name);

    List<User> findByEmailLike(String email);

    List<User> findByEmailOrName(String email,String name);

    List<User> findByBirthDateIsBetween(LocalDate begin, LocalDate end);

    List<User> findByNameLikeOrderByIdDesc(String name);

    @Query("SELECT new spring.spring.DTO.UserDTO(u.id,u.name,u.email,u.birthDate) FROM User u " +
            "WHERE u.birthDate=:birthDate " +
            "AND u.email=:email")
    Optional<UserDTO> getAllByBirthDateAndEmail(@Param("birthDate") LocalDate birthDate, @Param("email") String email);

}
