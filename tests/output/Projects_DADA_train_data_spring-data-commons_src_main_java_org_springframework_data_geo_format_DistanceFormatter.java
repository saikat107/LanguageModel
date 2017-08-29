<METHOD_START> @ java.lang.Override public final org.springframework.data.geo.format.Distance org.springframework.data.geo.format.Distance ( java.lang.String java.lang.String ) { return java.lang.String == null ? null : org.springframework.data.geo.format.Distance ( java.lang.String . java.lang.String ( ) . java.lang.String ( java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Distance org.springframework.data.geo.format.Distance , java.util.Locale java.util.Locale ) { return org.springframework.data.geo.format.Distance == null ? null : java.lang.String . java.lang.String ( STRING , org.springframework.data.geo.format.Distance . getValue ( ) , org.springframework.data.geo.format.Distance . getUnit ( ) . toLowerCase ( java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.geo.format.Distance org.springframework.data.geo.format.Distance ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) throws java.text.ParseException { return ! StringUtils . hasText ( java.lang.String ) ? null : org.springframework.data.geo.format.Distance ( java.lang.String . java.lang.String ( ) . java.lang.String ( java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.geo.format.Distance org.springframework.data.geo.format.Distance ( java.lang.String java.lang.String ) { for ( java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> < java.lang.String , Metric > java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> : java.util.Map<java.lang.String,org.springframework.data.geo.format.Metric> . entrySet ( ) ) { if ( java.lang.String . boolean ( java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> . getKey ( ) ) ) { return org.springframework.data.geo.format.Distance ( java.lang.String , java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> ) ; } } try { return new Distance ( java.lang.Double . double ( java.lang.String ) ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( java.lang.String , StringUtils . collectionToCommaDelimitedString ( java.util.Map<java.lang.String,org.springframework.data.geo.format.Metric> . keySet ( ) ) , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> private static org.springframework.data.geo.format.Distance org.springframework.data.geo.format.Distance ( java.lang.String java.lang.String , java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> < java.lang.String , Metric > java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> . getKey ( ) ) ) ; try { return new Distance ( java.lang.Double . double ( java.lang.String ) , java.util.Map.Entry<java.lang.String,org.springframework.data.geo.format.Metric> . getValue ( ) ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( java.lang.String , StringUtils . collectionToCommaDelimitedString ( java.util.Map<java.lang.String,org.springframework.data.geo.format.Metric> . keySet ( ) ) , java.lang.String ) ) ; } }  <METHOD_END>
