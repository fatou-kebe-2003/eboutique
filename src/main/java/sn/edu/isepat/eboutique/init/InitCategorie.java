package sn.edu.isepat.eboutique.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepat.eboutique.entities.Categorie;
import sn.edu.isepat.eboutique.repositories.CategorieRepository;

@Component
public class InitCategorie implements CommandLineRunner {
    private final CategorieRepository categorieRepository;

    public InitCategorie(CategorieRepository categorieRepository){
        this.categorieRepository = categorieRepository;


    }
    @Override
    public void run(String... args) throws Exception{
        String nomCategorie = "ELECTROMENAGER-FATOU-KEBE";

        if (!categorieRepository.existsByNom(nomCategorie)){
            Categorie Categorie = new Categorie();
            Categorie.setNom(nomCategorie);
            categorieRepository.save(Categorie);
            System.out.println("categorie cree avec succes");

        }
        else {
            System.out.println("la categorie existe deja.");
        }
    }
}
