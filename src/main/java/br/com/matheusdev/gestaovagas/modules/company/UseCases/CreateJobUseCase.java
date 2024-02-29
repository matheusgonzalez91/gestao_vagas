package br.com.matheusdev.gestaovagas.modules.company.UseCases;

import br.com.matheusdev.gestaovagas.modules.company.entities.JobEntity;
import br.com.matheusdev.gestaovagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }

}
