<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( ) . toString ( ) , is ( equalTo ( java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ( java.time.format.FormatStyle . java.time.format.FormatStyle ) . java.lang.String ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.format.datetime.standard.DateTimeFormatterFactory = new DateTimeFormatterFactory ( STRING ) ; java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( ) ; assertThat ( java.time.format.DateTimeFormatter . java.lang.String ( java.time.LocalDateTime ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( null ) ; assertThat ( java.time.format.DateTimeFormatter , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ( java.time.format.FormatStyle . java.time.format.FormatStyle ) ; java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter = org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( java.time.format.DateTimeFormatter ) ; assertThat ( java.time.format.DateTimeFormatter , is ( sameInstance ( java.time.format.DateTimeFormatter ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.format.datetime.standard.DateTimeFormatterFactory . setStylePattern ( STRING ) ; java.lang.String java.lang.String = java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( ) ) . format ( java.time.LocalDateTime ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; org.springframework.format.datetime.standard.DateTimeFormatterFactory . setIso ( ISO . DATE ) ; assertThat ( java.time.format.DateTimeFormatter ( org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( ) ) . format ( java.time.LocalDateTime ) , is ( STRING ) ) ; org.springframework.format.datetime.standard.DateTimeFormatterFactory . setPattern ( STRING ) ; assertThat ( org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( ) . format ( java.time.LocalDateTime ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.format.datetime.standard.DateTimeFormatterFactory . setPattern ( STRING ) ; org.springframework.format.datetime.standard.DateTimeFormatterFactory . setTimeZone ( java.util.TimeZone ) ; java.time.ZoneId java.time.ZoneId = java.util.TimeZone . java.time.ZoneId ( ) ; java.time.ZonedDateTime java.time.ZonedDateTime = java.time.ZonedDateTime . java.time.ZonedDateTime ( NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , java.time.ZoneId ) ; java.lang.String java.lang.String = ( java.util.TimeZone . boolean ( java.util.TimeZone ) ? STRING : STRING ) ; assertThat ( org.springframework.format.datetime.standard.DateTimeFormatterFactory . createDateTimeFormatter ( ) . format ( java.time.ZonedDateTime ) , is ( STRING + java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ( java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ) { return java.time.format.DateTimeFormatter . java.time.format.DateTimeFormatter ( java.util.Locale . java.util.Locale ) ; }  <METHOD_END>
