package com.itgenius.service.organization.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itgenius.service.organization.model.Organization;

public interface OrganizationRepository extends MongoRepository<Organization, String> {
}