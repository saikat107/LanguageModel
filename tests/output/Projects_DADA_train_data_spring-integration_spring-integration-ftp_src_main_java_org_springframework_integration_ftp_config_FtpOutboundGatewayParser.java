<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return FtpOutboundGateway .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return FtpSimplePatternFileListFilter .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return FtpRegexPatternFileListFilter .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<? extends org.springframework.integration.ftp.config.RemoteFileOperations<?>> < ? extends RemoteFileOperations < ? > > java.lang.Class<? extends org.springframework.integration.ftp.config.RemoteFileOperations<?>> ( ) { return FtpRemoteFileTemplate .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( BeanDefinitionBuilder org.springframework.integration.ftp.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinition org.springframework.integration.ftp.config.BeanDefinition = ( BeanDefinition ) org.springframework.integration.ftp.config.BeanDefinitionBuilder . getRawBeanDefinition ( ) . getConstructorArgumentValues ( ) . getIndexedArgumentValues ( ) . values ( ) . iterator ( ) . next ( ) . getValue ( ) ; org.springframework.integration.ftp.config.BeanDefinition . getPropertyValues ( ) . add ( STRING , FtpRemoteFileTemplate . ExistsMode . NLST ) ; }  <METHOD_END>
