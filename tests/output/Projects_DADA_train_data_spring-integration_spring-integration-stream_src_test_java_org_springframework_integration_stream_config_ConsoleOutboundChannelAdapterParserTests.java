<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.BufferedWriter java.io.BufferedWriter = TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING , java.io.BufferedWriter .class ) ; java.io.Writer java.io.Writer = TestUtils . getPropertyValue ( java.io.BufferedWriter , STRING , java.io.Writer .class ) ; assertEquals ( java.io.OutputStreamWriter .class , java.io.Writer . java.lang.Class<? extends java.io.Writer> ( ) ) ; java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( ( ( java.io.OutputStreamWriter ) java.io.Writer ) . java.lang.String ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( ) , java.nio.charset.Charset ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( java.io.Writer , STRING ) ; assertEquals ( java.lang.System . java.io.PrintStream , java.lang.Object ) ; java.io.BufferedWriter = Mockito . spy ( java.io.BufferedWriter ) ; DirectFieldAccessor org.springframework.integration.stream.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.stream.config.MessageHandler ) ; org.springframework.integration.stream.config.DirectFieldAccessor . setPropertyValue ( STRING , java.io.BufferedWriter ) ; this . org.springframework.integration.stream.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; verify ( java.io.BufferedWriter , times ( NUMBER ) ) . write ( eq ( STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.BufferedWriter java.io.BufferedWriter = TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING , java.io.BufferedWriter .class ) ; java.io.Writer java.io.Writer = TestUtils . getPropertyValue ( java.io.BufferedWriter , STRING , java.io.Writer .class ) ; assertEquals ( java.io.OutputStreamWriter .class , java.io.Writer . java.lang.Class<? extends java.io.Writer> ( ) ) ; java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( ( ( java.io.OutputStreamWriter ) java.io.Writer ) . java.lang.String ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , java.nio.charset.Charset ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( java.io.Writer , STRING ) ; assertEquals ( java.lang.System . java.io.PrintStream , java.lang.Object ) ; java.io.BufferedWriter = Mockito . spy ( java.io.BufferedWriter ) ; DirectFieldAccessor org.springframework.integration.stream.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.stream.config.MessageHandler ) ; org.springframework.integration.stream.config.DirectFieldAccessor . setPropertyValue ( STRING , java.io.BufferedWriter ) ; this . org.springframework.integration.stream.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; verify ( java.io.BufferedWriter , times ( NUMBER ) ) . write ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanCreationException org.springframework.integration.stream.config.BeanCreationException = null ; try { new ClassPathXmlApplicationContext ( STRING , org.springframework.integration.stream.config.ConsoleOutboundChannelAdapterParserTests .class ) . close ( ) ; } catch ( BeanCreationException org.springframework.integration.stream.config.BeanCreationException ) { org.springframework.integration.stream.config.BeanCreationException = org.springframework.integration.stream.config.BeanCreationException ; } java.lang.Throwable java.lang.Throwable = org.springframework.integration.stream.config.BeanCreationException . getRootCause ( ) ; assertEquals ( java.io.UnsupportedEncodingException .class , java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.BufferedWriter java.io.BufferedWriter = TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING , java.io.BufferedWriter .class ) ; java.io.Writer java.io.Writer = TestUtils . getPropertyValue ( java.io.BufferedWriter , STRING , java.io.Writer .class ) ; assertEquals ( java.io.OutputStreamWriter .class , java.io.Writer . java.lang.Class<? extends java.io.Writer> ( ) ) ; java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( ( ( java.io.OutputStreamWriter ) java.io.Writer ) . java.lang.String ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( ) , java.nio.charset.Charset ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( java.io.Writer , STRING ) ; assertEquals ( java.lang.System . java.io.PrintStream , java.lang.Object ) ; java.io.BufferedWriter = Mockito . spy ( java.io.BufferedWriter ) ; DirectFieldAccessor org.springframework.integration.stream.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.stream.config.MessageHandler ) ; org.springframework.integration.stream.config.DirectFieldAccessor . setPropertyValue ( STRING , java.io.BufferedWriter ) ; this . org.springframework.integration.stream.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; verify ( java.io.BufferedWriter , times ( NUMBER ) ) . write ( eq ( STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.BufferedWriter java.io.BufferedWriter = TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING , java.io.BufferedWriter .class ) ; java.io.Writer java.io.Writer = TestUtils . getPropertyValue ( java.io.BufferedWriter , STRING , java.io.Writer .class ) ; assertEquals ( java.io.OutputStreamWriter .class , java.io.Writer . java.lang.Class<? extends java.io.Writer> ( ) ) ; java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( ( ( java.io.OutputStreamWriter ) java.io.Writer ) . java.lang.String ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( ) , java.nio.charset.Charset ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( java.io.Writer , STRING ) ; assertEquals ( java.lang.System . java.io.PrintStream , java.lang.Object ) ; java.io.BufferedWriter = Mockito . spy ( java.io.BufferedWriter ) ; DirectFieldAccessor org.springframework.integration.stream.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.stream.config.MessageHandler ) ; org.springframework.integration.stream.config.DirectFieldAccessor . setPropertyValue ( STRING , java.io.BufferedWriter ) ; this . org.springframework.integration.stream.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; verify ( java.io.BufferedWriter , times ( NUMBER ) ) . write ( eq ( STRING ) ) ; verify ( java.io.BufferedWriter , times ( NUMBER ) ) . newLine ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.util.List<?> < ? > java.util.List<?> = TestUtils . getPropertyValue ( this . org.springframework.integration.stream.config.MessageHandler , STRING , java.util.List .class ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; java.lang.Object java.lang.Object = java.util.List<> . get ( NUMBER ) ; assertTrue ( java.lang.Object instanceof MessageHandlerChain ) ; java.util.List<?> < ? > java.util.List<?> = TestUtils . getPropertyValue ( java.lang.Object , STRING , java.util.List .class ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; java.lang.Object java.lang.Object = java.util.List<> . get ( NUMBER ) ; assertTrue ( java.lang.Object instanceof CharacterStreamWritingMessageHandler ) ; java.io.BufferedWriter java.io.BufferedWriter = TestUtils . getPropertyValue ( java.lang.Object , STRING , java.io.BufferedWriter .class ) ; java.io.Writer java.io.Writer = TestUtils . getPropertyValue ( java.io.BufferedWriter , STRING , java.io.Writer .class ) ; assertEquals ( java.io.OutputStreamWriter .class , java.io.Writer . java.lang.Class<? extends java.io.Writer> ( ) ) ; java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( ( ( java.io.OutputStreamWriter ) java.io.Writer ) . java.lang.String ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( ) , java.nio.charset.Charset ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( java.io.Writer , STRING ) ; assertEquals ( java.lang.System . java.io.PrintStream , java.lang.Object ) ; java.io.BufferedWriter = Mockito . spy ( java.io.BufferedWriter ) ; DirectFieldAccessor org.springframework.integration.stream.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; org.springframework.integration.stream.config.DirectFieldAccessor . setPropertyValue ( STRING , java.io.BufferedWriter ) ; this . org.springframework.integration.stream.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; verify ( java.io.BufferedWriter , times ( NUMBER ) ) . write ( eq ( STRING ) ) ; }  <METHOD_END>