<METHOD_START> @ BeforeClass public static void void ( ) java.lang.Exception { java.io.File = new java.io.File ( new java.io.File ( java.lang.System . java.lang.String ( STRING ) ) , org.springframework.integration.file.locking.FileLockingWithMultipleSourcesIntegrationTests .class . java.lang.String ( ) ) ; java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { for ( java.io.File java.io.File : java.io.File . java.io.File[] ( ) ) { java.io.File . boolean ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File . boolean ( ) ; assertThat ( org.springframework.integration.file.locking.FileReadingMessageSource . receive ( ) , hasPayload ( java.io.File ) ) ; assertThat ( org.springframework.integration.file.locking.FileReadingMessageSource . receive ( ) , nullValue ( ) ) ; FileChannelCache . closeChannelFor ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File . boolean ( ) ; assertThat ( org.springframework.integration.file.locking.FileReadingMessageSource . receive ( ) , hasPayload ( java.io.File ) ) ; assertThat ( org.springframework.integration.file.locking.FileReadingMessageSource . receive ( ) , hasPayload ( java.io.File ) ) ; FileChannelCache . closeChannelFor ( java.io.File ) ; }  <METHOD_END>
