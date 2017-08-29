<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public static void void ( ConverterRegistry org.springframework.format.datetime.joda.ConverterRegistry ) { DateFormatterRegistrar . addDateConverters ( org.springframework.format.datetime.joda.ConverterRegistry ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToLocalDateConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToLocalTimeConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToLocalDateTimeConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToDateMidnightConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToMutableDateTimeConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToInstantConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToDateConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToCalendarConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateTimeToLongConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.DateToReadableInstantConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.CalendarToReadableInstantConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.LongToReadableInstantConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.LocalDateTimeToLocalDateConverter ( ) ) ; org.springframework.format.datetime.joda.ConverterRegistry . addConverter ( new org.springframework.format.datetime.joda.JodaTimeConverters.LocalDateTimeToLocalTimeConverter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.LocalDate org.springframework.format.datetime.joda.LocalDate ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toLocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.LocalTime org.springframework.format.datetime.joda.LocalTime ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toLocalTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.LocalDateTime org.springframework.format.datetime.joda.LocalDateTime ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toLocalDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org . org.joda . org.joda . org.joda.time.DateMidnight org.joda.time.DateMidnight ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toDateMidnight ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.MutableDateTime org.springframework.format.datetime.joda.MutableDateTime ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toMutableDateTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.Instant org.springframework.format.datetime.joda.Instant ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toInstant ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Calendar java.util.Calendar ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . toGregorianCalendar ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Long java.lang.Long ( DateTime org.springframework.format.datetime.joda.DateTime ) { return org.springframework.format.datetime.joda.DateTime . getMillis ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.ReadableInstant org.springframework.format.datetime.joda.ReadableInstant ( java.util.Date java.util.Date ) { return new DateTime ( java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.ReadableInstant org.springframework.format.datetime.joda.ReadableInstant ( java.util.Calendar java.util.Calendar ) { return new DateTime ( java.util.Calendar ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.ReadableInstant org.springframework.format.datetime.joda.ReadableInstant ( java.lang.Long java.lang.Long ) { return new DateTime ( java.lang.Long . long ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.LocalDate org.springframework.format.datetime.joda.LocalDate ( LocalDateTime org.springframework.format.datetime.joda.LocalDateTime ) { return org.springframework.format.datetime.joda.LocalDateTime . toLocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.format.datetime.joda.LocalTime org.springframework.format.datetime.joda.LocalTime ( LocalDateTime org.springframework.format.datetime.joda.LocalDateTime ) { return org.springframework.format.datetime.joda.LocalDateTime . toLocalTime ( ) ; }  <METHOD_END>
