package hongik.burgerq.common.apiDocs.swaggerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController implements SampleApi {
	
	@PostMapping("/sample/{id}")
	public SampleResponse doSomething(
			@PathVariable Long id,
			@RequestBody SampleRequest sampleRequest
	) {
		if (sampleRequest.getYourName().equals("태순")) {
			throw new IllegalArgumentException("태순이 어떻게 사람 이름?");
		}
		return new SampleResponse(id, sampleRequest.getYourName());
	}
}
