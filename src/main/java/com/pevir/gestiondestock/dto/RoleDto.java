package com.pevir.gestiondestock.dto;

import com.pevir.gestiondestock.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

	private String rolename;

	private Utilisateur utilisateur;
}
