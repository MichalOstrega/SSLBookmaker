package pl.sslBookmaker.model;

import javax.persistence.*;

@Entity(name = "matches")
public class Match extends BaseModelVersion {

    @ManyToOne
    @JoinColumn(name = "teamA_id")
    private Team teamA;

    @ManyToOne
    @JoinColumn(name = "teamB_id")
    private Team teamB;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @Column(name = "finished")
    private Boolean finished;

    @Column(name = "round")
    private Integer round;

    @OneToOne(mappedBy = "match")
    @JoinColumn(name = "result_id")
    private Result result;


    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
