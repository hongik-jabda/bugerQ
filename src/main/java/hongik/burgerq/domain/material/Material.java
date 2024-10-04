package hongik.burgerq.domain.material;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Material {
    private Long id;
    private String name;
    private int price;
    private UnitType unitType;
}
