<METHOD_START> @ java.lang.Override public void void ( ServletContext org.springframework.boot.test.mock.web.ServletContext ) { this . org.springframework.boot.test.mock.web.ServletContext = org.springframework.boot.test.mock.web.ServletContext ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING ) ; void ( STRING , STRING ) ; void ( STRING , STRING ) ; void ( STRING , STRING ) ; void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String )			throws java.net.MalformedURLException { java.net.URL java.net.URL = this . org.springframework.boot.test.mock.web.ServletContext . getResource ( java.lang.String ) ; assertThat ( java.net.URL ) . isNotNull ( ) ; assertThat ( java.net.URL . java.lang.String ( ) ) . contains ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SpringBootMockServletContext org.springframework.boot.test.mock.web.SpringBootMockServletContext = new SpringBootMockServletContext ( STRING ) { @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return getResourceBasePathLocation ( java.lang.String ) ; } ;		} ; java.net.URL java.net.URL = org.springframework.boot.test.mock.web.SpringBootMockServletContext . getResource ( STRING ) ; assertThat ( java.net.URL ) . isNotEqualTo ( nullValue ( ) ) ; java.io.File java.io.File = new java.io.File ( java.net.URLDecoder . java.lang.String ( java.net.URL . java.lang.String ( ) , STRING ) ) ; assertThat ( java.io.File ) . exists ( ) . isDirectory ( ) ; java.lang.String [] java.lang.String[] = java.io.File . java.lang.String[] ( new java.io.FilenameFilter ( ) { @ java.lang.Override public boolean boolean ( java.io.File java.io.File , java.lang.String java.lang.String ) { return ! ( STRING . boolean ( java.lang.String ) || STRING . boolean ( java.lang.String ) ) ; } } ) ; assertThat ( java.lang.String[] ) . isNotEqualTo ( nullValue ( ) ) ; assertThat ( java.lang.String[] . int ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return getResourceBasePathLocation ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File , java.lang.String java.lang.String ) { return ! ( STRING . boolean ( java.lang.String ) || STRING . boolean ( java.lang.String ) ) ; }  <METHOD_END>
