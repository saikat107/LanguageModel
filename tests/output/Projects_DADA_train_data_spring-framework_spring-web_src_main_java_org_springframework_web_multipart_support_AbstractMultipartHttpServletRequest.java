<METHOD_START> protected void ( HttpServletRequest org.springframework.web.multipart.support.HttpServletRequest ) { super( org.springframework.web.multipart.support.HttpServletRequest ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.HttpServletRequest org.springframework.web.multipart.support.HttpServletRequest ( ) { return ( HttpServletRequest ) super. getRequest ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.HttpMethod org.springframework.web.multipart.support.HttpMethod ( ) { return HttpMethod . resolve ( org.springframework.web.multipart.support.HttpServletRequest ( ) . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.HttpHeaders org.springframework.web.multipart.support.HttpHeaders ( ) { HttpHeaders org.springframework.web.multipart.support.HttpHeaders = new HttpHeaders ( ) ; java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> = getHeaderNames ( ) ; while ( java.util.Enumeration<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = java.util.Enumeration<java.lang.String> . java.lang.String ( ) ; org.springframework.web.multipart.support.HttpHeaders . put ( java.lang.String , java.util.Collections . java.util.ArrayList ( getHeaders ( java.lang.String ) ) ) ; } return org.springframework.web.multipart.support.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> ( ) { return org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) . keySet ( ) . iterator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.MultipartFile org.springframework.web.multipart.support.MultipartFile ( java.lang.String java.lang.String ) { return org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) . getFirst ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.multipart.support.MultipartFile> < MultipartFile > java.util.List<org.springframework.web.multipart.support.MultipartFile> ( java.lang.String java.lang.String ) { java.util.List<org.springframework.web.multipart.support.MultipartFile> < MultipartFile > java.util.List<org.springframework.web.multipart.support.MultipartFile> = org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) . get ( java.lang.String ) ; if ( java.util.List<org.springframework.web.multipart.support.MultipartFile> != null ) { return java.util.List<org.springframework.web.multipart.support.MultipartFile> ; } else { return java.util.Collections . java.util.List<org.springframework.web.multipart.support.MultipartFile> ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,org.springframework.web.multipart.support.MultipartFile> < java.lang.String , MultipartFile > java.util.Map<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) { return org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) . toSingleValueMap ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> < java.lang.String , MultipartFile > org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) { return org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( MultiValueMap < java.lang.String , MultipartFile > org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ) { this . org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> = new LinkedMultiValueMap <> ( java.util.Collections . java.util.Map ( org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> < java.lang.String , MultipartFile > org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ( ) { if ( this . org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> == null ) { void ( ) ; } return this . org.springframework.web.multipart.support.MultiValueMap<java.lang.String,org.springframework.web.multipart.support.MultipartFile> ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
