package org.example;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "author_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    // constructors, getters and setters

    public abstract String getAuthorType();
}

@Entity
@DiscriminatorValue("novel")
class NovelAuthor extends Author {
    private String genre;

    // constructors, getters and setters

    @Override
    public String getAuthorType() {
        return "novel";
    }
}

@Entity
@DiscriminatorValue("tech")
 class TechAuthor extends Author {
    private String specialty;

    // constructors, getters and setters

    @Override
    public String getAuthorType() {
        return "tech";
    }
}

@Entity
 class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // constructors, getters and setters
}
