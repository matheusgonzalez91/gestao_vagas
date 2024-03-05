package br.com.matheusdev.gestaovagas.modules.company.UseCases;

import br.com.matheusdev.gestaovagas.exceptions.CompanyNotFoundException;
import br.com.matheusdev.gestaovagas.modules.company.entities.JobEntity;
import br.com.matheusdev.gestaovagas.modules.company.repositories.CompanyRepository;
import br.com.matheusdev.gestaovagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public JobEntity execute(JobEntity jobEntity){
        companyRepository.findById(jobEntity.getCompanyId()).orElseThrow(() -> {
            throw new CompanyNotFoundException();
        });
        return this.jobRepository.save(jobEntity);
    }

}
