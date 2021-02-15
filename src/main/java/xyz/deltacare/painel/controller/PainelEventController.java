package xyz.deltacare.painel.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Controller;
import xyz.deltacare.painel.dto.NovoBeneficiarioDto;
import xyz.deltacare.painel.service.PainelService;

@Controller
public class PainelEventController {
    private final ObjectMapper objectMapper;
    private final PainelService painelService;
    private final Logger logger = LoggerFactory.getLogger(PainelEventController.class);

    public PainelEventController(ObjectMapper objectMapper, PainelService painelService) {
        this.objectMapper = objectMapper;
        this.painelService = painelService;
    }

    @KafkaListener(topics = "${app.topic}")
    public void save(final String message, final Acknowledgment acknowledgment) throws JsonProcessingException {
        logger.info("Lendo mensagem: " + message);
        NovoBeneficiarioDto novoBeneficiarioDto = objectMapper.readValue(message, NovoBeneficiarioDto.class);
        painelService.save(novoBeneficiarioDto);
        acknowledgment.acknowledge();
    }
}
