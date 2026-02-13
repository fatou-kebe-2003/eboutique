package sn.edu.isepat.eboutique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sn.edu.isepat.eboutique.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    boolean existsByNom(String nom);
}
