package hongik.burgerq.domain.material;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UnitType {
    GRAM("그램"),
    MILLILITER("밀리리터"),
    COUNT("개수");

    private String description;
}
