<METHOD_START> @ Before public void void ( ) { org.springframework.integration.router.DefaultListableBeanFactory . registerSingleton ( STRING , org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.DefaultListableBeanFactory . registerSingleton ( STRING , org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.DefaultListableBeanFactory . registerSingleton ( STRING , org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.DefaultListableBeanFactory . registerSingleton ( STRING , org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.DefaultListableBeanFactory . registerSingleton ( STRING , org.springframework.integration.router.QueueChannel ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( java.lang.IllegalArgumentException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( java.lang.RuntimeException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageHandlingException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( java.lang.RuntimeException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageHandlingException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageHandlingException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageDeliveryException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setResolutionRequired ( true ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanName ( STRING ) ; try { org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageDeliveryException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.Exception > ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( java.lang.IllegalArgumentException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( java.lang.RuntimeException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageHandlingException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.Message<> ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.router.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( java.lang.IllegalArgumentException ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageHandlingException ( org.springframework.integration.router.Message<> , STRING , java.lang.RuntimeException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( java.lang.IllegalArgumentException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageHandlingException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.IllegalArgumentException java.lang.IllegalArgumentException = new java.lang.IllegalArgumentException ( STRING ) ; MessageHandlingException org.springframework.integration.router.MessageHandlingException = new MessageRejectedException ( new GenericMessage < java.lang.Object > ( STRING ) , STRING , java.lang.IllegalArgumentException ) ; ErrorMessage org.springframework.integration.router.ErrorMessage = new ErrorMessage ( org.springframework.integration.router.MessageHandlingException ) ; ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( MessageHandlingException .class . java.lang.String ( ) , STRING ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setDefaultOutputChannel ( org.springframework.integration.router.QueueChannel ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . handleMessage ( org.springframework.integration.router.ErrorMessage ) ; assertNotNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.router.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ErrorMessageExceptionTypeRouter org.springframework.integration.router.ErrorMessageExceptionTypeRouter = new ErrorMessageExceptionTypeRouter ( ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setBeanFactory ( org.springframework.integration.router.DefaultListableBeanFactory ) ; org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setApplicationContext ( TestUtils . createTestApplicationContext ( ) ) ; try { org.springframework.integration.router.ErrorMessageExceptionTypeRouter . setChannelMapping ( STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , instanceOf ( java.lang.ClassNotFoundException .class ) ) ; } }  <METHOD_END>
