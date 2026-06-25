package bfhl_api.service;

import bfhl_api.dto.RequestDto;
import bfhl_api.dto.ResponseDto;

public interface BfhlService {
    ResponseDto process(RequestDto request);
}