<METHOD_START> public void ( ) { this( null ); }  <METHOD_END>
<METHOD_START> public void ( ServletContext org.springframework.mock.web.test.ServletContext ) { super( org.springframework.mock.web.test.ServletContext ); setMethod ( STRING ) ; setContentType ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( MultipartFile org.springframework.mock.web.test.MultipartFile ) { Assert . notNull ( org.springframework.mock.web.test.MultipartFile , STRING ) ; this . org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> . add ( org.springframework.mock.web.test.MultipartFile . getName ( ) , org.springframework.mock.web.test.MultipartFile ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> ( ) { return this . org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> . keySet ( ) . iterator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.web.test.MultipartFile org.springframework.mock.web.test.MultipartFile ( java.lang.String java.lang.String ) { return this . org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> . getFirst ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.mock.web.test.MultipartFile> < MultipartFile > java.util.List<org.springframework.mock.web.test.MultipartFile> ( java.lang.String java.lang.String ) { java.util.List<org.springframework.mock.web.test.MultipartFile> < MultipartFile > java.util.List<org.springframework.mock.web.test.MultipartFile> = this . org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> . get ( java.lang.String ) ; if ( java.util.List<org.springframework.mock.web.test.MultipartFile> != null ) { return java.util.List<org.springframework.mock.web.test.MultipartFile> ; } else { return java.util.Collections . java.util.List<org.springframework.mock.web.test.MultipartFile> ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,org.springframework.mock.web.test.MultipartFile> < java.lang.String , MultipartFile > java.util.Map<java.lang.String,org.springframework.mock.web.test.MultipartFile> ( ) { return this . org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> . toSingleValueMap ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> < java.lang.String , MultipartFile > org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> ( ) { return new LinkedMultiValueMap <> ( this . org.springframework.mock.web.test.MultiValueMap<java.lang.String,org.springframework.mock.web.test.MultipartFile> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { MultipartFile org.springframework.mock.web.test.MultipartFile = org.springframework.mock.web.test.MultipartFile ( java.lang.String ) ; if ( org.springframework.mock.web.test.MultipartFile != null ) { return org.springframework.mock.web.test.MultipartFile . getContentType ( ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.web.test.HttpMethod org.springframework.mock.web.test.HttpMethod ( ) { return HttpMethod . resolve ( getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.web.test.HttpHeaders org.springframework.mock.web.test.HttpHeaders ( ) { HttpHeaders org.springframework.mock.web.test.HttpHeaders = new HttpHeaders ( ) ; java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> = getHeaderNames ( ) ; while ( java.util.Enumeration<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = java.util.Enumeration<java.lang.String> . java.lang.String ( ) ; org.springframework.mock.web.test.HttpHeaders . put ( java.lang.String , java.util.Collections . java.util.ArrayList ( getHeaders ( java.lang.String ) ) ) ; } return org.springframework.mock.web.test.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.web.test.HttpHeaders org.springframework.mock.web.test.HttpHeaders ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; if ( java.lang.String != null ) { HttpHeaders org.springframework.mock.web.test.HttpHeaders = new HttpHeaders ( ) ; org.springframework.mock.web.test.HttpHeaders . add ( STRING , java.lang.String ) ; return org.springframework.mock.web.test.HttpHeaders ; } else { return null ; } }  <METHOD_END>
