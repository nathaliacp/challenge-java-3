package br.com.alura.mymusics.models;

public class Podcast extends Audio {
    private String host; //apresentador
    private String description; //descricao

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
