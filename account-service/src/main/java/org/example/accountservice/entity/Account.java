package org.example.accountservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer solde;
    private Integer nb_loans;
    private Integer nb_card;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public Integer getNb_loans() {
        return nb_loans;
    }
    public void setNb_loans(Integer nb_loans) {
        this.nb_loans = nb_loans;
    }
    public Integer getNb_card() {
        return nb_card;
    }
    public void setNb_card(Integer nb_card) {
        this.nb_card = nb_card;
    }
}
