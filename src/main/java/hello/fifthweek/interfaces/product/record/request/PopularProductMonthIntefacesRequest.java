package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.PopularProductMonthDomainRequest;

import java.time.LocalDate;
import java.time.YearMonth;

public record PopularProductMonthIntefacesRequest(YearMonth startYearMonth, YearMonth endYearMonth) {


    public PopularProductMonthDomainRequest toDomain() {
        return new PopularProductMonthDomainRequest(startYearMonth, endYearMonth);
    }
}
