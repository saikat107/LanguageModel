<METHOD_START> public void ( DateTimeFormatter org.springframework.format.datetime.joda.DateTimeFormatter ) { this . org.springframework.format.datetime.joda.DateTimeFormatter = org.springframework.format.datetime.joda.DateTimeFormatter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ReadablePartial org.springframework.format.datetime.joda.ReadablePartial , java.util.Locale java.util.Locale ) { return JodaTimeContextHolder . getFormatter ( this . org.springframework.format.datetime.joda.DateTimeFormatter , java.util.Locale ) . print ( org.springframework.format.datetime.joda.ReadablePartial ) ; }  <METHOD_END>