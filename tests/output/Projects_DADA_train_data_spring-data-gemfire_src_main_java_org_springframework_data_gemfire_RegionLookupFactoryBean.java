<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Assert . notNull ( this . org.springframework.data.gemfire.GemFireCache , STRING ) ; java.lang.String java.lang.String = java.lang.String ( ) ; Assert . hasText ( java.lang.String , STRING ) ; synchronized ( this . org.springframework.data.gemfire.GemFireCache ) { if ( boolean ( ) ) { this . org.springframework.data.gemfire.Region<K,V> = java.util.Optional . java.util.Optional ( org.springframework.data.gemfire.Region<?,?> ( ) ) . map ( parentRegion -> parentRegion .< K , V > getSubregion ( regionName ) ) . orElseGet ( ( ) this . cache .< K , V > getRegion ( regionName ) ) ; } if ( org.springframework.data.gemfire.Region<K,V> != null ) { org.springframework.data.gemfire.Log . info ( java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.data.gemfire.GemFireCache . getName ( ) ) ) ; } else { org.springframework.data.gemfire.Log . info ( java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.data.gemfire.GemFireCache . getName ( ) ) ) ; org.springframework.data.gemfire.Region<K,V> = org.springframework.data.gemfire.Region<K,V> ( org.springframework.data.gemfire.GemFireCache , java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.Region<K,V> < K , V > org.springframework.data.gemfire.Region<K,V> ( GemFireCache org.springframework.data.gemfire.GemFireCache , java.lang.String java.lang.String ) throws java.lang.Exception { throw new BeanInitializationException ( java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.data.gemfire.GemFireCache ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.gemfire.Region<K,V> < K , V > org.springframework.data.gemfire.Region<K,V> ( ) java.lang.Exception { return org.springframework.data.gemfire.Region<K,V> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.Region<K,V> ( ) ; return ( org.springframework.data.gemfire.Region != null ? org.springframework.data.gemfire.Region . getClass ( ) : Region .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( StringUtils . hasText ( this . java.lang.String ) ? this . java.lang.String : ( StringUtils . hasText ( this . java.lang.String ) ? this . java.lang.String : this . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( GemFireCache org.springframework.data.gemfire.GemFireCache ) { this . org.springframework.data.gemfire.GemFireCache = org.springframework.data.gemfire.GemFireCache ; }  <METHOD_END>
<METHOD_START> boolean boolean ( ) { return java.lang.Boolean . java.lang.Boolean . boolean ( java.lang.Boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.Boolean java.lang.Boolean ( ) { return java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( Region < ? , ? > org.springframework.data.gemfire.Region<?,?> ) { this . org.springframework.data.gemfire.Region<?,?> = org.springframework.data.gemfire.Region<,> ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.Region<?,?> < ? , ? > org.springframework.data.gemfire.Region<?,?> ( ) { return this . org.springframework.data.gemfire.Region<,> ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.Region<K,V> < K , V > org.springframework.data.gemfire.Region<K,V> ( ) { return this . org.springframework.data.gemfire.Region<K,V> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
