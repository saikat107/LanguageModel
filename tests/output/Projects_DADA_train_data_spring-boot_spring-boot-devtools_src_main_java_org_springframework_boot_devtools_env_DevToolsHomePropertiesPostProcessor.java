<METHOD_START> @ java.lang.Override public void void ( ConfigurableEnvironment org.springframework.boot.devtools.env.ConfigurableEnvironment , SpringApplication org.springframework.boot.devtools.env.SpringApplication ) { java.io.File java.io.File = java.io.File ( ) ; java.io.File java.io.File = ( java.io.File == null ? null : new java.io.File ( java.io.File , java.lang.String ) ) ; if ( java.io.File != null && java.io.File . boolean ( ) && java.io.File . boolean ( ) ) { FileSystemResource org.springframework.boot.devtools.env.FileSystemResource = new FileSystemResource ( java.io.File ) ; java.util.Properties java.util.Properties ; try { java.util.Properties = PropertiesLoaderUtils . loadProperties ( org.springframework.boot.devtools.env.FileSystemResource ) ; org.springframework.boot.devtools.env.ConfigurableEnvironment . getPropertySources ( ) . addFirst ( new PropertiesPropertySource ( STRING , java.util.Properties ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String , java.io.IOException ) ; } } }  <METHOD_END>
<METHOD_START> protected java.io.File java.io.File ( ) { java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { return new java.io.File ( java.lang.String ) ; } return null ; }  <METHOD_END>