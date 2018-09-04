package pl.sslBookmaker.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "participants")
public class Participant extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    @Column(name = "goal_scored")
    private Integer goalScored = 0;

    @Column(name = "goal_lost")
    private Integer goalLost = 0;

    @Column(name = "won")
    private Integer won = 0;

    @Column(name = "lost")
    private Integer lost = 0;

    @Column(name = "draw")
    private Integer draw = 0;

    @Column(name = "points")
    private Integer points = 0;

    @ManyToOne
    private Group group;

}
