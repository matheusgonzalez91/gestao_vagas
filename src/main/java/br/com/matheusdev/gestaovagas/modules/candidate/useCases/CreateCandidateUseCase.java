package br.com.matheusdev.gestaovagas.modules.candidate.useCases;

import br.com.matheusdev.gestaovagas.exceptions.UserFoundException;
import br.com.matheusdev.gestaovagas.modules.candidate.CandidateEntity;
import br.com.matheusdev.gestaovagas.modules.candidate.controllers.CandidateRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidateRespository candidateRespository;

    public CandidateEntity execute(CandidateEntity candidateEntity){
        this.candidateRespository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidateRespository.save(candidateEntity);
    }

}
