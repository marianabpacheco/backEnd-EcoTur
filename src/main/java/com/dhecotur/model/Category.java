package com.dhecotur.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Lob
    private String descricao, url;

    public Category(String titulo, String descricao, String url) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
    }



    @Override
    public String toString() {
        return "Categorias{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
