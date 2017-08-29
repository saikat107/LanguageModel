<METHOD_START> public static void void ( ConverterRegistry org.springframework.format.datetime.standard.ConverterRegistry ) { DateFormatterRegistrar . addDateConverters ( org.springframework.format.datetime.standard.ConverterRegistry ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.LocalDateTimeToLocalDateConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.LocalDateTimeToLocalTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.ZonedDateTimeToLocalDateConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.ZonedDateTimeToLocalTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.ZonedDateTimeToLocalDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.ZonedDateTimeToOffsetDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.ZonedDateTimeToInstantConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.OffsetDateTimeToLocalDateConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.OffsetDateTimeToLocalTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.OffsetDateTimeToLocalDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.OffsetDateTimeToZonedDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.OffsetDateTimeToInstantConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.CalendarToZonedDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.CalendarToOffsetDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.CalendarToLocalDateConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.CalendarToLocalTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.CalendarToLocalDateTimeConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.CalendarToInstantConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.LongToInstantConverter ( ) ) ; org.springframework.format.datetime.standard.ConverterRegistry . addConverter ( new org.springframework.format.datetime.standard.DateTimeConverters.InstantToLongConverter ( ) ) ; }  <METHOD_END>
<METHOD_START> private static java.time.ZonedDateTime java.time.ZonedDateTime ( java.util.Calendar java.util.Calendar ) { if ( java.util.Calendar instanceof java.util.GregorianCalendar ) { return ( ( java.util.GregorianCalendar ) java.util.Calendar ) . java.time.ZonedDateTime ( ) ; } else { return java.time.ZonedDateTime . java.time.ZonedDateTime ( java.time.Instant . java.time.Instant ( java.util.Calendar . long ( ) ) , java.util.Calendar . java.util.TimeZone ( ) . java.time.ZoneId ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDate java.time.LocalDate ( java.time.LocalDateTime java.time.LocalDateTime ) { return java.time.LocalDateTime . java.time.LocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalTime java.time.LocalTime ( java.time.LocalDateTime java.time.LocalDateTime ) { return java.time.LocalDateTime . java.time.LocalTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDate java.time.LocalDate ( java.time.ZonedDateTime java.time.ZonedDateTime ) { return java.time.ZonedDateTime . java.time.LocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalTime java.time.LocalTime ( java.time.ZonedDateTime java.time.ZonedDateTime ) { return java.time.ZonedDateTime . java.time.LocalTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDateTime java.time.LocalDateTime ( java.time.ZonedDateTime java.time.ZonedDateTime ) { return java.time.ZonedDateTime . java.time.LocalDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.OffsetDateTime java.time.OffsetDateTime ( java.time.ZonedDateTime java.time.ZonedDateTime ) { return java.time.ZonedDateTime . java.time.OffsetDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.Instant java.time.Instant ( java.time.ZonedDateTime java.time.ZonedDateTime ) { return java.time.ZonedDateTime . java.time.Instant ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDate java.time.LocalDate ( java.time.OffsetDateTime java.time.OffsetDateTime ) { return java.time.OffsetDateTime . java.time.LocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalTime java.time.LocalTime ( java.time.OffsetDateTime java.time.OffsetDateTime ) { return java.time.OffsetDateTime . java.time.LocalTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDateTime java.time.LocalDateTime ( java.time.OffsetDateTime java.time.OffsetDateTime ) { return java.time.OffsetDateTime . java.time.LocalDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.ZonedDateTime java.time.ZonedDateTime ( java.time.OffsetDateTime java.time.OffsetDateTime ) { return java.time.OffsetDateTime . java.time.ZonedDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.Instant java.time.Instant ( java.time.OffsetDateTime java.time.OffsetDateTime ) { return java.time.OffsetDateTime . java.time.Instant ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.ZonedDateTime java.time.ZonedDateTime ( java.util.Calendar java.util.Calendar ) { return java.time.ZonedDateTime ( java.util.Calendar ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.OffsetDateTime java.time.OffsetDateTime ( java.util.Calendar java.util.Calendar ) { return java.time.ZonedDateTime ( java.util.Calendar ) . java.time.OffsetDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDate java.time.LocalDate ( java.util.Calendar java.util.Calendar ) { return java.time.ZonedDateTime ( java.util.Calendar ) . java.time.LocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalTime java.time.LocalTime ( java.util.Calendar java.util.Calendar ) { return java.time.ZonedDateTime ( java.util.Calendar ) . java.time.LocalTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.LocalDateTime java.time.LocalDateTime ( java.util.Calendar java.util.Calendar ) { return java.time.ZonedDateTime ( java.util.Calendar ) . java.time.LocalDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.Instant java.time.Instant ( java.util.Calendar java.util.Calendar ) { return java.time.ZonedDateTime ( java.util.Calendar ) . java.time.Instant ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.Instant java.time.Instant ( java.lang.Long java.lang.Long ) { return java.time.Instant . java.time.Instant ( java.lang.Long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Long java.lang.Long ( java.time.Instant java.time.Instant ) { return java.time.Instant . long ( ) ; }  <METHOD_END>
