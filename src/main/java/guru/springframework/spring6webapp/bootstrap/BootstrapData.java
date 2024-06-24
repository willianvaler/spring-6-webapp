package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData( AuthorRepository authorRepository, BookRepository bookRepository )
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
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

        authorRepository.save( ericSaved );
        authorRepository.save( rodSaved );

        System.out.println( "In bootstrap" );
        System.out.println( "Author Count: " + authorRepository.count() );
        System.out.println("Book Count: " + bookRepository.count() );


    }
}
