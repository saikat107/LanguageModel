<METHOD_START> public void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader ) { super( java.lang.ClassLoader ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String , boolean boolean )			throws java.lang.ClassNotFoundException { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( java.lang.String ) ; java.lang.Class<?> = ( java.lang.Class<> == null ? java.lang.Class<?> ( java.lang.String ) : java.lang.Class<> ) ; if ( java.lang.Class<> == null ) { throw new java.lang.ClassNotFoundException ( java.lang.String ) ; } return java.lang.Class<?> ( java.lang.Class<> , boolean ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) { java.lang.Class<?> < ? > java.lang.Class<?> = findLoadedClass0 ( java.lang.String ) ; java.lang.Class<?> = ( java.lang.Class<> == null ? findLoadedClass ( java.lang.String ) : java.lang.Class<> ) ; return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) throws java.lang.ClassNotFoundException { void ( java.lang.String ) ; if ( ( this . delegate || filter ( java.lang.String , true ) ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( java.lang.String ) ; return ( java.lang.Class<> == null ? java.lang.Class<?> ( java.lang.String ) : java.lang.Class<> ) ; } java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( java.lang.String ) ; return ( java.lang.Class<> == null ? java.lang.Class<?> ( java.lang.String ) : java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , boolean boolean ) { if ( boolean ) { resolveClass ( java.lang.Class<> ) ; } return ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.net.URL java.net.URL ) { if ( org.springframework.boot.web.embedded.tomcat.Log . isTraceEnabled ( ) ) { org.springframework.boot.web.embedded.tomcat.Log . trace ( STRING + java.net.URL + STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) { if ( this . parent == null ) { return null ; } try { return java.lang.Class . java.lang.Class<?> ( java.lang.String , false , this . parent ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { return null ; } }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) { try { return findClass ( java.lang.String ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { return null ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) throws java.lang.ClassNotFoundException { if ( this . securityManager != null && java.lang.String . int ( '.' ) >= NUMBER ) { try { this . securityManager . checkPackageAccess ( java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( '.' ) ) ) ; } catch ( java.lang.SecurityException java.lang.SecurityException ) { throw new java.lang.ClassNotFoundException ( STRING + STRING + java.lang.String , java.lang.SecurityException ) ; } } }  <METHOD_END>
