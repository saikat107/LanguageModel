<METHOD_START> public static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = null ; DirectFieldAccessor org.springframework.integration.test.util.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; java.lang.String [] java.lang.String[] = java.lang.String . java.lang.String[] ( STRING ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { java.lang.Object = org.springframework.integration.test.util.DirectFieldAccessor . getPropertyValue ( java.lang.String[] [ int ] ) ; if ( java.lang.Object != null ) { org.springframework.integration.test.util.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; } else if ( int == java.lang.String[] . int - NUMBER ) { return null ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String[] [ int ] + STRING ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public static < T > T T ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object , java.lang.String ) ; if ( java.lang.Object != null ) { Assert . isAssignable ( java.lang.Class<T> , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } return ( T ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.test.util.TestUtils.TestApplicationContext org.springframework.integration.test.util.TestUtils.TestApplicationContext ( ) { org.springframework.integration.test.util.TestUtils.TestApplicationContext org.springframework.integration.test.util.TestUtils.TestApplicationContext = new org.springframework.integration.test.util.TestUtils.TestApplicationContext ( ) ; ErrorHandler org.springframework.integration.test.util.ErrorHandler = new org.springframework.integration.test.util.TestUtils.MessagePublishingErrorHandler ( org.springframework.integration.test.util.TestUtils.TestApplicationContext ) ; ThreadPoolTaskScheduler org.springframework.integration.test.util.ThreadPoolTaskScheduler = org.springframework.integration.test.util.ThreadPoolTaskScheduler ( NUMBER ) ; org.springframework.integration.test.util.ThreadPoolTaskScheduler . setErrorHandler ( org.springframework.integration.test.util.ErrorHandler ) ; void ( STRING , org.springframework.integration.test.util.ThreadPoolTaskScheduler , org.springframework.integration.test.util.TestUtils.TestApplicationContext ) ; void ( STRING , new DefaultFormattingConversionService ( ) , org.springframework.integration.test.util.TestUtils.TestApplicationContext ) ; return org.springframework.integration.test.util.TestUtils.TestApplicationContext ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.test.util.ThreadPoolTaskScheduler org.springframework.integration.test.util.ThreadPoolTaskScheduler ( int int ) { ThreadPoolTaskScheduler org.springframework.integration.test.util.ThreadPoolTaskScheduler = new ThreadPoolTaskScheduler ( ) ; org.springframework.integration.test.util.ThreadPoolTaskScheduler . setPoolSize ( int ) ; org.springframework.integration.test.util.ThreadPoolTaskScheduler . setRejectedExecutionHandler ( new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy ( ) ) ; org.springframework.integration.test.util.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; return org.springframework.integration.test.util.ThreadPoolTaskScheduler ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , BeanFactory org.springframework.integration.test.util.BeanFactory ) { Assert . notNull ( java.lang.String , STRING ) ; ConfigurableListableBeanFactory org.springframework.integration.test.util.ConfigurableListableBeanFactory = null ; if ( org.springframework.integration.test.util.BeanFactory instanceof ConfigurableListableBeanFactory ) { org.springframework.integration.test.util.ConfigurableListableBeanFactory = ( ConfigurableListableBeanFactory ) org.springframework.integration.test.util.BeanFactory ; } else if ( org.springframework.integration.test.util.BeanFactory instanceof GenericApplicationContext ) { org.springframework.integration.test.util.ConfigurableListableBeanFactory = ( ( GenericApplicationContext ) org.springframework.integration.test.util.BeanFactory ) . getBeanFactory ( ) ; } if ( java.lang.Object instanceof BeanNameAware ) { ( ( BeanNameAware ) java.lang.Object ) . setBeanName ( java.lang.String ) ; } if ( java.lang.Object instanceof BeanFactoryAware ) { ( ( BeanFactoryAware ) java.lang.Object ) . setBeanFactory ( org.springframework.integration.test.util.BeanFactory ) ; } if ( java.lang.Object instanceof InitializingBean ) { try { ( ( InitializingBean ) java.lang.Object ) . afterPropertiesSet ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new FatalBeanException ( STRING , java.lang.Exception ) ; } } org.springframework.integration.test.util.ConfigurableListableBeanFactory . registerSingleton ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , final MessageChannel org.springframework.integration.test.util.MessageChannel ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.integration.test.util.MessageChannel ) ; if ( java.lang.String != null ) { if ( java.lang.String == null ) { java.lang.String = java.lang.String ; } else { Assert . isTrue ( java.lang.String . boolean ( java.lang.String ) , STRING ) ; } } org.springframework.integration.test.util.TestUtils . void ( java.lang.String , org.springframework.integration.test.util.MessageChannel , this ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { org.springframework.integration.test.util.TestUtils . void ( java.lang.String , java.lang.Object , this ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { org.springframework.integration.test.util.TestUtils . void ( java.lang.String , java.lang.Object , this ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( final MessageChannel org.springframework.integration.test.util.MessageChannel ) { java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> = ClassUtils . getAllInterfacesAsSet ( org.springframework.integration.test.util.MessageChannel ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = new java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.util.Set<java.lang.Class<?>> ) { if ( STRING . boolean ( java.lang.Class<> . java.lang.String ( ) ) ) { ReflectionUtils . doWithMethods ( org.springframework.integration.test.util.MessageChannel . getClass ( ) , method -> { try { componentName . set ( ( String ) method . invoke ( channel , new Object [ NUMBER ] ) ) ; } catch ( InvocationTargetException e ) { throw new IllegalArgumentException ( e ) ; } } , method -> method . getName ( ) . equals ( STRING ) ) ; break; } } return java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.util.Properties java.util.Properties ( java.util.List<java.util.Properties> < java.util.Properties > java.util.List<java.util.Properties> , java.lang.String java.lang.String , int int ) { Assert . notNull ( java.util.List<java.util.Properties> , STRING ) ; Assert . isTrue ( StringUtils . hasText ( java.lang.String ) , STRING ) ; Assert . isTrue ( int < java.util.List<java.util.Properties> . int ( ) , STRING ) ; java.util.Properties java.util.Properties = null ; for ( int int = int ; int < java.util.List<java.util.Properties> . int ( ) ; int ++ ) { java.util.Properties java.util.Properties = java.util.List<java.util.Properties> . java.util.Properties ( int ) ; if ( java.lang.String . boolean ( java.util.Properties . java.lang.Object ( STRING ) ) ) { java.util.Properties = java.util.Properties ; break; } } return java.util.Properties ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( STRING , java . util . regex . java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> void ( org.springframework.integration.test.util.TestUtils.TestApplicationContext org.springframework.integration.test.util.TestUtils.TestApplicationContext ) { this . org.springframework.integration.test.util.TestUtils.TestApplicationContext = org.springframework.integration.test.util.TestUtils.TestApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { MessageChannel org.springframework.integration.test.util.MessageChannel = this . org.springframework.integration.test.util.MessageChannel ( java.lang.Throwable ) ; boolean boolean = false ; if ( org.springframework.integration.test.util.MessageChannel != null ) { try { boolean = org.springframework.integration.test.util.MessageChannel . send ( new ErrorMessage ( java.lang.Throwable ) , NUMBER ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { if ( org.springframework.integration.test.util.Log . isWarnEnabled ( ) ) { org.springframework.integration.test.util.Log . warn ( STRING , java.lang.Throwable ) ; } if ( java.lang.Throwable instanceof java.lang.Error ) { throw ( ( java.lang.Error ) java.lang.Throwable ) ; } } } if ( ! boolean && org.springframework.integration.test.util.Log . isErrorEnabled ( ) ) { Message < ? > org.springframework.integration.test.util.Message<?> = ( java.lang.Throwable instanceof MessagingException ) ? ( ( MessagingException ) java.lang.Throwable ) . getFailedMessage ( ) : null ; if ( org.springframework.integration.test.util.Message<> != null ) { org.springframework.integration.test.util.Log . error ( STRING + org.springframework.integration.test.util.Message<> , java.lang.Throwable ) ; } else { org.springframework.integration.test.util.Log . error ( STRING , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.test.util.MessageChannel org.springframework.integration.test.util.MessageChannel ( java.lang.Throwable java.lang.Throwable ) { if ( java.lang.Throwable instanceof MessagingException ) { Message < ? > org.springframework.integration.test.util.Message<?> = ( ( MessagingException ) java.lang.Throwable ) . getFailedMessage ( ) ; java.lang.Object java.lang.Object = org.springframework.integration.test.util.Message<> . getHeaders ( ) . getErrorChannel ( ) ; if ( java.lang.Object instanceof MessageChannel ) { return ( MessageChannel ) java.lang.Object ; } Assert . isInstanceOf ( java.lang.String .class , java.lang.Object , STRING + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) + STRING ) ; return this . org.springframework.integration.test.util.TestUtils.TestApplicationContext . getBean ( ( java.lang.String ) java.lang.Object , MessageChannel .class ) ; } else { return null ; } }  <METHOD_END>
