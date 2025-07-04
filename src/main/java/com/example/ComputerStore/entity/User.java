package com.example.ComputerStore.entity;

import com.example.ComputerStore.enumeric.TypeLogin;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column
    private String phone;

    @Column
    private String address;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String password;

    @Column(name = "is_admin", nullable = false)
    private String isAdmin;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_login", nullable = false)
    private TypeLogin typeLogin;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ApiKey apiKey;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BuildPcCart> buildPcCarts = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserWatchProduct> userWatchProducts = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ProductPreview> productPreviews = new ArrayList<>();


    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Date();
    }
}
