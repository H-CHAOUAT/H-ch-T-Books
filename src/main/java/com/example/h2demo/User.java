package com.example.h2demo;



//Class Users :
//Attributs : id(int), name, userName, email, password, address.string for the rest
//Méthodes : registerUser(), loginUser(), updateUser(), etc.

public class User {

    private int id;
    private String name;
    private String userName;
    private String email;
    private String passwordHash;
    private String address;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(int id, String name, String userName, String email, String password, String address, String phone) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.passwordHash = password;
        this.address = address;
        this.phone = phone;

    }
    // Méthode pour enregistrer un utilisateur // to use later
//    public void registerUser() {
//        System.out.println("Utilisateur enregistré : " + this.name);
//    }
//
//    // Méthode pour connecter un utilisateur  // to use later
//    public boolean loginUser(String email, String password) {
//        if (this.email.equals(email) && this.passwordHash.equals(password)) {
//            System.out.println("Connexion réussie pour l'utilisateur : " + this.userName);
//            return true;
//        } else {
//            System.out.println("Connexion échouée : email ou mot de passe incorrect.");
//            return false;
//        }
//    }

//    // Méthode pour mettre à jour les informations d'un utilisateur // to use later
//    public void updateUser(String name, String userName, String email, String password, String address, String phone) {
//        this.name = name;
//        this.userName = userName;
//        this.email = email;
//        this.passwordHash = password;
//        this.address = address;
//        this.phone = phone;
//        System.out.println("Les informations de l'utilisateur ont été mises à jour.");
//    }
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + passwordHash + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
