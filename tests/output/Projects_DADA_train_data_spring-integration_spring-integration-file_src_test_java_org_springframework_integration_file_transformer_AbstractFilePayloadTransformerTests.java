<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.io.File = java.io.File . java.io.File ( STRING , STRING ) ; java.io.File . void ( ) ; FileCopyUtils . copy ( java.lang.String . byte[] ( java.lang.String ) , new java.io.FileOutputStream ( java.io.File , false ) ) ; org.springframework.integration.file.transformer.Message<java.io.File> = MessageBuilder . withPayload ( java.io.File ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.io.IOException { if ( java.io.File . boolean ( ) ) { java.io.File . boolean ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; org.springframework.integration.file.transformer.Message<java.io.File> = MessageBuilder . fromMessage ( org.springframework.integration.file.transformer.Message<java.io.File> ) . setHeader ( java.lang.String , java.lang.String ) . build ( ) ; Message < ? > org.springframework.integration.file.transformer.Message<?> = T . transform ( org.springframework.integration.file.transformer.Message<java.io.File> ) ; assertThat ( org.springframework.integration.file.transformer.Message<> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.integration.file.transformer.Message<> , HeaderMatcher . hasHeader ( java.lang.String , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < ? > org.springframework.integration.file.transformer.Message<?> = T . transform ( org.springframework.integration.file.transformer.Message<java.io.File> ) ; assertThat ( org.springframework.integration.file.transformer.Message<> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.integration.file.transformer.Message<> , HeaderMatcher . hasHeader ( FileHeaders . FILENAME , java.io.File . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { T . transform ( org.springframework.integration.file.transformer.Message<java.io.File> ) ; assertThat ( java.io.File . boolean ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { T . setDeleteFiles ( true ) ; T . transform ( org.springframework.integration.file.transformer.Message<java.io.File> ) ; assertThat ( STRING + java.io.File . java.lang.String ( ) , java.io.File . boolean ( ) , is ( false ) ) ; }  <METHOD_END>
