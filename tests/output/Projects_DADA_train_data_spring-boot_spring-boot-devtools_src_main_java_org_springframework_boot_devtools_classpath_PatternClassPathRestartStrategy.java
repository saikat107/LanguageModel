<METHOD_START> public void ( java.lang.String [] java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this( StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ChangedFile org.springframework.boot.devtools.classpath.ChangedFile ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { if ( this . org.springframework.boot.devtools.classpath.AntPathMatcher . match ( java.lang.String , org.springframework.boot.devtools.classpath.ChangedFile . getRelativeName ( ) ) ) { return false ; } } return true ; }  <METHOD_END>