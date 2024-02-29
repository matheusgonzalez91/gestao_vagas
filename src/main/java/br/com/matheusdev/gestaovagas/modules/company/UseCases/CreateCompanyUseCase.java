package br.com.matheusdev.gestaovagas.modules.company.UseCases;

import br.com.matheusdev.gestaovagas.exceptions.UserFoundException;
import br.com.matheusdev.gestaovagas.modules.company.entities.CompanyEntity;
import br.com.matheusdev.gestaovagas.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity){
        this.companyRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) ->{
                    throw new UserFoundException();
                });
        return this.companyRepository.save(companyEntity);
    }

}
