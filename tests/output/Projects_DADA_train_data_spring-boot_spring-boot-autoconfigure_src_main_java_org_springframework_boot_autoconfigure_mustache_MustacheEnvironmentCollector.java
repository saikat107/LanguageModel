<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.boot.autoconfigure.mustache.Environment ) { this . org.springframework.boot.autoconfigure.mustache.ConfigurableEnvironment = ( ConfigurableEnvironment ) org.springframework.boot.autoconfigure.mustache.Environment ; this . java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; new RelaxedDataBinder ( this . java.util.Map<java.lang.String,java.lang.Object> ) . bind ( new PropertySourcesPropertyValues ( this . org.springframework.boot.autoconfigure.mustache.ConfigurableEnvironment . getPropertySources ( ) ) ) ; this . org.springframework.boot.autoconfigure.mustache.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.autoconfigure.mustache.Environment ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.mustache.VariableFetcher org.springframework.boot.autoconfigure.mustache.VariableFetcher ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { VariableFetcher org.springframework.boot.autoconfigure.mustache.VariableFetcher = super. createFetcher ( java.lang.Object , java.lang.String ) ; if ( org.springframework.boot.autoconfigure.mustache.VariableFetcher != null ) { return org.springframework.boot.autoconfigure.mustache.VariableFetcher ; } if ( this . org.springframework.boot.autoconfigure.mustache.RelaxedPropertyResolver . containsProperty ( java.lang.String ) ) { return this . org.springframework.boot.autoconfigure.mustache.VariableFetcher ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws java.lang.Exception { return org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector .this . org.springframework.boot.autoconfigure.mustache.RelaxedPropertyResolver . getProperty ( java.lang.String ) ; }  <METHOD_END>