package com.openclassrooms.webapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data //pour ne pas avoir à faire les getters et setters
@Configuration //précise que la classe est une bean pour la config de l'appli
@ConfigurationProperties(prefix="com.openclassrooms.webapp") //met en // la classe avec application.properties
//scanne les propriétés commençant par com.openclassrooms.webapp

public class CustomProperties {

    private String apiUrl; //correspond à apiUlrl dans le fichier properties


}
