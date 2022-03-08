package com.dhecotur.utils;

import com.dhecotur.model.Category;
import com.dhecotur.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader implements ApplicationRunner {

    private CategoryRepository categoryRepository;

    @Autowired
    public DataLoader(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void run(ApplicationArguments args) {

        Category hotelFazenda = new Category("Hotel Fazenda", "Estabelecimento rural, com atividade agropecuária, que ofereça entretenimento e vivência do campo.", "https://drive.google.com/uc?export=view&id=1tM7up1ldrYJcnbY0ANxF6o1dB2j18-4M");
        Category ecoPousada = new Category("Eco Pousada", "Meio de hospedagem de característica arquitetônica predominantemente horizontal, construída em harmonia e proporcionando maior contato com a natureza.", "https://drive.google.com/uc?export=view&id=1Fl53pbtg0IBvzr4ZkWnh1xgNQJge1L3g");
        Category hotelSelva = new Category("Hotel de Selva", "Hospedagem imersa na natureza, hotel de selva é situado em florestas ou reservas ambientais, oferecendo ao hóspede vivências com o ecossistema local.", "https://drive.google.com/uc?export=view&id=14XPS6D0Gg4fHWT9obcX_oGIkka7EfpM7");
        Category ecoResort = new Category("Eco Resort", "Eco resort deve possuir infraestrutura para recepção, alojamento, alimentação, lazer e entretenimento, espaço para atividades físicas, estética, com maior foco na natureza e ecoturismo. Deve prezar pela sustentabilidade e impactar o mínimo possível o meio ambiente.", "https://drive.google.com/uc?export=view&id=1_jiOg9wnS09A5JNB49i5DOI66OrTLRN1");
        Category ecoCamping = new Category("Eco Camping", "Acampamento ecológico que tem como principais objetivos incentivar o contato com a natureza, a conscientização ambiental e cultural.", "https://drive.google.com/uc?export=view&id=1YMSvWW3kUt1dO6LYB1PYPJpyQXkcwa15");
        Category atividades = new Category("Atividades", "Atividades que, sempre de maneira sustentável e com total respeito pelos recursos e formas de vidas envolvidas naquele ecossistema, utilizam o próprio ambiente como atração turística.", "https://drive.google.com/uc?export=view&id=1eiZpO-X8X8Ra9_fRVN3FGkt1zGwhGe7t");

        categoryRepository.save(hotelFazenda);
        categoryRepository.save(ecoPousada);
        categoryRepository.save(hotelSelva);
        categoryRepository.save(ecoResort);
        categoryRepository.save(ecoCamping);
        categoryRepository.save(atividades);

    }
}
