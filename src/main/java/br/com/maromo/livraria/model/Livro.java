package br.com.maromo.livraria.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private int ano;

    @Column(nullable = false)
    private String editora;

    @Column(nullable = false)
    private String isbn;

}
