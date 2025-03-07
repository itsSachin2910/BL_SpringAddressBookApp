package com.example.SpringAddressBookAppDevelopment.repository;

import com.example.SpringAddressBookAppDevelopment.model.AddressBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookEntry, Long> {
}