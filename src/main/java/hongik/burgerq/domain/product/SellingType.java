package hongik.burgerq.domain.product;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SellingType {
	SELLING("판매중"),
	SOLD_OUT("품절"),
	DISCONTINUED("단종"),
	;
	
	private final String korName;
}
