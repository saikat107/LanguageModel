<METHOD_START> public void ( ) { for ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type : org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type[] ( ) ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . put ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type , new DateTimeFormatterFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . setIso ( boolean ? ISO . DATE : null ) ; this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . setIso ( boolean ? ISO . TIME : null ) ; this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . setIso ( boolean ? ISO . DATE_TIME : null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.time.format.FormatStyle java.time.format.FormatStyle ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . setDateStyle ( java.time.format.FormatStyle ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.time.format.FormatStyle java.time.format.FormatStyle ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . setTimeStyle ( java.time.format.FormatStyle ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.time.format.FormatStyle java.time.format.FormatStyle ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . setDateTimeStyle ( java.time.format.FormatStyle ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,java.time.format.DateTimeFormatter> . java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type , java.time.format.DateTimeFormatter ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,java.time.format.DateTimeFormatter> . java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type , java.time.format.DateTimeFormatter ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ) { this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,java.time.format.DateTimeFormatter> . java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type , java.time.format.DateTimeFormatter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( FormatterRegistry org.springframework.format.datetime.standard.FormatterRegistry ) { DateTimeConverters . registerConverters ( org.springframework.format.datetime.standard.FormatterRegistry ) ; java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) ; java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) ; java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type . org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.LocalDate .class , new TemporalAccessorPrinter ( java.time.format.DateTimeFormatter == java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ? java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter : java.time.format.DateTimeFormatter ) , new TemporalAccessorParser ( java.time.LocalDate .class , java.time.format.DateTimeFormatter ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.LocalTime .class , new TemporalAccessorPrinter ( java.time.format.DateTimeFormatter == java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ? java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter : java.time.format.DateTimeFormatter ) , new TemporalAccessorParser ( java.time.LocalTime .class , java.time.format.DateTimeFormatter ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.LocalDateTime .class , new TemporalAccessorPrinter ( java.time.format.DateTimeFormatter == java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ? java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter : java.time.format.DateTimeFormatter ) , new TemporalAccessorParser ( java.time.LocalDateTime .class , java.time.format.DateTimeFormatter ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.ZonedDateTime .class , new TemporalAccessorPrinter ( java.time.format.DateTimeFormatter ) , new TemporalAccessorParser ( java.time.ZonedDateTime .class , java.time.format.DateTimeFormatter ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.OffsetDateTime .class , new TemporalAccessorPrinter ( java.time.format.DateTimeFormatter ) , new TemporalAccessorParser ( java.time.OffsetDateTime .class , java.time.format.DateTimeFormatter ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.OffsetTime .class , new TemporalAccessorPrinter ( java.time.format.DateTimeFormatter ) , new TemporalAccessorParser ( java.time.OffsetTime .class , java.time.format.DateTimeFormatter ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.Instant .class , new InstantFormatter ( ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.Period .class , new PeriodFormatter ( ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.Duration .class , new DurationFormatter ( ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.YearMonth .class , new YearMonthFormatter ( ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldType ( java.time.MonthDay .class , new MonthDayFormatter ( ) ) ; org.springframework.format.datetime.standard.FormatterRegistry . addFormatterForFieldAnnotation ( new Jsr310DateTimeFormatAnnotationFormatterFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) { java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,java.time.format.DateTimeFormatter> . java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) ; if ( java.time.format.DateTimeFormatter != null ) { return java.time.format.DateTimeFormatter ; } java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) ; return this . java.util.Map<org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type,org.springframework.format.datetime.standard.DateTimeFormatterFactory> . get ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) . createDateTimeFormatter ( java.time.format.DateTimeFormatter ) ; }  <METHOD_END>
<METHOD_START> private java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) { switch ( org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type ) { case org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type : return java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ( java.time.format.FormatStyle . java.time.format.FormatStyle ) ; case org.springframework.format.datetime.standard.DateTimeFormatterRegistrar.Type : return java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ( java.time.format.FormatStyle . java.time.format.FormatStyle ) ; default: return java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ( java.time.format.FormatStyle . java.time.format.FormatStyle ) ; } }  <METHOD_END>
