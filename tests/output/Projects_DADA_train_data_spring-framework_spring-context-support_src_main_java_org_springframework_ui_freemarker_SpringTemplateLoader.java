<METHOD_START> public void ( ResourceLoader org.springframework.ui.freemarker.ResourceLoader , java.lang.String java.lang.String ) { this . org.springframework.ui.freemarker.ResourceLoader = org.springframework.ui.freemarker.ResourceLoader ; if ( ! java.lang.String . boolean ( STRING ) ) { java.lang.String += STRING ; } this . java.lang.String = java.lang.String ; if ( org.springframework.ui.freemarker.Log . isInfoEnabled ( ) ) { org.springframework.ui.freemarker.Log . info ( STRING + this . org.springframework.ui.freemarker.ResourceLoader + STRING + this . java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws java.io.IOException { if ( org.springframework.ui.freemarker.Log . isDebugEnabled ( ) ) { org.springframework.ui.freemarker.Log . debug ( STRING + java.lang.String + STRING ) ; } Resource org.springframework.ui.freemarker.Resource = this . org.springframework.ui.freemarker.ResourceLoader . getResource ( this . java.lang.String + java.lang.String ) ; return ( org.springframework.ui.freemarker.Resource . exists ( ) ? org.springframework.ui.freemarker.Resource : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.Reader java.io.Reader ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws java.io.IOException { Resource org.springframework.ui.freemarker.Resource = ( Resource ) java.lang.Object ; try { return new java.io.InputStreamReader ( org.springframework.ui.freemarker.Resource . getInputStream ( ) , java.lang.String ) ; } catch ( java.io.IOException java.io.IOException ) { if ( org.springframework.ui.freemarker.Log . isDebugEnabled ( ) ) { org.springframework.ui.freemarker.Log . debug ( STRING + org.springframework.ui.freemarker.Resource ) ; } throw java.io.IOException ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( java.lang.Object java.lang.Object ) { Resource org.springframework.ui.freemarker.Resource = ( Resource ) java.lang.Object ; try { return org.springframework.ui.freemarker.Resource . lastModified ( ) ; } catch ( java.io.IOException java.io.IOException ) { if ( org.springframework.ui.freemarker.Log . isDebugEnabled ( ) ) { org.springframework.ui.freemarker.Log . debug ( STRING + org.springframework.ui.freemarker.Resource + STRING + java.io.IOException ) ; } return - NUMBER ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws java.io.IOException {	}  <METHOD_END>
