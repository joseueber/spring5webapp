package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootStrapData implements CommandLineRunner {
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        Publisher publisher1 = new Publisher();
        publisher1.setCity("Bom Despacho");
        publisher1.setState("Minas Gerais");
        publisher1.setZip("35600-000");
        publisher1.setAdressline1("Rua Letícia, 561");

        publisherRepository.save(publisher1);

        Publisher publisher2 = new Publisher("Rua Petropolis, 67","Bom Depsacho", "Minas Gerais", "35600-000");

        publisherRepository.save(publisher2);

        System.out.println("Publishers: " + publisherRepository.findAll());
        System.out.println("Count: " + publisherRepository.count());
    }
}
