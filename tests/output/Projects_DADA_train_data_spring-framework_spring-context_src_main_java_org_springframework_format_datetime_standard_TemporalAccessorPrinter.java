<METHOD_START> public void ( java.time.format.DateTimeFormatter java.time.format.DateTimeFormatter ) { this . java.time.format.DateTimeFormatter = java.time.format.DateTimeFormatter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor , java.util.Locale java.util.Locale ) { return DateTimeContextHolder . getFormatter ( this . java.time.format.DateTimeFormatter , java.util.Locale ) . format ( java.time.temporal.TemporalAccessor ) ; }  <METHOD_END>