<METHOD_START> @ BeforeClass @ AfterClass public static void void ( ) { new java.io.File ( STRING ) . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.integration.sftp.inbound.RollbackLocalFilterTests.Crash . java.util.concurrent.CountDownLatch ( ) . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertEquals ( STRING , this . org.springframework.integration.sftp.inbound.RollbackLocalFilterTests.Crash . java.io.File ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ( ) { return java.util.concurrent.CountDownLatch ; }  <METHOD_END>
<METHOD_START> public java.io.File java.io.File ( ) { return java.io.File ; }  <METHOD_END>
<METHOD_START> public void void ( java.io.File java.io.File ) { if ( this . java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new java.lang.RuntimeException ( STRING ) ; } this . java.io.File = java.io.File ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.sftp.inbound.SessionFactory<org.springframework.integration.sftp.inbound.LsEntry> < LsEntry > org.springframework.integration.sftp.inbound.SessionFactory<org.springframework.integration.sftp.inbound.LsEntry> ( ) { return org.springframework.integration.sftp.inbound.RollbackLocalFilterTests . sessionFactory ( ) ; }  <METHOD_END>
