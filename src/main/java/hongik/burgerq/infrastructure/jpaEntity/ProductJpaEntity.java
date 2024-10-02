package hongik.burgerq.infrastructure.jpaEntity;

import hongik.burgerq.domain.product.Product;
import hongik.burgerq.domain.product.ProductType;
import hongik.burgerq.domain.product.SellingType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductJpaEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Boolean isFamous;
	
	private Integer price;
	
	private SellingType sellingType;
	
	private ProductType productType;
	
	//TODO : 들어간 재료 매핑 추가 필요
	
	public Product toDomain() {
		return Product.builder()
				.id(id)
				.name(name)
				.isFamous(isFamous)
				.price(price)
				.sellingType(sellingType)
				.productType(productType)
				.build();
	}
	
	public static ProductJpaEntity from(Product product) {
		return ProductJpaEntity.builder()
				.id(product.getId())
				.name(product.getName())
				.isFamous(product.getIsFamous())
				.price(product.getPrice())
				.sellingType(product.getSellingType())
				.productType(product.getProductType())
				.build();
	}
}
