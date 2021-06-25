package com.example.second.entity;

public class Team {
    private Integer id;
    private String context;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", context='" + context + '\'' +
                '}';
    }
}
