<METHOD_START> @ AfterClass public static void void ( ) java.lang.Throwable { if ( java.io.File . boolean ( ) ) { java.io.File . boolean ( ) ; } }  <METHOD_END>
<METHOD_START> @ BeforeClass public static void void ( ) { java.io.File = new java.io.File ( java.lang.System . java.lang.String ( STRING ) + STRING + org.springframework.integration.file.FileReadingMessageSourceIntegrationTests .class . java.lang.String ( ) ) ; java.io.File . boolean ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { void ( ) ; java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> private static void void ( ) { java.io.File [] java.io.File[] = java.io.File . java.io.File[] ( ) ; for ( java.io.File java.io.File : java.io.File[] ) { java.io.File . boolean ( ) ; } }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.io.File . java.io.File ( STRING , null , java.io.File ) . boolean ( java.lang.System . long ( ) - NUMBER ) ; java.io.File . java.io.File ( STRING , null , java.io.File ) . boolean ( java.lang.System . long ( ) - NUMBER ) ; java.io.File . java.io.File ( STRING , null , java.io.File ) . boolean ( java.lang.System . long ( ) - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { java.io.File [] java.io.File[] = java.io.File . java.io.File[] ( ) ; for ( int int = NUMBER ; int < java.io.File[] . int ; int ++ ) { java.io.File[] [ int ] . boolean ( ) ; } }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) java.lang.Exception { java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DirectFieldAccessor org.springframework.integration.file.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.file.FileReadingMessageSource ) ; assertEquals ( java.io.File , org.springframework.integration.file.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; assertNotNull ( STRING , org.springframework.integration.file.Message<java.io.File> ) ; Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; assertNotNull ( org.springframework.integration.file.Message<java.io.File> ) ; Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; assertNotNull ( org.springframework.integration.file.Message<java.io.File> ) ; assertNotSame ( org.springframework.integration.file.Message<java.io.File> + STRING + org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> . getPayload ( ) , org.springframework.integration.file.Message<java.io.File> . getPayload ( ) ) ; assertNotSame ( org.springframework.integration.file.Message<java.io.File> + STRING + org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> . getPayload ( ) , org.springframework.integration.file.Message<java.io.File> . getPayload ( ) ) ; assertNotSame ( org.springframework.integration.file.Message<java.io.File> + STRING + org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> . getPayload ( ) , org.springframework.integration.file.Message<java.io.File> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; assertNotSame ( org.springframework.integration.file.Message<java.io.File> + STRING + org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> ) ; assertNotSame ( org.springframework.integration.file.Message<java.io.File> + STRING + org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> ) ; assertNotSame ( org.springframework.integration.file.Message<java.io.File> + STRING + org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> , org.springframework.integration.file.Message<java.io.File> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNotNull ( org.springframework.integration.file.FileReadingMessageSource . receive ( ) ) ; assertNotNull ( org.springframework.integration.file.FileReadingMessageSource . receive ( ) ) ; Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; assertNotNull ( org.springframework.integration.file.Message<java.io.File> ) ; java.io.File java.io.File = org.springframework.integration.file.Message<java.io.File> . getPayload ( ) ; assertEquals ( java.io.File , org.springframework.integration.file.Message<java.io.File> . getHeaders ( ) . get ( FileHeaders . ORIGINAL_FILE ) ) ; assertEquals ( java.io.File . java.lang.String ( ) , org.springframework.integration.file.Message<java.io.File> . getHeaders ( ) . get ( FileHeaders . FILENAME ) ) ; assertEquals ( java.io.File . java.lang.String ( ) , org.springframework.integration.file.Message<java.io.File> . getHeaders ( ) . get ( FileHeaders . RELATIVE_PATH ) ) ; assertNull ( org.springframework.integration.file.FileReadingMessageSource . receive ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.lang.Runnable java.lang.Runnable = ( ) { Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; while ( org.springframework.integration.file.Message<java.io.File> == null ) { java.lang.Thread . void ( ) ; org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; } } ; java.lang.Runnable java.lang.Runnable = ( ) { Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; if ( org.springframework.integration.file.Message<java.io.File> != null ) { org.springframework.integration.file.FileReadingMessageSource . onFailure ( org.springframework.integration.file.Message<java.io.File> ) ; } } ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = java.util.concurrent.CountDownLatch ( NUMBER , java.lang.Runnable , java.util.concurrent.CountDownLatch ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = java.util.concurrent.CountDownLatch ( NUMBER , java.lang.Runnable , java.util.concurrent.CountDownLatch ) ; java.util.concurrent.CountDownLatch . void ( ) ; try { java.util.concurrent.CountDownLatch . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = org.springframework.integration.file.FileReadingMessageSource . receive ( ) ; assertNull ( org.springframework.integration.file.Message<java.io.File> ) ; }  <METHOD_END>
<METHOD_START> private java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ( int int , final java.lang.Runnable java.lang.Runnable , final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ) { final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; for ( int int = NUMBER ; int < int ; int ++ ) { new java.lang.Thread ( new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; try { java.util.concurrent.CountDownLatch . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } java.lang.Runnable . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; } } ) . void ( ) ; } return java.util.concurrent.CountDownLatch ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; try { java.util.concurrent.CountDownLatch . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } java.lang.Runnable . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>