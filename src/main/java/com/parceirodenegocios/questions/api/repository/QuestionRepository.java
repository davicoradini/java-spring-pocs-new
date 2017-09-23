package com.parceirodenegocios.questions.api.repository;

import com.parceirodenegocios.questions.api.domain.Question;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QuestionRepository extends PagingAndSortingRepository<Question, Long> {
}
