<METHOD_START> @ java.lang.Override public javax.management.ObjectName javax.management.ObjectName ( java.lang.Object java.lang.Object , java.lang.String java.lang.String )			throws javax.management.MalformedObjectNameException { javax.management.ObjectName javax.management.ObjectName = this . org.springframework.boot.actuate.metrics.jmx.ObjectNamingStrategy . getObjectName ( java.lang.Object , java.lang.String ) ; java.lang.String java.lang.String = javax.management.ObjectName . java.lang.String ( ) ; java.util.Hashtable<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Hashtable<java.lang.String,java.lang.String> = new java.util.Hashtable<java.lang.String,java.lang.String> <> ( javax.management.ObjectName . java.util.Hashtable<java.lang.String,java.lang.String> ( ) ) ; java.lang.String java.lang.String = javax.management.ObjectName . java.lang.String ( STRING ) ; if ( java.lang.String != null ) { java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ; java.lang.String [] java.lang.String[] = StringUtils . delimitedListToStringArray ( java.lang.String , STRING ) ; java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String[] [ NUMBER ] ) ; if ( java.lang.String[] . int > NUMBER ) { java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String[] . int > NUMBER ? STRING : STRING , java.lang.String[] [ NUMBER ] ) ; } if ( java.lang.String[] . int > NUMBER ) { java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String . java.lang.String ( java.lang.String[] [ NUMBER ] . int ( ) + java.lang.String[] [ NUMBER ] . int ( ) + NUMBER ) ) ; } } return new javax.management.ObjectName ( java.lang.String , java.util.Hashtable<java.lang.String,java.lang.String> ) ; }  <METHOD_END>