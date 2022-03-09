package com.dhecotur.model;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "tb_category")
public class Category {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Lob
    private String description, url;

    public Category(String titulo, String descricao, String url) {
        this.title = titulo;
        this.description = descricao;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
