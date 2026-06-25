package bfhl_api.dto;

import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private boolean is_success;

    private String user_id;
    private String email;
    private String roll_number;

    private List<String> odd_numbers;
    private List<String> even_numbers;
    private List<String> alphabets;
    private List<String> special_characters;

    private String sum;
    private String concat_string;
}