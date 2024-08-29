package hongik.burgerq.swaggerdemo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "샘플 에러 응답")
public class SampleErrorResponse {
	@Schema(example = "문제발생~~ 문제발생~~~")
	private final String str;
	
	public SampleErrorResponse(String errorMessage) {
		this.str = errorMessage;
	}
}
