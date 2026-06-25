package bfhl_api.controller;

import bfhl_api.dto.RequestDto;
import bfhl_api.dto.ResponseDto;
import bfhl_api.service.BfhlService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BfhlController {

    private final BfhlService bfhlService;

    public BfhlController(BfhlService bfhlService) {
        this.bfhlService = bfhlService;
    }

    @PostMapping("/bfhl")
    public ResponseEntity<ResponseDto> processData(
            @RequestBody RequestDto request) {

        return ResponseEntity.ok(
                bfhlService.process(request)
        );
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {

        return ResponseEntity.ok("UP");
    }
}