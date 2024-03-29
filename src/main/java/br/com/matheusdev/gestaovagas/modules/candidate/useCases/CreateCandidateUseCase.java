package br.com.matheusdev.gestaovagas.modules.candidate.useCases;

import br.com.matheusdev.gestaovagas.exceptions.UserFoundException;
import br.com.matheusdev.gestaovagas.modules.candidate.CandidateEntity;
import br.com.matheusdev.gestaovagas.modules.candidate.CandidateRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CandidateRespository candidateRespository;

    public CandidateEntity execute(CandidateEntity candidateEntity){
        this.candidateRespository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        var password = passwordEncoder.encode(candidateEntity.getPassword());
        candidateEntity.setPassword(password);

        return this.candidateRespository.save(candidateEntity);
    }

}
