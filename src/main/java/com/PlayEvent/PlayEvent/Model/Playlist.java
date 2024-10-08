package com.PlayEvent.PlayEvent.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "playlist")
public class Playlist {

    @Id
    private final String id;

    private String nom;

    private String description;

    private List<Music> musique;


    public Playlist(String id, String nom, String description, List<Music> musique) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.musique = musique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Music> getMusique() {
        return musique;
    }

    public void setMusique(List<Music> musique) {
        this.musique = musique;
    }

    public String getId() {
        return id;
    }

}
