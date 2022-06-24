package br.com.wm.clines.api.promotionalcodes;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.PromotionalCode;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class PromotionalCodeFormMapper implements Mapper<PromotionalCodeForm, PromotionalCode> {

    @Override
    public PromotionalCode map(PromotionalCodeForm form) {
        return new PromotionalCode(
                form.getCode(),
                form.getStartDate(),
                form.getExpirationDate(),
                form.getDescription(),
                form.getDiscount()
        );
    }
}
