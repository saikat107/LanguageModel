<METHOD_START> public void ( ObjectProvider < java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>> < HttpMessageConverter < ? > > > org.springframework.boot.autoconfigure.http.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>>> ) { this . java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>> = org.springframework.boot.autoconfigure.http.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>>> . getIfAvailable ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.http.HttpMessageConverters org.springframework.boot.autoconfigure.http.HttpMessageConverters ( ) { return new HttpMessageConverters ( this . java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>> == null ? java.util.Collections .< HttpMessageConverter < ? > > java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>> ( ) : this . java.util.List<org.springframework.boot.autoconfigure.http.HttpMessageConverter<?>> ) ; }  <METHOD_END>
<METHOD_START> protected void ( HttpEncodingProperties org.springframework.boot.autoconfigure.http.HttpEncodingProperties ) { this . org.springframework.boot.autoconfigure.http.HttpEncodingProperties = org.springframework.boot.autoconfigure.http.HttpEncodingProperties ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.http.StringHttpMessageConverter org.springframework.boot.autoconfigure.http.StringHttpMessageConverter ( ) { StringHttpMessageConverter org.springframework.boot.autoconfigure.http.StringHttpMessageConverter = new StringHttpMessageConverter ( this . org.springframework.boot.autoconfigure.http.HttpEncodingProperties . getCharset ( ) ) ; org.springframework.boot.autoconfigure.http.StringHttpMessageConverter . setWriteAcceptCharset ( false ) ; return org.springframework.boot.autoconfigure.http.StringHttpMessageConverter ; }  <METHOD_END>