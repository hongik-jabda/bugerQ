package hongik.burgerq.presentation.dto;

import hongik.burgerq.domain.product.Product;
import hongik.burgerq.domain.product.ProductType;
import hongik.burgerq.domain.product.SellingType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductResponse {
	
	private final Long id;
	private final String name;
	private final Boolean isFamous;
	private final Integer price;
	private final SellingType sellingType;
	private final ProductType productType;
	
	public ProductResponse from(Product product) {
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.isFamous(product.getIsFamous())
				.price(product.getPrice())
				.sellingType(product.getSellingType())
				.productType(product.getProductType())
				.build();
	}
}
