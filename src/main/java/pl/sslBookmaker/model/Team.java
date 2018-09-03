package pl.sslBookmaker.model;

import javax.persistence.Entity;

@Entity(name = "teams")
public class Team extends BaseModelVersion {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
