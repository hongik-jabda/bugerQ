package hongik.burgerq.common.apiDocs.swaggerdemo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "샘플 응답")
public class SampleResponse {
	@Schema(example = "Hello 창근 with id 10")
	private final String str;
	
	public SampleResponse(Long id, String yourName) {
		this.str = "Hello " + yourName + " with id " + id;
	}
}
