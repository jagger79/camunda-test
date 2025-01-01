package cz.leadtool.core.domain.camunda;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubmitDeclarationInput {
    Map<String, Object> declaration;
}
