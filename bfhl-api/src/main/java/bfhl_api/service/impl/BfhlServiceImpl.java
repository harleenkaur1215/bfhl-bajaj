package bfhl_api.service.impl;

import bfhl_api.dto.RequestDto;
import bfhl_api.dto.ResponseDto;
import bfhl_api.service.BfhlService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDto process(RequestDto request) {

        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        long sum = 0;

        StringBuilder alphabetString = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                long num = Long.parseLong(item);

                sum += num;

                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());

                alphabetString.append(item);

            } else {

                specialCharacters.add(item);
            }
        }

        String concatString =
                generateAlternateCaps(
                        alphabetString.reverse().toString()
                );

        return ResponseDto.builder()
                .is_success(true)
                .user_id("harleen_kaur_15092005")
                .email("harleenkaurkamboj1215@gmail.com")
                .roll_number("2310992006")
                .odd_numbers(oddNumbers)
                .even_numbers(evenNumbers)
                .alphabets(alphabets)
                .special_characters(specialCharacters)
                .sum(String.valueOf(sum))
                .concat_string(concatString)
                .build();
    }

    private String generateAlternateCaps(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }
}