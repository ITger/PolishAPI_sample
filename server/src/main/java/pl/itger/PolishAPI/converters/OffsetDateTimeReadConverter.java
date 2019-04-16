package pl.itger.PolishAPI.converters;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class OffsetDateTimeReadConverter
        implements Converter<Date, OffsetDateTime> {

@Override
public OffsetDateTime convert(Date date) {
    return date.toInstant().atOffset(ZoneOffset.UTC);
}

}
