<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; GenericConversionService org.springframework.messaging.handler.annotation.support.GenericConversionService = new GenericConversionService ( ) ; org.springframework.messaging.handler.annotation.support.GenericConversionService . addConverter ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean .class , java.lang.String .class , new Converter < org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean ) { return STRING ; } } ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setConversionService ( org.springframework.messaging.handler.annotation.support.GenericConversionService ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.lang.String .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( MessageBuilder . withPayload ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean ) . build ( ) ) ; void ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; GenericConversionService org.springframework.messaging.handler.annotation.support.GenericConversionService = new GenericConversionService ( ) ; assertFalse ( STRING , org.springframework.messaging.handler.annotation.support.GenericConversionService . canConvert ( java.lang.Integer .class , java.lang.String .class ) ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setConversionService ( org.springframework.messaging.handler.annotation.support.GenericConversionService ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.lang.String .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( MessageBuilder . withPayload ( NUMBER ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; MessageConverter org.springframework.messaging.handler.annotation.support.MessageConverter = new ByteArrayMessageConverter ( ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setMessageConverter ( org.springframework.messaging.handler.annotation.support.MessageConverter ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.lang.String .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MessageConversionException .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( MessageBuilder . withPayload ( NUMBER ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> = new java.util.ArrayList<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> <> ( ) ; java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> . add ( new org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.CustomHandlerMethodArgumentResolver ( ) ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setCustomArgumentResolvers ( java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.util.Locale .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( MessageBuilder . withPayload ( NUMBER ) . build ( ) ) ; void ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> = new java.util.ArrayList<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> <> ( ) ; java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> . add ( new org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.CustomHandlerMethodArgumentResolver ( ) ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setArgumentResolvers ( java.util.List<org.springframework.messaging.handler.annotation.support.HandlerMethodArgumentResolver> ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; Message < java.lang.String > org.springframework.messaging.handler.annotation.support.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.util.Locale .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; void ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , STRING ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.lang.String .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MethodArgumentResolutionException .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( org.springframework.messaging.handler.annotation.support.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.lang.String .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; void ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setValidator ( new Validator ( ) { @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.String .class . boolean ( java.lang.Class<> ) ; } @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.messaging.handler.annotation.support.Errors ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; if ( STRING . boolean ( java.lang.String ) ) { org.springframework.messaging.handler.annotation.support.Errors . reject ( STRING ) ; } } } ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod = org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , STRING , java.lang.String .class ) ; org.springframework.messaging.handler.annotation.support.ExpectedException . expect ( MethodArgumentNotValidException .class ) ; org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod . invoke ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.String .class . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.messaging.handler.annotation.support.Errors ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; if ( STRING . boolean ( java.lang.String ) ) { org.springframework.messaging.handler.annotation.support.Errors . reject ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private void void ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , java.lang.String java.lang.String ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean . java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod org.springframework.messaging.handler.annotation.support.InvocableHandlerMethod ( DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { return org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . createInvocableHandlerMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean , java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ( ) { DefaultMessageHandlerMethodFactory org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory = new DefaultMessageHandlerMethodFactory ( ) ; org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory . setBeanFactory ( new StaticListableBeanFactory ( ) ) ; return org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method java.lang.reflect.Method ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactoryTests.SampleBean .class , java.lang.String , java.lang.Class<?>[] ) ; assertNotNull ( STRING + java.lang.String + STRING + java.util.Arrays . java.lang.String ( java.lang.Class<?>[] ) ) ; return java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Payload @ Valid java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Locale java.util.Locale ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertEquals ( STRING , java.util.Locale . java.util.Locale ( ) , java.util.Locale ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter ) { return org.springframework.messaging.handler.annotation.support.MethodParameter . getParameterType ( ) . isAssignableFrom ( java.util.Locale .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodParameter org.springframework.messaging.handler.annotation.support.MethodParameter , Message < ? > org.springframework.messaging.handler.annotation.support.Message<?> ) throws java.lang.Exception { return java.util.Locale . java.util.Locale ( ) ; }  <METHOD_END>