package com.inti.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.inti.model.Salarie;
import com.inti.repository.ISalarieRepository;

public class CustomUserDetailsService implements UserDetailsService {

	ISalarieRepository isr;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Salarie s = isr.findByUsername(username);
		
		if(s == null) {
			throw new UsernameNotFoundException("L'utilisateur avec l'username " + username + " n'existe pas en BDD");
		}
		
		return User
				.withUsername(s.getUsername())
				.password(s.getMdp())
				.roles(s.getRole().getNomRole())
				.build();
	}

}
