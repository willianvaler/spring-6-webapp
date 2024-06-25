package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData( AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository )
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run( String... args ) throws Exception
    {
        Author eric = new Author();

        eric.setFirstName("Eric");
        eric.setLastName( "evans" );

        Book ddd = new Book();
        ddd.setTitle( "DDD" );
        ddd.setIsbn( "12346" );

        Author ericSaved = authorRepository.save( eric );
        Book dddSaved = bookRepository.save( ddd );

        Author rod =  new Author();
        rod.setFirstName( "Rod" );
        rod.setLastName( "johnson" );

        Book noEJb = new Book();
        noEJb.setTitle( "no ejb" );
        noEJb.setIsbn( "12345" );

        Author rodSaved = authorRepository.save( rod );
        Book noEJbSaved = bookRepository.save( noEJb );

        ericSaved.getBooks().add( dddSaved  );
        rodSaved.getBooks().add( noEJbSaved );
        dddSaved.getAuthors().add( ericSaved );
        noEJbSaved.getAuthors().add( rodSaved );

        Publisher publisher = new Publisher();
        publisher.setPublisherName( "publisher" );
        publisher.setAddress( "123 main" );
        publisherRepository.save( publisher );

        dddSaved.setPublisher( publisher );
        noEJbSaved.setPublisher( publisher );

        authorRepository.save( ericSaved );
        authorRepository.save( rodSaved );
        bookRepository.save( dddSaved );
        bookRepository.save( noEJbSaved );

        System.out.println( "In bootstrap" );
        System.out.println( "Author Count: " + authorRepository.count() );
        System.out.println("Book Count: " + bookRepository.count() );

        System.out.println( "Publisher Count: " + publisherRepository.count() );
    }
}
