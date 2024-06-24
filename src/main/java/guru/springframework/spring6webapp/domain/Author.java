package guru.springframework.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Long getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public Set<Book> getBooks()
    {
        return books;
    }

    public void setBooks( Set<Book> books )
    {
        this.books = books;
    }
}
