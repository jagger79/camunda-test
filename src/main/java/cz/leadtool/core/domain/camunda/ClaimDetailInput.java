package cz.leadtool.core.domain.camunda;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClaimDetailInput {
    String declarationId;
}
