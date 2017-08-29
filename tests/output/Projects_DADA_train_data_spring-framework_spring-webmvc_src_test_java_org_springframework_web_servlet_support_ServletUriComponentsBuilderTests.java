<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setScheme ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setServerName ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setServerPort ( - NUMBER ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setContextPath ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setQueryString ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromRequest ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromRequest ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setServerPort ( NUMBER ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromRequest ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setScheme ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setServerPort ( NUMBER ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromRequest ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MockHttpServletRequest org.springframework.web.servlet.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.servlet.support.MockHttpServletRequest . setScheme ( STRING ) ; org.springframework.web.servlet.support.MockHttpServletRequest . setServerName ( STRING ) ; org.springframework.web.servlet.support.MockHttpServletRequest . setServerPort ( NUMBER ) ; org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; HttpRequest org.springframework.web.servlet.support.HttpRequest = new ServletServerHttpRequest ( org.springframework.web.servlet.support.MockHttpServletRequest ) ; UriComponents org.springframework.web.servlet.support.UriComponents = UriComponentsBuilder . fromHttpRequest ( org.springframework.web.servlet.support.HttpRequest ) . build ( ) ; assertEquals ( STRING , org.springframework.web.servlet.support.UriComponents . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setQueryString ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromRequestUri ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; UriComponents org.springframework.web.servlet.support.UriComponents = ServletUriComponentsBuilder . fromRequest ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) ; assertEquals ( STRING , org.springframework.web.servlet.support.UriComponents . toUriString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; UriComponents org.springframework.web.servlet.support.UriComponents = ServletUriComponentsBuilder . fromRequest ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) ; assertEquals ( STRING , org.springframework.web.servlet.support.UriComponents . toUriString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setQueryString ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromContextPath ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromContextPath ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setServletPath ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setQueryString ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromServletMapping ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . addHeader ( STRING , STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setServletPath ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; java.lang.String java.lang.String = ServletUriComponentsBuilder . fromServletMapping ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.servlet.support.MockHttpServletRequest . setQueryString ( STRING ) ; RequestContextHolder . setRequestAttributes ( new ServletRequestAttributes ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) ) ; try { java.lang.String java.lang.String = ServletUriComponentsBuilder . fromCurrentRequest ( ) . build ( ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; } finally { RequestContextHolder . resetRequestAttributes ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; ServletUriComponentsBuilder org.springframework.web.servlet.support.ServletUriComponentsBuilder = ServletUriComponentsBuilder . fromRequestUri ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) ; java.lang.String java.lang.String = org.springframework.web.servlet.support.ServletUriComponentsBuilder . removePathExtension ( ) ; java.lang.String java.lang.String = org.springframework.web.servlet.support.ServletUriComponentsBuilder . path ( STRING ) . buildAndExpand ( java.lang.String ) . toUriString ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.support.MockHttpServletRequest . setRequestURI ( STRING ) ; ServletUriComponentsBuilder org.springframework.web.servlet.support.ServletUriComponentsBuilder = ServletUriComponentsBuilder . fromRequestUri ( this . org.springframework.web.servlet.support.MockHttpServletRequest ) ; assertNull ( org.springframework.web.servlet.support.ServletUriComponentsBuilder . removePathExtension ( ) ) ; }  <METHOD_END>