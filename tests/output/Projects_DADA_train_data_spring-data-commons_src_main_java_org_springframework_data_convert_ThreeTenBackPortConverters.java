<METHOD_START> public static java.util.Collection<org.springframework.data.convert.Converter<?,?>> < Converter < ? , ? > > java.util.Collection<org.springframework.data.convert.Converter<?,?>> ( ) { if ( ! boolean ) { return java.util.Collections . java.util.Set<org.springframework.data.convert.Converter<?,?>> ( ) ; } java.util.List<org.springframework.data.convert.Converter<?,?>> < Converter < ? , ? > > java.util.List<org.springframework.data.convert.Converter<?,?>> = new java.util.ArrayList<org.springframework.data.convert.Converter<?,?>> <> ( ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.DateToLocalDateTimeConverter . org.springframework.data.convert.ThreeTenBackPortConverters.DateToLocalDateTimeConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.LocalDateTimeToDateConverter . org.springframework.data.convert.ThreeTenBackPortConverters.LocalDateTimeToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.DateToLocalDateConverter . org.springframework.data.convert.ThreeTenBackPortConverters.DateToLocalDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.LocalDateToDateConverter . org.springframework.data.convert.ThreeTenBackPortConverters.LocalDateToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.DateToLocalTimeConverter . org.springframework.data.convert.ThreeTenBackPortConverters.DateToLocalTimeConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.LocalTimeToDateConverter . org.springframework.data.convert.ThreeTenBackPortConverters.LocalTimeToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.DateToInstantConverter . org.springframework.data.convert.ThreeTenBackPortConverters.DateToInstantConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.InstantToDateConverter . org.springframework.data.convert.ThreeTenBackPortConverters.InstantToDateConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.ZoneIdToStringConverter . org.springframework.data.convert.ThreeTenBackPortConverters.ZoneIdToStringConverter ) ; java.util.List<org.springframework.data.convert.Converter<?,?>> . add ( org.springframework.data.convert.ThreeTenBackPortConverters.StringToZoneIdConverter . org.springframework.data.convert.ThreeTenBackPortConverters.StringToZoneIdConverter ) ; return java.util.List<org.springframework.data.convert.Converter<?,?>> ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( ! boolean ) { return false ; } return java.util.Arrays .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( LocalDateTime .class , LocalDate .class , LocalTime .class , Instant .class ) . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.LocalDateTime org.springframework.data.convert.LocalDateTime ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : ofInstant ( toInstant ( java.util.Date ) , systemDefault ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( LocalDateTime org.springframework.data.convert.LocalDateTime ) { return org.springframework.data.convert.LocalDateTime == null ? null : toDate ( org.springframework.data.convert.LocalDateTime . atZone ( systemDefault ( ) ) . toInstant ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.LocalDate org.springframework.data.convert.LocalDate ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : ofInstant ( ofEpochMilli ( java.util.Date . long ( ) ) , systemDefault ( ) ) . toLocalDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( LocalDate org.springframework.data.convert.LocalDate ) { return org.springframework.data.convert.LocalDate == null ? null : toDate ( org.springframework.data.convert.LocalDate . atStartOfDay ( systemDefault ( ) ) . toInstant ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.LocalTime org.springframework.data.convert.LocalTime ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : ofInstant ( ofEpochMilli ( java.util.Date . long ( ) ) , systemDefault ( ) ) . toLocalTime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( LocalTime org.springframework.data.convert.LocalTime ) { return org.springframework.data.convert.LocalTime == null ? null : toDate ( org.springframework.data.convert.LocalTime . atDate ( LocalDate . now ( ) ) . atZone ( systemDefault ( ) ) . toInstant ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.Instant org.springframework.data.convert.Instant ( java.util.Date java.util.Date ) { return java.util.Date == null ? null : toInstant ( java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( Instant org.springframework.data.convert.Instant ) { return org.springframework.data.convert.Instant == null ? null : toDate ( org.springframework.data.convert.Instant . atZone ( systemDefault ( ) ) . toInstant ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ZoneId org.springframework.data.convert.ZoneId ) { return org.springframework.data.convert.ZoneId . toString ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.convert.ZoneId org.springframework.data.convert.ZoneId ( java.lang.String java.lang.String ) { return ZoneId . of ( java.lang.String ) ; }  <METHOD_END>
