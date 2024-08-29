package hongik.burgerq.swaggerdemo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface SampleApi {
	@Operation(summary = "샘플 API 입니다.")
	@ApiResponses({
			@ApiResponse(
					responseCode = "200", description = "샘플 요청 성공",
					content = @Content(
							mediaType = MediaType.APPLICATION_JSON_VALUE,
							schema = @Schema(implementation = SampleResponse.class)
					)
			),
			@ApiResponse(
					responseCode = "400", description = "yourName은 사람 이름이 되어야 한다.",
					content = @Content(
							mediaType = MediaType.APPLICATION_JSON_VALUE,
							schema = @Schema(implementation = SampleErrorResponse.class)
					)
			),
	})
	SampleResponse doSomething(
			@Parameter(description = "사용자 ID", example = "10", required = true) Long id,
			@RequestBody(description = "샘플 요청!!", required = true) SampleRequest sampleRequest
			//주의! swagger 패키지의 RequestBody 임!
	);
}
