package com.parceirodenegocios.questions.api.repository;

import com.parceirodenegocios.questions.api.domain.Institution;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface InstitutionRepository extends PagingAndSortingRepository<Institution, Long> {

    @Override
    @RestResource(exported = false)
    void delete(Long id);

    @Override
    @RestResource(exported = false)
    void delete(Institution entity);

}
