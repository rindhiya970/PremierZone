package com.player;
import jakarta.persistence.*;


@Entity
@Table(name="player_stats")
public class Player {
    private String name;

    private String nation;

    private String pos;

    private Integer age;

    private Integer mp;

    private Integer starts;
}
