package br.com.matheusdev.gestaovagas.modules.candidate.useCases;

import br.com.matheusdev.gestaovagas.exceptions.JobNotFoundException;
import br.com.matheusdev.gestaovagas.exceptions.UserNotFoundException;
import br.com.matheusdev.gestaovagas.modules.candidate.CandidateRespository;
import br.com.matheusdev.gestaovagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRespository candidateRespository;

    @Autowired
    private JobRepository jobRepository;

    public void execute(UUID idCandidate, UUID idJob){
        // Validar se o candidato existe
        this.candidateRespository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        // Validar se a vaga existe
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });
    }

}