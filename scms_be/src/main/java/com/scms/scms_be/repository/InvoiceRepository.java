package com.scms.scms_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scms.scms_be.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
