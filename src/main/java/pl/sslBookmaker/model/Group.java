package pl.sslBookmaker.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "groups")
public class Group extends BaseModelVersion {

    private String name;

    @OneToMany(mappedBy = "group")
    private Set<Participant> participants;

    @OneToMany(mappedBy = "group")
    private Set<Match> matches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }
}
