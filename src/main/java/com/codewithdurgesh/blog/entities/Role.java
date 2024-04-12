package com.codewithdurgesh.blog.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class Role {

	@Id
	private int id;
	
	private String name;

	@OneToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();
	
}
