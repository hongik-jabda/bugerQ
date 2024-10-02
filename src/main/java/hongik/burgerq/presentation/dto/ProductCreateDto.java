package hongik.burgerq.presentation.dto;

import hongik.burgerq.domain.product.Product;
import hongik.burgerq.domain.product.ProductType;
import hongik.burgerq.domain.product.SellingType;
import lombok.*;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(force = true)
public class ProductCreateDto {
	
	public final String name;
	public final Boolean isFamous;
	public final Integer price;
	public final SellingType sellingType;
	public final ProductType productType;
	
	public Product toDomain() {
		return Product.builder()
				.name(name)
				.isFamous(isFamous)
				.price(price)
				.sellingType(sellingType)
				.productType(productType)
				.build();
	}
}
