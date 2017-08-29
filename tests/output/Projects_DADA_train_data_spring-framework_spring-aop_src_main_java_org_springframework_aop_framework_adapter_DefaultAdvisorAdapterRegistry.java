<METHOD_START> public void ( ) { void ( new MethodBeforeAdviceAdapter ( ) ) ; void ( new AfterReturningAdviceAdapter ( ) ) ; void ( new ThrowsAdviceAdapter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.framework.adapter.Advisor org.springframework.aop.framework.adapter.Advisor ( java.lang.Object java.lang.Object ) throws org.springframework.aop.framework.adapter.UnknownAdviceTypeException { if ( java.lang.Object instanceof Advisor ) { return ( Advisor ) java.lang.Object ; } if ( ! ( java.lang.Object instanceof Advice ) ) { throw new UnknownAdviceTypeException ( java.lang.Object ) ; } Advice org.springframework.aop.framework.adapter.Advice = ( Advice ) java.lang.Object ; if ( org.springframework.aop.framework.adapter.Advice instanceof MethodInterceptor ) { return new DefaultPointcutAdvisor ( org.springframework.aop.framework.adapter.Advice ) ; } for ( AdvisorAdapter org.springframework.aop.framework.adapter.AdvisorAdapter : this . java.util.List<org.springframework.aop.framework.adapter.AdvisorAdapter> ) { if ( org.springframework.aop.framework.adapter.AdvisorAdapter . supportsAdvice ( org.springframework.aop.framework.adapter.Advice ) ) { return new DefaultPointcutAdvisor ( org.springframework.aop.framework.adapter.Advice ) ; } } throw new UnknownAdviceTypeException ( org.springframework.aop.framework.adapter.Advice ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.framework.adapter.MethodInterceptor [] org.springframework.aop.framework.adapter.MethodInterceptor[] ( Advisor org.springframework.aop.framework.adapter.Advisor ) throws org.springframework.aop.framework.adapter.UnknownAdviceTypeException { java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> < MethodInterceptor > java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> = new java.util.ArrayList<org.springframework.aop.framework.adapter.MethodInterceptor> <> ( NUMBER ) ; Advice org.springframework.aop.framework.adapter.Advice = org.springframework.aop.framework.adapter.Advisor . getAdvice ( ) ; if ( org.springframework.aop.framework.adapter.Advice instanceof MethodInterceptor ) { java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> . add ( ( MethodInterceptor ) org.springframework.aop.framework.adapter.Advice ) ; } for ( AdvisorAdapter org.springframework.aop.framework.adapter.AdvisorAdapter : this . java.util.List<org.springframework.aop.framework.adapter.AdvisorAdapter> ) { if ( org.springframework.aop.framework.adapter.AdvisorAdapter . supportsAdvice ( org.springframework.aop.framework.adapter.Advice ) ) { java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> . add ( org.springframework.aop.framework.adapter.AdvisorAdapter . getInterceptor ( org.springframework.aop.framework.adapter.Advisor ) ) ; } } if ( java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> . isEmpty ( ) ) { throw new UnknownAdviceTypeException ( org.springframework.aop.framework.adapter.Advisor . getAdvice ( ) ) ; } return java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> . toArray ( new MethodInterceptor [ java.util.List<org.springframework.aop.framework.adapter.MethodInterceptor> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AdvisorAdapter org.springframework.aop.framework.adapter.AdvisorAdapter ) { this . java.util.List<org.springframework.aop.framework.adapter.AdvisorAdapter> . add ( org.springframework.aop.framework.adapter.AdvisorAdapter ) ; }  <METHOD_END>