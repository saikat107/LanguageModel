<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . addFile ( new MockMultipartFile ( STRING , STRING , STRING , STRING . byte[] ( STRING ) ) ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest , STRING ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setMethod ( STRING ) ; assertEquals ( HttpMethod . POST , org.springframework.web.multipart.support.ServerHttpRequest . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . addFile ( new MockMultipartFile ( STRING , STRING , STRING , STRING . byte[] ( STRING ) ) ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest , STRING ) ; java.net.URI java.net.URI = new java.net.URI ( STRING ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setServerName ( java.net.URI . java.lang.String ( ) ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setServerPort ( java.net.URI . int ( ) ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setRequestURI ( java.net.URI . java.lang.String ( ) ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setQueryString ( java.net.URI . java.lang.String ( ) ) ; assertEquals ( java.net.URI , org.springframework.web.multipart.support.ServerHttpRequest . getURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MultipartFile org.springframework.web.multipart.support.MultipartFile = new MockMultipartFile ( STRING , STRING , STRING , STRING . byte[] ( STRING ) ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . addFile ( org.springframework.web.multipart.support.MultipartFile ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest , STRING ) ; HttpHeaders org.springframework.web.multipart.support.HttpHeaders = org.springframework.web.multipart.support.ServerHttpRequest . getHeaders ( ) ; assertNotNull ( org.springframework.web.multipart.support.HttpHeaders ) ; assertEquals ( MediaType . APPLICATION_JSON , org.springframework.web.multipart.support.HttpHeaders . getContentType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; MultipartFile org.springframework.web.multipart.support.MultipartFile = new MockMultipartFile ( STRING , STRING , STRING , byte[] ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . addFile ( org.springframework.web.multipart.support.MultipartFile ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest , STRING ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.multipart.support.ServerHttpRequest . getBody ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; MultipartFile org.springframework.web.multipart.support.MultipartFile = new MockMultipartFile ( STRING , STRING , STRING , byte[] ) ; this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest . addFile ( org.springframework.web.multipart.support.MultipartFile ) ; HttpServletRequest org.springframework.web.multipart.support.HttpServletRequest = new HttpServletRequestWrapper ( this . org.springframework.web.multipart.support.MockMultipartHttpServletRequest ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( org.springframework.web.multipart.support.HttpServletRequest , STRING ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.multipart.support.ServerHttpRequest . getBody ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockMultipartHttpServletRequest org.springframework.web.multipart.support.MockMultipartHttpServletRequest = new MockMultipartHttpServletRequest ( ) { @ java.lang.Override public org.springframework.web.multipart.support.HttpHeaders org.springframework.web.multipart.support.HttpHeaders ( java.lang.String java.lang.String ) { HttpHeaders org.springframework.web.multipart.support.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.multipart.support.HttpHeaders . setContentType ( new MediaType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; return org.springframework.web.multipart.support.HttpHeaders ; } } ; byte [] byte[] = { ( byte ) NUMBER } ; org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setParameter ( STRING , new java.lang.String ( byte[] , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( org.springframework.web.multipart.support.MockMultipartHttpServletRequest , STRING ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.multipart.support.ServerHttpRequest . getBody ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.HttpHeaders org.springframework.web.multipart.support.HttpHeaders ( java.lang.String java.lang.String ) { HttpHeaders org.springframework.web.multipart.support.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.multipart.support.HttpHeaders . setContentType ( new MediaType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; return org.springframework.web.multipart.support.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockMultipartHttpServletRequest org.springframework.web.multipart.support.MockMultipartHttpServletRequest = new MockMultipartHttpServletRequest ( ) { @ java.lang.Override public org.springframework.web.multipart.support.HttpHeaders org.springframework.web.multipart.support.HttpHeaders ( java.lang.String java.lang.String ) { HttpHeaders org.springframework.web.multipart.support.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.multipart.support.HttpHeaders . setContentType ( MediaType . APPLICATION_OCTET_STREAM ) ; return org.springframework.web.multipart.support.HttpHeaders ; } } ; byte [] byte[] = { ( byte ) NUMBER } ; org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setParameter ( STRING , new java.lang.String ( byte[] , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; org.springframework.web.multipart.support.MockMultipartHttpServletRequest . setCharacterEncoding ( STRING ) ; ServerHttpRequest org.springframework.web.multipart.support.ServerHttpRequest = new RequestPartServletServerHttpRequest ( org.springframework.web.multipart.support.MockMultipartHttpServletRequest , STRING ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.multipart.support.ServerHttpRequest . getBody ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.HttpHeaders org.springframework.web.multipart.support.HttpHeaders ( java.lang.String java.lang.String ) { HttpHeaders org.springframework.web.multipart.support.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.multipart.support.HttpHeaders . setContentType ( MediaType . APPLICATION_OCTET_STREAM ) ; return org.springframework.web.multipart.support.HttpHeaders ; }  <METHOD_END>
