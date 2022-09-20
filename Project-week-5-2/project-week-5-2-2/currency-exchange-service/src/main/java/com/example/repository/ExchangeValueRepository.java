package com.example.repository;

import com.example.model.ExchangeValue;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository <ExchangeValue,Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
