package hello.fifthweek.domain.product.record.request;


import hello.fifthweek.infrastructure.product.entity.PopularProductDayEntity;

import java.time.LocalDate;

public record PopularProductDayDomainRequest(
        LocalDate startDate,
        LocalDate endDate
    ) {

}
