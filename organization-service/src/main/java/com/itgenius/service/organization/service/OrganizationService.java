package com.itgenius.service.organization.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgenius.service.organization.model.Organization;
import com.itgenius.service.organization.repository.OrganizationRepository;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> findAllOrganization() {
        return organizationRepository.findAll();
    }

    public Organization findOrganizationById(String id) {
        Optional<Organization> organization = organizationRepository.findById(id);
        return organization.orElse(null);
    }

    public Organization addNewOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization updateOrganization(String id, Organization organization) {
        organizationRepository.findById(id).ifPresent(o -> organization.setId(o.getId()));
        return organizationRepository.save(organization);
    }

    public void deleteOrganization(String id) {
        organizationRepository.deleteById(id);
    }

}