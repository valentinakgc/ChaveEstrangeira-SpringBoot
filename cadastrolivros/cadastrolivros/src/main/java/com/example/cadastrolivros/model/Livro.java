package com.example.cadastrolivros.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
@Entity
@Getter
@Setter
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String edição;
   private String titulo;
   private int ano;   
   private int numPaginas;


    @ManyToOne
    private Autor autor;


    @ManyToOne
    private Genero genero;
}
