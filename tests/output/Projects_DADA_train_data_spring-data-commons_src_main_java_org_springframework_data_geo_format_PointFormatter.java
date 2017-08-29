<METHOD_START> @ java.lang.Override public org.springframework.data.geo.format.Point org.springframework.data.geo.format.Point ( java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = java.lang.String . java.lang.String[] ( STRING ) ; if ( java.lang.String[] . int != NUMBER ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( java.lang.String , java.lang.String ) ) ; } try { double double = java.lang.Double . double ( java.lang.String[] [ NUMBER ] ) ; double double = java.lang.Double . double ( java.lang.String[] [ NUMBER ] ) ; return new Point ( double , double ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( java.lang.String , java.lang.String ) , java.lang.NumberFormatException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Point org.springframework.data.geo.format.Point , java.util.Locale java.util.Locale ) { return org.springframework.data.geo.format.Point == null ? null : java.lang.String . java.lang.String ( STRING , org.springframework.data.geo.format.Point . getY ( ) , org.springframework.data.geo.format.Point . getX ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.geo.format.Point org.springframework.data.geo.format.Point ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) throws java.text.ParseException { return ! StringUtils . hasText ( java.lang.String ) ? null : org.springframework.data.geo.format.Point ( java.lang.String ) ; }  <METHOD_END>
