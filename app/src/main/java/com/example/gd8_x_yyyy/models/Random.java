package com.example.gd8_x_yyyy.models;

public class Random {

    private Long id;
    private String email;
    private String password;
    private String kotaAsal;

    public Random(String email, String password, String kotaAsal) {
        this.email = email;
        this.password = password;
        this.kotaAsal = kotaAsal;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }
}
