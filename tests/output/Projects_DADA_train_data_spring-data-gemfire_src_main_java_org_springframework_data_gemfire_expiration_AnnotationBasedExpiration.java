<METHOD_START> public void ( ) { this( null ); }  <METHOD_END>
<METHOD_START> public void ( ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ) { this . org.springframework.data.gemfire.expiration.ExpirationAttributes = org.springframework.data.gemfire.expiration.ExpirationAttributes ; }  <METHOD_END>
<METHOD_START> public static < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> ( ) { return org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> ( null ) ; }  <METHOD_END>
<METHOD_START> public static < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> ( ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ) { return new org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> < K , V > ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) { @ java.lang.Override protected org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData getExpirationMetaData ( Region . Region < K , V > entry ) { return ( boolean ( entry ) ? org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( org.springframework.data.gemfire.expiration.IdleTimeoutExpiration ( entry ) ) : super. getExpirationMetaData ( entry ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData getExpirationMetaData ( Region . Region < K , V > entry ) { return ( boolean ( entry ) ? org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( org.springframework.data.gemfire.expiration.IdleTimeoutExpiration ( entry ) ) : super. getExpirationMetaData ( entry ) ) ; }  <METHOD_END>
<METHOD_START> public static < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> ( ) { return org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> ( null ) ; }  <METHOD_END>
<METHOD_START> public static < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> < K , V > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> ( ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ) { return new org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<K,V> < K , V > ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) { @ java.lang.Override protected org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData getExpirationMetaData ( Region . Region < K , V > entry ) { return ( boolean ( entry ) ? org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( org.springframework.data.gemfire.expiration.TimeToLiveExpiration ( entry ) ) : super. getExpirationMetaData ( entry ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData getExpirationMetaData ( Region . Region < K , V > entry ) { return ( boolean ( entry ) ? org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( org.springframework.data.gemfire.expiration.TimeToLiveExpiration ( entry ) ) : super. getExpirationMetaData ( entry ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { BeanFactory org.springframework.data.gemfire.expiration.BeanFactory = org.springframework.data.gemfire.expiration.BeanFactory ( ) ; if ( java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.StandardEvaluationContext> . compareAndSet ( null , org.springframework.data.gemfire.expiration.StandardEvaluationContext ( ) ) ) { StandardEvaluationContext org.springframework.data.gemfire.expiration.StandardEvaluationContext = java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.StandardEvaluationContext> . get ( ) ; org.springframework.data.gemfire.expiration.StandardEvaluationContext . addPropertyAccessor ( new BeanFactoryAccessor ( ) ) ; org.springframework.data.gemfire.expiration.StandardEvaluationContext . addPropertyAccessor ( new EnvironmentAccessor ( ) ) ; org.springframework.data.gemfire.expiration.StandardEvaluationContext . addPropertyAccessor ( new MapAccessor ( ) ) ; if ( org.springframework.data.gemfire.expiration.BeanFactory instanceof ConfigurableBeanFactory ) { ConfigurableBeanFactory org.springframework.data.gemfire.expiration.ConfigurableBeanFactory = ( ConfigurableBeanFactory ) org.springframework.data.gemfire.expiration.BeanFactory ; ConversionService org.springframework.data.gemfire.expiration.ConversionService = org.springframework.data.gemfire.expiration.ConfigurableBeanFactory . getConversionService ( ) ; if ( org.springframework.data.gemfire.expiration.ConversionService != null ) { org.springframework.data.gemfire.expiration.StandardEvaluationContext . setTypeConverter ( new StandardTypeConverter ( org.springframework.data.gemfire.expiration.ConversionService ) ) ; } org.springframework.data.gemfire.expiration.StandardEvaluationContext . setTypeLocator ( new StandardTypeLocator ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory . getBeanClassLoader ( ) ) ) ; } } java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.StandardEvaluationContext> . get ( ) . setBeanResolver ( new BeanFactoryResolver ( org.springframework.data.gemfire.expiration.BeanFactory ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.expiration.StandardEvaluationContext org.springframework.data.gemfire.expiration.StandardEvaluationContext ( ) { return new StandardEvaluationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.data.gemfire.expiration.BeanFactory ) throws org.springframework.data.gemfire.expiration.BeansException { java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.BeanFactory> . set ( org.springframework.data.gemfire.expiration.BeanFactory ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.expiration.BeanFactory org.springframework.data.gemfire.expiration.BeanFactory ( ) { BeanFactory org.springframework.data.gemfire.expiration.BeanFactory = java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.BeanFactory> . get ( ) ; Assert . state ( org.springframework.data.gemfire.expiration.BeanFactory != null , STRING ) ; return org.springframework.data.gemfire.expiration.BeanFactory ; }  <METHOD_END>
<METHOD_START> public void void ( ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ) { this . org.springframework.data.gemfire.expiration.ExpirationAttributes = org.springframework.data.gemfire.expiration.ExpirationAttributes ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.expiration.ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ( ) { return org.springframework.data.gemfire.expiration.ExpirationAttributes ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public ExpirationAttributes getExpiry ( Region . Region < K , V > entry ) { return org.springframework.data.gemfire.expiration.ExpirationAttributes ( getExpirationMetaData ( entry ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData getExpirationMetaData ( Region . Region < K , V > entry ) { return ( boolean ( entry ) ? org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( org.springframework.data.gemfire.expiration.Expiration ( entry ) ) : null ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.expiration.ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ) { return ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData != null ? org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.ExpirationAttributes ( ) : org.springframework.data.gemfire.expiration.ExpirationAttributes ( ) ) ; }  <METHOD_END>
<METHOD_START> protected boolean isExpirationConfigured ( Region . Region < K , V > entry ) { return ( entry != null && boolean ( entry . getValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Object java.lang.Object ) { return boolean ( java.lang.Object , Expiration .class ) ; }  <METHOD_END>
<METHOD_START> protected Expiration getExpiration ( Region . Region < K , V > entry ) { return org.springframework.data.gemfire.expiration.Expiration ( entry . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.gemfire.expiration.Expiration org.springframework.data.gemfire.expiration.Expiration ( java.lang.Object java.lang.Object ) { return T ( java.lang.Object , Expiration .class ) ; }  <METHOD_END>
<METHOD_START> protected boolean isIdleTimeoutConfigured ( Region . Region < K , V > entry ) { return ( entry != null && boolean ( entry . getValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Object java.lang.Object ) { return boolean ( java.lang.Object , IdleTimeoutExpiration .class ) ; }  <METHOD_END>
<METHOD_START> protected IdleTimeoutExpiration getIdleTimeout ( Region . Region < K , V > entry ) { return org.springframework.data.gemfire.expiration.IdleTimeoutExpiration ( entry . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.gemfire.expiration.IdleTimeoutExpiration org.springframework.data.gemfire.expiration.IdleTimeoutExpiration ( java.lang.Object java.lang.Object ) { return T ( java.lang.Object , IdleTimeoutExpiration .class ) ; }  <METHOD_END>
<METHOD_START> protected boolean isTimeToLiveConfigured ( Region . Region < K , V > entry ) { return ( entry != null && boolean ( entry . getValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Object java.lang.Object ) { return boolean ( java.lang.Object , TimeToLiveExpiration .class ) ; }  <METHOD_END>
<METHOD_START> protected TimeToLiveExpiration getTimeToLive ( Region . Region < K , V > entry ) { return org.springframework.data.gemfire.expiration.TimeToLiveExpiration ( entry . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.gemfire.expiration.TimeToLiveExpiration org.springframework.data.gemfire.expiration.TimeToLiveExpiration ( java.lang.Object java.lang.Object ) { return T ( java.lang.Object , TimeToLiveExpiration .class ) ; }  <METHOD_END>
<METHOD_START> private < T extends java.lang.annotation.Annotation > boolean boolean ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { return ( java.lang.Object != null && java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( java.lang.Class<T> ) ) ; }  <METHOD_END>
<METHOD_START> private < T extends java.lang.annotation.Annotation > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { return AnnotationUtils . getAnnotation ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {	}  <METHOD_END>
<METHOD_START> protected void ( int int , ExpirationActionType org.springframework.data.gemfire.expiration.ExpirationActionType ) { this . int = int ; this . org.springframework.data.gemfire.expiration.ExpirationActionType = org.springframework.data.gemfire.expiration.ExpirationActionType ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ) { return new org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getTimeout ( ) , ExpirationActionType . valueOf ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getAction ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( Expiration org.springframework.data.gemfire.expiration.Expiration ) { return new org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( int ( org.springframework.data.gemfire.expiration.Expiration . timeout ( ) ) , org.springframework.data.gemfire.expiration.ExpirationActionType ( org.springframework.data.gemfire.expiration.Expiration . action ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( IdleTimeoutExpiration org.springframework.data.gemfire.expiration.IdleTimeoutExpiration ) { return new org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( int ( org.springframework.data.gemfire.expiration.IdleTimeoutExpiration . timeout ( ) ) , org.springframework.data.gemfire.expiration.ExpirationActionType ( org.springframework.data.gemfire.expiration.IdleTimeoutExpiration . action ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( TimeToLiveExpiration org.springframework.data.gemfire.expiration.TimeToLiveExpiration ) { return new org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ( int ( org.springframework.data.gemfire.expiration.TimeToLiveExpiration . timeout ( ) ) , org.springframework.data.gemfire.expiration.ExpirationActionType ( org.springframework.data.gemfire.expiration.TimeToLiveExpiration . action ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.expiration.ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ( ) { return new ExpirationAttributes ( int ( ) , org.springframework.data.gemfire.expiration.ExpirationAction ( ) ) ; }  <METHOD_END>
<METHOD_START> protected static int int ( java.lang.String java.lang.String ) { try { return java.lang.Integer . int ( java.lang.String ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { try { return new SpelExpressionParser ( ) . parseExpression ( java.lang.String ) . getValue ( java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.StandardEvaluationContext> . get ( ) , java.lang.Integer . java.lang.Class<java.lang.Integer> ) ; } catch ( ParseException org.springframework.data.gemfire.expiration.ParseException ) { if ( java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.BeanFactory> . get ( ) instanceof ConfigurableBeanFactory ) { return java.lang.Integer . int ( ( ( ConfigurableBeanFactory ) java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.BeanFactory> . get ( ) ) . resolveEmbeddedValue ( java.lang.String ) ) ; } throw java.lang.NumberFormatException ; } } }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.expiration.ExpirationActionType org.springframework.data.gemfire.expiration.ExpirationActionType ( java.lang.String java.lang.String ) { try { return ExpirationActionType . valueOf ( org.springframework.data.gemfire.expiration.ExpirationActionConverter . convert ( java.lang.String ) ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { EvaluationException org.springframework.data.gemfire.expiration.EvaluationException = new EvaluationException ( java.lang.String . java.lang.String ( STRING , java.lang.String ) , java.lang.IllegalArgumentException ) ; EvaluationContext org.springframework.data.gemfire.expiration.EvaluationContext = java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.StandardEvaluationContext> . get ( ) ; try { Expression org.springframework.data.gemfire.expiration.Expression = new SpelExpressionParser ( ) . parseExpression ( java.lang.String ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.gemfire.expiration.Expression . getValueType ( org.springframework.data.gemfire.expiration.EvaluationContext ) ; if ( java.lang.String .class . boolean ( java.lang.Class<> ) ) { return ExpirationActionType . valueOf ( org.springframework.data.gemfire.expiration.ExpirationActionConverter . convert ( org.springframework.data.gemfire.expiration.Expression . getValue ( org.springframework.data.gemfire.expiration.EvaluationContext , java.lang.String .class ) ) ) ; } else if ( ExpirationAction .class . boolean ( java.lang.Class<> ) ) { return ExpirationActionType . valueOf ( org.springframework.data.gemfire.expiration.Expression . getValue ( org.springframework.data.gemfire.expiration.EvaluationContext , ExpirationAction .class ) ) ; } else if ( ExpirationActionType .class . boolean ( java.lang.Class<> ) ) { return org.springframework.data.gemfire.expiration.Expression . getValue ( org.springframework.data.gemfire.expiration.EvaluationContext , ExpirationActionType .class ) ; } throw org.springframework.data.gemfire.expiration.EvaluationException ; } catch ( ParseException org.springframework.data.gemfire.expiration.ParseException ) { if ( java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.BeanFactory> . get ( ) instanceof ConfigurableBeanFactory ) { try { java.lang.String java.lang.String = ( ( ConfigurableBeanFactory ) java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.expiration.BeanFactory> . get ( ) ) . resolveEmbeddedValue ( java.lang.String ) ; return ExpirationActionType . valueOf ( org.springframework.data.gemfire.expiration.ExpirationActionConverter . convert ( java.lang.String ) ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {						} } throw org.springframework.data.gemfire.expiration.EvaluationException ; } } }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.expiration.ExpirationActionType org.springframework.data.gemfire.expiration.ExpirationActionType ( ) { return org.springframework.data.gemfire.expiration.ExpirationActionType ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.expiration.ExpirationAction org.springframework.data.gemfire.expiration.ExpirationAction ( ) { return org.springframework.data.gemfire.expiration.ExpirationActionType ( ) . getExpirationAction ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( final java.lang.Object java.lang.Object ) { if ( java.lang.Object == this ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ) ) { return false ; } org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData = ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData ) java.lang.Object ; return ( this . int ( ) == org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . int ( ) && ObjectUtils . nullSafeEquals ( this . org.springframework.data.gemfire.expiration.ExpirationActionType ( ) , org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData . org.springframework.data.gemfire.expiration.ExpirationActionType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = NUMBER ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( int ( ) ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( org.springframework.data.gemfire.expiration.ExpirationActionType ( ) ) ; return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , java.lang.Class<? extends org.springframework.data.gemfire.expiration.AnnotationBasedExpiration.ExpirationMetaData> ( ) . java.lang.String ( ) , int ( ) , org.springframework.data.gemfire.expiration.ExpirationActionType ( ) ) ; }  <METHOD_END>
