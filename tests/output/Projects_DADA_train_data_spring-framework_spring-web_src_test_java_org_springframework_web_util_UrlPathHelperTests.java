<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getPathWithinApplication ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getPathWithinApplication ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getPathWithinApplication ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getPathWithinServletMapping ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.UrlPathHelper . setAlwaysUseFullPath ( true ) ; org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.UrlPathHelper . setUrlDecode ( false ) ; java.lang.String java.lang.String = org.springframework.web.util.UrlPathHelper . getPathWithinServletMapping ( org.springframework.web.util.MockHttpServletRequest ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.UnsupportedEncodingException { org.springframework.web.util.UrlPathHelper . setRemoveSemicolonContent ( true ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.UnsupportedEncodingException { org.springframework.web.util.UrlPathHelper . setRemoveSemicolonContent ( false ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.util.UrlPathHelper . getRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.UrlPathHelper . setRemoveSemicolonContent ( false ) ; org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.UrlPathHelper . setRemoveSemicolonContent ( false ) ; org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { UrlPathHelper . websphereComplianceFlag = true ; try { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; } finally { UrlPathHelper . websphereComplianceFlag = false ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Ignore @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( null ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Ignore @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setPathInfo ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setAttribute ( WebUtils . FORWARD_REQUEST_URI_ATTRIBUTE , STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getOriginatingRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getOriginatingRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setRequestURI ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UrlPathHelper . getOriginatingRequestUri ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setQueryString ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( WebUtils . FORWARD_REQUEST_URI_ATTRIBUTE , STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( WebUtils . FORWARD_QUERY_STRING_ATTRIBUTE , STRING ) ; assertEquals ( STRING , this . org.springframework.web.util.UrlPathHelper . getOriginatingQueryString ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setQueryString ( STRING ) ; assertEquals ( STRING , this . org.springframework.web.util.UrlPathHelper . getOriginatingQueryString ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.util.MockHttpServletRequest . setQueryString ( STRING ) ; org.springframework.web.util.MockHttpServletRequest . setAttribute ( WebUtils . FORWARD_REQUEST_URI_ATTRIBUTE , STRING ) ; assertNull ( this . org.springframework.web.util.UrlPathHelper . getOriginatingQueryString ( org.springframework.web.util.MockHttpServletRequest ) ) ; }  <METHOD_END>
