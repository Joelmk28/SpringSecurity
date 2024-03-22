package tajiri.springscurity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tajiri.springscurity.model.Avis;
import tajiri.springscurity.repository.IAvisRepository;

@Service
@AllArgsConstructor
public class AvisService {
    private final IAvisRepository iAvisRepository;
    public void createAvis(Avis avis)
    {
        iAvisRepository.save(avis);
    }
}
