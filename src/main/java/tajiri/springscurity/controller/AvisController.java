package tajiri.springscurity.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tajiri.springscurity.model.Avis;
import tajiri.springscurity.service.AvisService;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping( path = "avis")
@AllArgsConstructor
public class AvisController {
    private final AvisService  avisService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "create",consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Avis newAvis){
        avisService.createAvis(newAvis);
    }
}
