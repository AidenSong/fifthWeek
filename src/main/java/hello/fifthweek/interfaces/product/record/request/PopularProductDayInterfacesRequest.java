package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.PopularProductDayDomainRequest;

import java.time.LocalDate;

public record PopularProductDayInterfacesRequest(
        LocalDate startDate,
        LocalDate endDate
    ) {


    public PopularProductDayDomainRequest toDomain() {
        return new PopularProductDayDomainRequest(startDate, endDate);
    }
}
