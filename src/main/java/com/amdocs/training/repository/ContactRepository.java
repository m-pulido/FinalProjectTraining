package com.amdocs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.training.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
