package hongik.burgerq.domain.product;

import hongik.burgerq.presentation.dto.ProductCreateDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
	
	private Long id;
	private String name;
	private Boolean isFamous;
	private Integer price;
	private SellingType sellingType;
	private ProductType productType;
	
	public Product from(ProductCreateDto dto) {
		return Product.builder()
				.name(dto.name)
				.isFamous(dto.isFamous)
				.price(dto.price)
				.sellingType(dto.sellingType)
				.productType(dto.productType)
				.build();
	}
}
