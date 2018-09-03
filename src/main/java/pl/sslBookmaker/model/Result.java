package pl.sslBookmaker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "results")
public class Result extends BaseModelVersion {

    @Column(name = "team_A_score")
    private Integer TeamAScore;

    @Column(name = "team_B_score")
    private Integer TeamBScore;

    @Enumerated(EnumType.ORDINAL)
    private Winner winner;

    public Integer getTeamAScore() {
        return TeamAScore;
    }

    public void setTeamAScore(Integer teamAScore) {
        TeamAScore = teamAScore;
    }

    public Integer getTeamBScore() {
        return TeamBScore;
    }

    public void setTeamBScore(Integer teamBScore) {
        TeamBScore = teamBScore;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }
}
