package com.cakestudios.deneme;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
public class DenemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DenemeApplication.class, args);

    }

    @Bean
    public ModelMapper getModelmapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
 /*   @Bean
    public Jackson2RepositoryPopulatorFactoryBean jackson2RepositoryPopulatorFactoryBean(){
        Jackson2RepositoryPopulatorFactoryBean factoryBean = new Jackson2RepositoryPopulatorFactoryBean();
        factoryBean.setResources(new Resource[]{new ClassPathResource("projects.json")});
        return factoryBean;
    }*/



}
