package hongik.burgerq.domain.recommendMenu;

import hongik.burgerq.domain.product.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RecommendMenu {

    private Long id;
    private Product selectedProduct;
    private List<Product> recommendProducts;
}
