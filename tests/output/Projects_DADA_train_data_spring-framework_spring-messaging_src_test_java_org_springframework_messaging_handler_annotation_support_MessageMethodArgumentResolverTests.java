<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . java.lang.reflect.Method = org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolverTests .class . java.lang.reflect.Method ( STRING , Message .class , Message .class , Message .class , Message .class , ErrorMessage .class ) ; this . org.springframework.messaging.handler.annotation.support.MessageConverter = mock ( MessageConverter .class ) ; this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver = new MessageMethodArgumentResolver ( this . org.springframework.messaging.handler.annotation.support.MessageConverter ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<java.lang.String> , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.Integer > org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> = MessageBuilder . withPayload ( NUMBER ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.Integer > org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> = MessageBuilder . withPayload ( NUMBER ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; when ( this . org.springframework.messaging.handler.annotation.support.MessageConverter . fromMessage ( org.springframework.messaging.handler.annotation.support.Message<java.lang.String> , java.lang.Integer .class ) ) . thenReturn ( NUMBER ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.lang.Integer > org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> = ( Message < java.lang.Integer > ) this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; assertNotNull ( org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<java.lang.String> . getHeaders ( ) , org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> . getHeaders ( ) ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.Integer .class . java.lang.String ( ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.String .class . java.lang.String ( ) ) ; this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.Integer .class . java.lang.String ( ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.String .class . java.lang.String ( ) ) ; this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.Integer > org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> = MessageBuilder . withPayload ( NUMBER ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.util.Locale > org.springframework.messaging.handler.annotation.support.Message<java.util.Locale> = MessageBuilder . withPayload ( java.util.Locale . java.util.Locale ( ) ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.Number .class . java.lang.String ( ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.util.Locale .class . java.lang.String ( ) ) ; this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.util.Locale> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ErrorMessage org.springframework.messaging.handler.annotation.support.ErrorMessage = new ErrorMessage ( new java.lang.UnsupportedOperationException ( ) ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.ErrorMessage , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.ErrorMessage ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ErrorMessage org.springframework.messaging.handler.annotation.support.ErrorMessage = new ErrorMessage ( new java.lang.UnsupportedOperationException ( ) ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.ErrorMessage , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.ErrorMessage ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException = new java.lang.UnsupportedOperationException ( ) ; Message < ? extends java.lang.Throwable > org.springframework.messaging.handler.annotation.support.Message<? extends java.lang.Throwable> = new GenericMessage < java.lang.Throwable > ( java.lang.UnsupportedOperationException ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MethodArgumentTypeMismatchException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( ErrorMessage .class . java.lang.String ( ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( GenericMessage .class . java.lang.String ( ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<> , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver = new MessageMethodArgumentResolver ( ) ; Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; assertSame ( org.springframework.messaging.handler.annotation.support.Message<java.lang.String> , this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver = new MessageMethodArgumentResolver ( ) ; Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.Integer .class . java.lang.String ( ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.String .class . java.lang.String ( ) ) ; this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver = new MessageMethodArgumentResolver ( ) ; Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter = new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ; assertTrue ( this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.annotation.support.MethodParameter ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.Integer .class . java.lang.String ( ) ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( java.lang.String .class . java.lang.String ( ) ) ; this . org.springframework.messaging.handler.annotation.support.MessageMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.annotation.support.MethodParameter , org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( Message < ? > org.springframework.messaging.handler.annotation.support.Message<?> , Message < java.lang.Integer > org.springframework.messaging.handler.annotation.support.Message<java.lang.Integer> , Message < java.lang.Number > org.springframework.messaging.handler.annotation.support.Message<java.lang.Number> , Message < ? extends java.lang.Number > org.springframework.messaging.handler.annotation.support.Message<? extends java.lang.Number> , ErrorMessage org.springframework.messaging.handler.annotation.support.ErrorMessage ) {	}  <METHOD_END>
