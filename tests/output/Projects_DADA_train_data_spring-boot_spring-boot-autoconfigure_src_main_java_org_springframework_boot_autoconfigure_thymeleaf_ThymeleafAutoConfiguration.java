<METHOD_START> void ( ThymeleafProperties org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties , ApplicationContext org.springframework.boot.autoconfigure.thymeleaf.ApplicationContext ) { this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties = org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties ; this . org.springframework.boot.autoconfigure.thymeleaf.ApplicationContext = org.springframework.boot.autoconfigure.thymeleaf.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ javax.annotation.PostConstruct public void void ( ) { boolean boolean = this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . isCheckTemplateLocation ( ) ; if ( boolean ) { TemplateLocation org.springframework.boot.autoconfigure.thymeleaf.TemplateLocation = new TemplateLocation ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getPrefix ( ) ) ; if ( ! org.springframework.boot.autoconfigure.thymeleaf.TemplateLocation . exists ( this . org.springframework.boot.autoconfigure.thymeleaf.ApplicationContext ) ) { org.springframework.boot.autoconfigure.thymeleaf.Log . warn ( STRING + org.springframework.boot.autoconfigure.thymeleaf.TemplateLocation + STRING + STRING ) ; } } }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver ( ) { SpringResourceTemplateResolver org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver = new SpringResourceTemplateResolver ( ) ; org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setApplicationContext ( this . org.springframework.boot.autoconfigure.thymeleaf.ApplicationContext ) ; org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setPrefix ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getPrefix ( ) ) ; org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setSuffix ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getSuffix ( ) ) ; org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setTemplateMode ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getMode ( ) ) ; if ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getEncoding ( ) != null ) { org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setCharacterEncoding ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getEncoding ( ) . name ( ) ) ; } org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setCacheable ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . isCache ( ) ) ; java.lang.Integer java.lang.Integer = this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getTemplateResolverOrder ( ) ; if ( java.lang.Integer != null ) { org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setOrder ( java.lang.Integer ) ; } org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver . setCheckExistence ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . isCheckTemplate ( ) ) ; return org.springframework.boot.autoconfigure.thymeleaf.SpringResourceTemplateResolver ; }  <METHOD_END>
<METHOD_START> void ( ThymeleafProperties org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties , SpringTemplateEngine org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine ) { this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties = org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties ; this . org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine = org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean ( name = STRING ) @ ConditionalOnProperty ( name = STRING , matchIfMissing = true ) public org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver ( ) { ThymeleafViewResolver org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver = new ThymeleafViewResolver ( ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setTemplateEngine ( this . org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setCharacterEncoding ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getEncoding ( ) . name ( ) ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setContentType ( java.lang.String ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getContentType ( ) , org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . getCharacterEncoding ( ) ) ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setExcludedViewNames ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getExcludedViewNames ( ) ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setViewNames ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . getViewNames ( ) ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setOrder ( Ordered . LOWEST_PRECEDENCE - NUMBER ) ; org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver . setCache ( this . org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties . isCache ( ) ) ; return org.springframework.boot.autoconfigure.thymeleaf.ThymeleafViewResolver ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( MimeType org.springframework.boot.autoconfigure.thymeleaf.MimeType , java.lang.String java.lang.String ) { if ( org.springframework.boot.autoconfigure.thymeleaf.MimeType . getCharset ( ) != null ) { return org.springframework.boot.autoconfigure.thymeleaf.MimeType . toString ( ) ; } java.util.LinkedHashMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.LinkedHashMap<java.lang.String,java.lang.String> = new java.util.LinkedHashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.LinkedHashMap<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String ) ; java.util.LinkedHashMap<java.lang.String,java.lang.String> . void ( org.springframework.boot.autoconfigure.thymeleaf.MimeType . getParameters ( ) ) ; return new MimeType ( org.springframework.boot.autoconfigure.thymeleaf.MimeType , java.util.LinkedHashMap<java.lang.String,java.lang.String> ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver> < ITemplateResolver > java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver> , ObjectProvider < java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.IDialect> < IDialect > > org.springframework.boot.autoconfigure.thymeleaf.ObjectProvider<java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.IDialect>> ) { this . java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver> = java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver> ; this . java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.IDialect> = org.springframework.boot.autoconfigure.thymeleaf.ObjectProvider<java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.IDialect>> . getIfAvailable ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine ( ) { SpringTemplateEngine org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine = new SpringTemplateEngine ( ) ; for ( ITemplateResolver org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver : this . java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver> ) { org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine . addTemplateResolver ( org.springframework.boot.autoconfigure.thymeleaf.ITemplateResolver ) ; } if ( ! CollectionUtils . isEmpty ( this . java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.IDialect> ) ) { for ( IDialect org.springframework.boot.autoconfigure.thymeleaf.IDialect : this . java.util.Collection<org.springframework.boot.autoconfigure.thymeleaf.IDialect> ) { org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine . addDialect ( org.springframework.boot.autoconfigure.thymeleaf.IDialect ) ; } } return org.springframework.boot.autoconfigure.thymeleaf.SpringTemplateEngine ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.thymeleaf.LayoutDialect org.springframework.boot.autoconfigure.thymeleaf.LayoutDialect ( ) { return new LayoutDialect ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.thymeleaf.DataAttributeDialect org.springframework.boot.autoconfigure.thymeleaf.DataAttributeDialect ( ) { return new DataAttributeDialect ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.thymeleaf.SpringSecurityDialect org.springframework.boot.autoconfigure.thymeleaf.SpringSecurityDialect ( ) { return new SpringSecurityDialect ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.thymeleaf.Java8TimeDialect org.springframework.boot.autoconfigure.thymeleaf.Java8TimeDialect ( ) { return new Java8TimeDialect ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean @ ConditionalOnEnabledResourceChain public org.springframework.boot.autoconfigure.thymeleaf.ResourceUrlEncodingFilter org.springframework.boot.autoconfigure.thymeleaf.ResourceUrlEncodingFilter ( ) { return new ResourceUrlEncodingFilter ( ) ; }  <METHOD_END>
