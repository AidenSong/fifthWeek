package hello.fifthweek.domain.product.record.request;

import java.time.YearMonth;

public record PopularProductMonthDomainRequest(YearMonth startYearMonth, YearMonth endYearMonth) {
}
