package br.com.wm.clines.api.promotionalcodes;

import org.springframework.data.repository.Repository;

import br.com.wm.clines.shared.domain.PromotionalCode;

import java.util.Optional;

public interface PromotionalCodeRepository extends Repository<PromotionalCode, Long> {
    PromotionalCode save(PromotionalCode promotionalCode);

    Optional<PromotionalCode> findByCode(String code);
}
