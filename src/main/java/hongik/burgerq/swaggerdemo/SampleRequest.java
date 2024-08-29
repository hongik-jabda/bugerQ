package hongik.burgerq.swaggerdemo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "샘플 요청")
public class SampleRequest {
	@Schema(example = "창근")
	private String yourName;
}
