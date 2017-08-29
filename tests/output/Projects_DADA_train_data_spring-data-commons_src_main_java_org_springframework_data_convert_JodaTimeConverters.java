<METHOD_START> public static java.util.Collection<org.springframework.data.convert.Converter<?,?>> < Converter < ? , ? > > java.util.Collection<org.springframework.data.convert.Converter<?,?>> ( ) { if ( ! boolean ) { return java.util.Collections . java.util.Set<org.springframework.data.convert.Converter<?,?>> ( ) ; } java.util.List<org.springframework.data.convert.Converter<?,?>> < Converter < ? , ? > > java.util.List<org.springframework.data.convert.Converter<?,?>> = new java.util.ArrayList<org.springframework.data.convert.Converter<?,?>> <> ( ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.LocalDateToDateConverter . org.springframework.data.convert.JodaTimeConverters.LocalDateToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToDateConverter . org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.DateTimeToDateConverter . org.springframework.data.convert.JodaTimeConverters.DateTimeToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.DateMidnightToDateConverter . org.springframework.data.convert.JodaTimeConverters.DateMidnightToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.DateToLocalDateConverter . org.springframework.data.convert.JodaTimeConverters.DateToLocalDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.DateToLocalDateTimeConverter . org.springframework.data.convert.JodaTimeConverters.DateToLocalDateTimeConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.DateToDateTimeConverter . org.springframework.data.convert.JodaTimeConverters.DateToDateTimeConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.DateToDateMidnightConverter . org.springframework.data.convert.JodaTimeConverters.DateToDateMidnightConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToJodaLocalDateTime . org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToJodaLocalDateTime ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToJodaDateTime . org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToJodaDateTime ) ; return java.util.List<org.springframework.data.convert.Converter<?,?>> ; }  <METHOD_END>
<METHOD_START> public java.util.Date java.util.Date ( LocalDate org.springframework.data.convert.LocalDate ) { return org.springframework.data.convert.LocalDate == null ? null : org.springframework.data.convert.LocalDate . toDate ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Date java.util.Date ( LocalDateTime org.springframework.data.convert.LocalDateTime ) { return org.springframework.data.convert.LocalDateTime == null ? null : org.springframework.data.convert.LocalDateTime . toDate ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Date java.util.Date ( DateTime org.springframework.data.convert.DateTime ) { return org.springframework.data.convert.DateTime == null ? null : org.springframework.data.convert.DateTime . toDate ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Date java.util.Date ( DateMidnight org.springframework.data.convert.DateMidnight ) { return org.springframework.data.convert.DateMidnight == null ? null : org.springframework.data.convert.DateMidnight . toDate ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.convert.LocalDate org.springframework.data.convert.LocalDate ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : new LocalDate ( java.util.Date . long ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.convert.LocalDateTime org.springframework.data.convert.LocalDateTime ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : new LocalDateTime ( java.util.Date . long ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.convert.DateTime org.springframework.data.convert.DateTime ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : new DateTime ( java.util.Date . long ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.convert.DateMidnight org.springframework.data.convert.DateMidnight ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : new DateMidnight ( java.util.Date . long ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.LocalDateTime org.springframework.data.convert.LocalDateTime ( java . time . java.time.LocalDateTime java.time.LocalDateTime ) { return java.time.LocalDateTime == null ? null : LocalDateTime . fromDateFields ( org . springframework . data . convert . Jsr310Converters . LocalDateTimeToDateConverter . INSTANCE . convert ( java.time.LocalDateTime ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.DateTime org.springframework.data.convert.DateTime ( java . time . java.time.LocalDateTime java.time.LocalDateTime ) { return java.time.LocalDateTime == null ? null : new DateTime ( org . springframework . data . convert . Jsr310Converters . LocalDateTimeToDateConverter . INSTANCE . convert ( java.time.LocalDateTime ) ) ; }  <METHOD_END>