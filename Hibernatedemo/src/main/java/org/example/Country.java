package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ElementCollection
    @MapKeyColumn(name = "player_name")
    @Column(name = "score")
    @CollectionTable(name = "country_player_scores", joinColumns = @JoinColumn(name = "country_id"))
    private Map<String, Integer> playerScores = new HashMap<>();

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getPlayerScores() {
        return playerScores;
    }

    public void setPlayerScores(Map<String, Integer> playerScores) {
        this.playerScores = playerScores;
    }
}
