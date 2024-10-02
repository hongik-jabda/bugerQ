package hongik.burgerq.domain.product;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ProductType {
	MAIN("메인 메뉴"),
	SIDE("사이드 메뉴"),
	BEVERAGE("음료 메뉴")
	;
	
	private final String korName;
}
