<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.convert.ConversionService . convert ( java.util.Date , LocalDateTime .class ) . toString ( ) ) . isEqualTo ( java.lang.String ( java.util.Date , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LocalDateTime org.springframework.data.convert.LocalDateTime = LocalDateTime . now ( ) ; assertThat ( java.lang.String ( org.springframework.data.convert.ConversionService . convert ( org.springframework.data.convert.LocalDateTime , java.util.Date .class ) , STRING ) ) . isEqualTo ( org.springframework.data.convert.LocalDateTime . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.convert.ConversionService . convert ( java.util.Date , LocalDate .class ) . toString ( ) ) . isEqualTo ( java.lang.String ( java.util.Date , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LocalDate org.springframework.data.convert.LocalDate = LocalDate . now ( ) ; assertThat ( java.lang.String ( org.springframework.data.convert.ConversionService . convert ( org.springframework.data.convert.LocalDate , java.util.Date .class ) , STRING ) ) . isEqualTo ( org.springframework.data.convert.LocalDate . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.convert.ConversionService . convert ( java.util.Date , LocalTime .class ) . toString ( ) ) . isEqualTo ( java.lang.String ( java.util.Date , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LocalTime org.springframework.data.convert.LocalTime = LocalTime . now ( ) ; assertThat ( java.lang.String ( org.springframework.data.convert.ConversionService . convert ( org.springframework.data.convert.LocalTime , java.util.Date .class ) , STRING ) ) . isEqualTo ( org.springframework.data.convert.LocalTime . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Date java.util.Date = new java.util.Date ( ) ; assertThat ( org.springframework.data.convert.ConversionService . convert ( java.util.Date , Instant .class ) ) . isEqualTo ( toInstant ( java.util.Date ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Date java.util.Date = new java.util.Date ( ) ; assertThat ( org.springframework.data.convert.ConversionService . convert ( toInstant ( java.util.Date ) , java.util.Date .class ) ) . isEqualTo ( java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.data.convert.ZoneId> < java.lang.String , ZoneId > java.util.Map<java.lang.String,org.springframework.data.convert.ZoneId> = new java.util.HashMap<java.lang.String,org.springframework.data.convert.ZoneId> <> ( ) ; java.util.Map<java.lang.String,org.springframework.data.convert.ZoneId> . put ( STRING , ZoneId . of ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.data.convert.ZoneId> . put ( STRING , ZoneId . of ( STRING ) ) ; for ( java.util.Map.Entry<java.lang.String,org.springframework.data.convert.ZoneId> < java.lang.String , ZoneId > java.util.Map.Entry<java.lang.String,org.springframework.data.convert.ZoneId> : java.util.Map<java.lang.String,org.springframework.data.convert.ZoneId> . entrySet ( ) ) { assertThat ( org.springframework.data.convert.ConversionService . convert ( java.util.Map.Entry<java.lang.String,org.springframework.data.convert.ZoneId> . getValue ( ) , java.lang.String .class ) ) . isEqualTo ( java.util.Map.Entry<java.lang.String,org.springframework.data.convert.ZoneId> . getKey ( ) ) ; assertThat ( org.springframework.data.convert.ConversionService . convert ( java.util.Map.Entry<java.lang.String,org.springframework.data.convert.ZoneId> . getKey ( ) , ZoneId .class ) ) . isEqualTo ( java.util.Map.Entry<java.lang.String,org.springframework.data.convert.ZoneId> . getValue ( ) ) ; } }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( java.util.Date java.util.Date , java.lang.String java.lang.String ) { return new java.text.SimpleDateFormat ( java.lang.String ) . java.lang.String ( java.util.Date ) ; }  <METHOD_END>
