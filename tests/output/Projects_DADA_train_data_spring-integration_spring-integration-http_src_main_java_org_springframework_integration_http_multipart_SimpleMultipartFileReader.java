<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( java.lang.String != null ? java.lang.String : WebUtils . DEFAULT_CHARACTER_ENCODING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MultipartFile org.springframework.integration.http.multipart.MultipartFile ) throws java.io.IOException { if ( org.springframework.integration.http.multipart.MultipartFile . getContentType ( ) != null && org.springframework.integration.http.multipart.MultipartFile . getContentType ( ) . startsWith ( STRING ) ) { MediaType org.springframework.integration.http.multipart.MediaType = MediaType . parseMediaType ( org.springframework.integration.http.multipart.MultipartFile . getContentType ( ) ) ; java.nio.charset.Charset java.nio.charset.Charset = org.springframework.integration.http.multipart.MediaType . getCharset ( ) ; if ( java.nio.charset.Charset == null ) { java.nio.charset.Charset = this . java.nio.charset.Charset ; } return new java.lang.String ( org.springframework.integration.http.multipart.MultipartFile . getBytes ( ) , java.nio.charset.Charset . java.lang.String ( ) ) ; } else { return org.springframework.integration.http.multipart.MultipartFile . getBytes ( ) ; } }  <METHOD_END>
