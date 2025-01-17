package fabioran.u5d8project.repositories;

import fabioran.u5d8project.entities.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {
    Optional<Authors> findByEmail(String email);
}
