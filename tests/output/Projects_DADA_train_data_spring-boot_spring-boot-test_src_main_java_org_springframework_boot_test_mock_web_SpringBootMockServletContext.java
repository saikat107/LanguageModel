<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , new FileSystemResourceLoader ( ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , ResourceLoader org.springframework.boot.test.mock.web.ResourceLoader ) { super( java.lang.String , org.springframework.boot.test.mock.web.ResourceLoader ); this . org.springframework.boot.test.mock.web.ResourceLoader = org.springframework.boot.test.mock.web.ResourceLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { if ( ! java.lang.String . boolean ( STRING ) ) { java.lang.String = STRING + java.lang.String ; } java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; if ( boolean ( java.lang.String ) ) { return java.lang.String ; } for ( java.lang.String java.lang.String : java.lang.String[] ) { java.lang.String = java.lang.String + java.lang.String ; if ( boolean ( java.lang.String ) ) { return java.lang.String ; } } return super. getResourceLocation ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected final java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return super. getResourceLocation ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { try { Resource org.springframework.boot.test.mock.web.Resource = this . org.springframework.boot.test.mock.web.ResourceLoader . getResource ( java.lang.String ) ; return org.springframework.boot.test.mock.web.Resource . exists ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URL java.net.URL ( java.lang.String java.lang.String ) throws java.net.MalformedURLException { java.net.URL java.net.URL = super. getResource ( java.lang.String ) ; if ( java.net.URL == null && STRING . boolean ( java.lang.String ) ) { try { if ( this . java.io.File == null ) { synchronized ( this ) { java.io.File java.io.File = java.io.File . java.io.File ( STRING , STRING ) ; java.io.File . boolean ( ) ; java.io.File . boolean ( ) ; java.io.File . void ( ) ; this . java.io.File = java.io.File ; } } return this . java.io.File . java.net.URI ( ) . java.net.URL ( ) ; } catch ( java.io.IOException java.io.IOException ) { } } return java.net.URL ; }  <METHOD_END>
