<METHOD_START> public void ( JestProperties org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties , ObjectProvider < Gson > org.springframework.boot.autoconfigure.elasticsearch.jest.ObjectProvider<org.springframework.boot.autoconfigure.elasticsearch.jest.Gson> , ObjectProvider < java.util.List<org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer> < HttpClientConfigBuilderCustomizer > > org.springframework.boot.autoconfigure.elasticsearch.jest.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer>> ) { this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties = org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties ; this . org.springframework.boot.autoconfigure.elasticsearch.jest.ObjectProvider<org.springframework.boot.autoconfigure.elasticsearch.jest.Gson> = org.springframework.boot.autoconfigure.elasticsearch.jest.ObjectProvider<org.springframework.boot.autoconfigure.elasticsearch.jest.Gson> ; this . java.util.List<org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer> = org.springframework.boot.autoconfigure.elasticsearch.jest.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer>> . getIfAvailable ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean ( destroyMethod = STRING ) @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient org.springframework.boot.autoconfigure.elasticsearch.jest.JestClient ( ) { JestClientFactory org.springframework.boot.autoconfigure.elasticsearch.jest.JestClientFactory = new JestClientFactory ( ) ; org.springframework.boot.autoconfigure.elasticsearch.jest.JestClientFactory . setHttpClientConfig ( org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfig ( ) ) ; return org.springframework.boot.autoconfigure.elasticsearch.jest.JestClientFactory . getObject ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfig org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfig ( ) { HttpClientConfig . HttpClientConfig HttpClientConfig.Builder = new HttpClientConfig . HttpClientConfig ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getUris ( ) ) ; if ( StringUtils . hasText ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getUsername ( ) ) ) { HttpClientConfig.Builder . defaultCredentials ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getUsername ( ) , this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getPassword ( ) ) ; } java.lang.String java.lang.String = this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getProxy ( ) . getHost ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.Integer java.lang.Integer = this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getProxy ( ) . getPort ( ) ; Assert . notNull ( java.lang.Integer , STRING ) ; HttpClientConfig.Builder . proxy ( new HttpHost ( java.lang.String , java.lang.Integer ) ) ; } Gson org.springframework.boot.autoconfigure.elasticsearch.jest.Gson = this . org.springframework.boot.autoconfigure.elasticsearch.jest.ObjectProvider<org.springframework.boot.autoconfigure.elasticsearch.jest.Gson> . getIfUnique ( ) ; if ( org.springframework.boot.autoconfigure.elasticsearch.jest.Gson != null ) { HttpClientConfig.Builder . gson ( org.springframework.boot.autoconfigure.elasticsearch.jest.Gson ) ; } HttpClientConfig.Builder . multiThreaded ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . isMultiThreaded ( ) ) ; HttpClientConfig.Builder . connTimeout ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getConnectionTimeout ( ) ) . readTimeout ( this . org.springframework.boot.autoconfigure.elasticsearch.jest.JestProperties . getReadTimeout ( ) ) ; void ( HttpClientConfig.Builder ) ; return HttpClientConfig.Builder . build ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( HttpClientConfig . HttpClientConfig HttpClientConfig.Builder ) { if ( this . java.util.List<org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer> != null ) { for ( HttpClientConfigBuilderCustomizer org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer : this . java.util.List<org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer> ) { org.springframework.boot.autoconfigure.elasticsearch.jest.HttpClientConfigBuilderCustomizer . customize ( HttpClientConfig.Builder ) ; } } }  <METHOD_END>