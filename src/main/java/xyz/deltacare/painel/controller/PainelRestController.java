package xyz.deltacare.painel.controller;

import org.springframework.http.HttpStatus;
import xyz.deltacare.painel.domain.Painel;
import xyz.deltacare.painel.dto.PainelDto;
import xyz.deltacare.painel.service.PainelService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/painel")
public class PainelRestController {

    private final PainelService painelService;

    public PainelRestController(PainelService painelService) {
        this.painelService = painelService;
    }

    @GetMapping
    public List<Painel> obterTodos() { return this.painelService.obterTodos(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PainelDto criar(@RequestBody @Valid PainelDto painelDto) {
        return painelService.save(painelDto);
    }

}
