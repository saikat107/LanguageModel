<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String [] java.lang.String[] , java.lang.Class<?> < ? > [] java.lang.Class<?>[] ) { this . java.lang.Class<?> = java.lang.Class<> ; if ( java.lang.String[] . int != java.lang.Class<?>[] . int ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . java.lang.String[] = java.lang.String[] ; this . java.lang.Class<?>[] = java.lang.Class<?>[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { this . java.lang.Class<?>[] = java.lang.Class<?>[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.aop.aspectj.BeanFactory ) { this . org.springframework.aop.aspectj.BeanFactory = org.springframework.aop.aspectj.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.aspectj.ClassFilter org.springframework.aop.aspectj.ClassFilter ( ) { void ( ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.aspectj.MethodMatcher org.springframework.aop.aspectj.MethodMatcher ( ) { void ( ) ; return this ; }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( getExpression ( ) == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } if ( this . org.springframework.aop.aspectj.PointcutExpression == null ) { this . java.lang.ClassLoader = java.lang.ClassLoader ( ) ; this . org.springframework.aop.aspectj.PointcutExpression = org.springframework.aop.aspectj.PointcutExpression ( this . java.lang.ClassLoader ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.ClassLoader java.lang.ClassLoader ( ) { if ( this . org.springframework.aop.aspectj.BeanFactory instanceof ConfigurableBeanFactory ) { return ( ( ConfigurableBeanFactory ) this . org.springframework.aop.aspectj.BeanFactory ) . getBeanClassLoader ( ) ; } if ( this . java.lang.Class<> != null ) { return this . java.lang.Class<> . java.lang.ClassLoader ( ) ; } return ClassUtils . getDefaultClassLoader ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.PointcutExpression org.springframework.aop.aspectj.PointcutExpression ( java.lang.ClassLoader java.lang.ClassLoader ) { PointcutParser org.springframework.aop.aspectj.PointcutParser = org.springframework.aop.aspectj.PointcutParser ( java.lang.ClassLoader ) ; PointcutParameter [] org.springframework.aop.aspectj.PointcutParameter[] = new PointcutParameter [ this . java.lang.String[] . int ] ; for ( int int = NUMBER ; int < pointcutParameters . length ; int ++ ) { org.springframework.aop.aspectj.PointcutParameter[] [ int ] = org.springframework.aop.aspectj.PointcutParser . createPointcutParameter ( this . java.lang.String[] [ int ] , this . java.lang.Class<?>[] [ int ] ) ; } return org.springframework.aop.aspectj.PointcutParser . parsePointcutExpression ( java.lang.String ( getExpression ( ) ) , this . java.lang.Class<> , org.springframework.aop.aspectj.PointcutParameter[] ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.PointcutParser org.springframework.aop.aspectj.PointcutParser ( java.lang.ClassLoader java.lang.ClassLoader ) { PointcutParser org.springframework.aop.aspectj.PointcutParser = PointcutParser . getPointcutParserSupportingSpecifiedPrimitivesAndUsingSpecifiedClassLoaderForResolution ( java.util.Set<org.springframework.aop.aspectj.PointcutPrimitive> , java.lang.ClassLoader ) ; org.springframework.aop.aspectj.PointcutParser . registerPointcutDesignatorHandler ( new org.springframework.aop.aspectj.AspectJExpressionPointcut.BeanPointcutDesignatorHandler ( ) ) ; return org.springframework.aop.aspectj.PointcutParser ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = StringUtils . replace ( java.lang.String , STRING , STRING ) ; java.lang.String = StringUtils . replace ( java.lang.String , STRING , STRING ) ; java.lang.String = StringUtils . replace ( java.lang.String , STRING , STRING ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.aop.aspectj.PointcutExpression org.springframework.aop.aspectj.PointcutExpression ( ) { void ( ) ; return this . org.springframework.aop.aspectj.PointcutExpression ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { void ( ) ; try { try { return this . org.springframework.aop.aspectj.PointcutExpression . couldMatchJoinPointsInType ( java.lang.Class<> ) ; } catch ( ReflectionWorldException org.springframework.aop.aspectj.ReflectionWorldException ) { org.springframework.aop.aspectj.Log . debug ( STRING , org.springframework.aop.aspectj.ReflectionWorldException ) ; PointcutExpression org.springframework.aop.aspectj.PointcutExpression = org.springframework.aop.aspectj.PointcutExpression ( java.lang.Class<> ) ; if ( org.springframework.aop.aspectj.PointcutExpression != null ) { return org.springframework.aop.aspectj.PointcutExpression . couldMatchJoinPointsInType ( java.lang.Class<> ) ; } } } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.aop.aspectj.Log . debug ( STRING , java.lang.Throwable ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> , boolean boolean ) { void ( ) ; java.lang.reflect.Method java.lang.reflect.Method = AopUtils . getMostSpecificMethod ( java.lang.reflect.Method , java.lang.Class<> ) ; ShadowMatch org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.ShadowMatch ( java.lang.reflect.Method , java.lang.reflect.Method ) ; if ( org.springframework.aop.aspectj.ShadowMatch . alwaysMatches ( ) ) { return true ; } else if ( org.springframework.aop.aspectj.ShadowMatch . neverMatches ( ) ) { return false ; } else { if ( boolean ) { return true ; } RuntimeTestWalker org.springframework.aop.aspectj.RuntimeTestWalker = org.springframework.aop.aspectj.RuntimeTestWalker ( org.springframework.aop.aspectj.ShadowMatch ) ; return ( ! org.springframework.aop.aspectj.RuntimeTestWalker . testsSubtypeSensitiveVars ( ) || org.springframework.aop.aspectj.RuntimeTestWalker . testTargetInstanceOfResidue ( java.lang.Class<> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> ) { return boolean ( java.lang.reflect.Method , java.lang.Class<> , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { void ( ) ; return this . org.springframework.aop.aspectj.PointcutExpression . mayNeedDynamicTest ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Object ... java.lang.Object[] ) { void ( ) ; ShadowMatch org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.ShadowMatch ( AopUtils . getMostSpecificMethod ( java.lang.reflect.Method , java.lang.Class<> ) , java.lang.reflect.Method ) ; ShadowMatch org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.ShadowMatch ( java.lang.reflect.Method , java.lang.reflect.Method ) ; ProxyMethodInvocation org.springframework.aop.aspectj.ProxyMethodInvocation = null ; java.lang.Object java.lang.Object = null ; java.lang.Object java.lang.Object = null ; try { MethodInvocation org.springframework.aop.aspectj.MethodInvocation = ExposeInvocationInterceptor . currentInvocation ( ) ; java.lang.Object = org.springframework.aop.aspectj.MethodInvocation . getThis ( ) ; if ( ! ( org.springframework.aop.aspectj.MethodInvocation instanceof ProxyMethodInvocation ) ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.aop.aspectj.MethodInvocation ) ; } org.springframework.aop.aspectj.ProxyMethodInvocation = ( ProxyMethodInvocation ) org.springframework.aop.aspectj.MethodInvocation ; java.lang.Object = org.springframework.aop.aspectj.ProxyMethodInvocation . getProxy ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { if ( org.springframework.aop.aspectj.Log . isDebugEnabled ( ) ) { org.springframework.aop.aspectj.Log . debug ( STRING + java.lang.IllegalStateException ) ; } } try { JoinPointMatch org.springframework.aop.aspectj.JoinPointMatch = org.springframework.aop.aspectj.ShadowMatch . matchesJoinPoint ( java.lang.Object , java.lang.Object , java.lang.Object[] ) ; if ( org.springframework.aop.aspectj.ProxyMethodInvocation != null ) { RuntimeTestWalker org.springframework.aop.aspectj.RuntimeTestWalker = org.springframework.aop.aspectj.RuntimeTestWalker ( org.springframework.aop.aspectj.ShadowMatch ) ; if ( ! org.springframework.aop.aspectj.RuntimeTestWalker . testThisInstanceOfResidue ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { return false ; } if ( org.springframework.aop.aspectj.JoinPointMatch . matches ( ) ) { void ( org.springframework.aop.aspectj.ProxyMethodInvocation , org.springframework.aop.aspectj.JoinPointMatch ) ; } } return org.springframework.aop.aspectj.JoinPointMatch . matches ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { if ( org.springframework.aop.aspectj.Log . isDebugEnabled ( ) ) { org.springframework.aop.aspectj.Log . debug ( STRING + java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ) + STRING , java.lang.Throwable ) ; } return false ; } }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return ProxyCreationContext . getCurrentProxiedBeanName ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.PointcutExpression org.springframework.aop.aspectj.PointcutExpression ( java.lang.Class<?> < ? > java.lang.Class<?> ) { try { java.lang.ClassLoader java.lang.ClassLoader = java.lang.Class<> . java.lang.ClassLoader ( ) ; if ( java.lang.ClassLoader != null && java.lang.ClassLoader != this . java.lang.ClassLoader ) { return org.springframework.aop.aspectj.PointcutExpression ( java.lang.ClassLoader ) ; } } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.aop.aspectj.Log . debug ( STRING , java.lang.Throwable ) ; } return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.RuntimeTestWalker org.springframework.aop.aspectj.RuntimeTestWalker ( ShadowMatch org.springframework.aop.aspectj.ShadowMatch ) { if ( org.springframework.aop.aspectj.ShadowMatch instanceof org.springframework.aop.aspectj.AspectJExpressionPointcut.DefensiveShadowMatch ) { return new RuntimeTestWalker ( ( ( org.springframework.aop.aspectj.AspectJExpressionPointcut.DefensiveShadowMatch ) org.springframework.aop.aspectj.ShadowMatch ) . org.springframework.aop.aspectj.ShadowMatch ) ; } return new RuntimeTestWalker ( org.springframework.aop.aspectj.ShadowMatch ) ; }  <METHOD_END>
<METHOD_START> private void void ( ProxyMethodInvocation org.springframework.aop.aspectj.ProxyMethodInvocation , JoinPointMatch org.springframework.aop.aspectj.JoinPointMatch ) { org.springframework.aop.aspectj.ProxyMethodInvocation . setUserAttribute ( getExpression ( ) , org.springframework.aop.aspectj.JoinPointMatch ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.ShadowMatch org.springframework.aop.aspectj.ShadowMatch ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.reflect.Method java.lang.reflect.Method ) { ShadowMatch org.springframework.aop.aspectj.ShadowMatch = this . java.util.Map<java.lang.reflect.Method,org.springframework.aop.aspectj.ShadowMatch> . get ( java.lang.reflect.Method ) ; if ( org.springframework.aop.aspectj.ShadowMatch == null ) { synchronized ( this . java.util.Map<java.lang.reflect.Method,org.springframework.aop.aspectj.ShadowMatch> ) { PointcutExpression org.springframework.aop.aspectj.PointcutExpression = null ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.reflect.Method ; org.springframework.aop.aspectj.ShadowMatch = this . java.util.Map<java.lang.reflect.Method,org.springframework.aop.aspectj.ShadowMatch> . get ( java.lang.reflect.Method ) ; if ( org.springframework.aop.aspectj.ShadowMatch == null ) { try { try { org.springframework.aop.aspectj.ShadowMatch = this . org.springframework.aop.aspectj.PointcutExpression . matchesMethodExecution ( java.lang.reflect.Method ) ; } catch ( ReflectionWorldException org.springframework.aop.aspectj.ReflectionWorldException ) { try { org.springframework.aop.aspectj.PointcutExpression = org.springframework.aop.aspectj.PointcutExpression ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) ; if ( org.springframework.aop.aspectj.PointcutExpression != null ) { org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.PointcutExpression . matchesMethodExecution ( java.lang.reflect.Method ) ; } } catch ( ReflectionWorldException org.springframework.aop.aspectj.ReflectionWorldException ) { org.springframework.aop.aspectj.PointcutExpression = null ; } } if ( org.springframework.aop.aspectj.ShadowMatch == null && java.lang.reflect.Method != java.lang.reflect.Method ) { java.lang.reflect.Method = java.lang.reflect.Method ; try { org.springframework.aop.aspectj.ShadowMatch = this . org.springframework.aop.aspectj.PointcutExpression . matchesMethodExecution ( java.lang.reflect.Method ) ; } catch ( ReflectionWorldException org.springframework.aop.aspectj.ReflectionWorldException ) { try { org.springframework.aop.aspectj.PointcutExpression = org.springframework.aop.aspectj.PointcutExpression ( java.lang.reflect.Method . java.lang.Class<?> ( ) ) ; if ( org.springframework.aop.aspectj.PointcutExpression != null ) { org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.PointcutExpression . matchesMethodExecution ( java.lang.reflect.Method ) ; } } catch ( ReflectionWorldException org.springframework.aop.aspectj.ReflectionWorldException ) { org.springframework.aop.aspectj.PointcutExpression = null ; } } } } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.aop.aspectj.Log . debug ( STRING , java.lang.Throwable ) ; org.springframework.aop.aspectj.PointcutExpression = null ; } if ( org.springframework.aop.aspectj.ShadowMatch == null ) { org.springframework.aop.aspectj.ShadowMatch = new ShadowMatchImpl ( org . aspectj . util . FuzzyBoolean . NO , null , null , null ) ; } else if ( org.springframework.aop.aspectj.ShadowMatch . maybeMatches ( ) && org.springframework.aop.aspectj.PointcutExpression != null ) { org.springframework.aop.aspectj.ShadowMatch = new org.springframework.aop.aspectj.AspectJExpressionPointcut.DefensiveShadowMatch ( org.springframework.aop.aspectj.ShadowMatch , org.springframework.aop.aspectj.PointcutExpression . matchesMethodExecution ( java.lang.reflect.Method ) ) ; } this . java.util.Map<java.lang.reflect.Method,org.springframework.aop.aspectj.ShadowMatch> . put ( java.lang.reflect.Method , org.springframework.aop.aspectj.ShadowMatch ) ; } } } return org.springframework.aop.aspectj.ShadowMatch ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.aop.aspectj.AspectJExpressionPointcut ) ) { return false ; } org.springframework.aop.aspectj.AspectJExpressionPointcut org.springframework.aop.aspectj.AspectJExpressionPointcut = ( org.springframework.aop.aspectj.AspectJExpressionPointcut ) java.lang.Object ; return ObjectUtils . nullSafeEquals ( this . getExpression ( ) , org.springframework.aop.aspectj.AspectJExpressionPointcut . getExpression ( ) ) && ObjectUtils . nullSafeEquals ( this . java.lang.Class<> , org.springframework.aop.aspectj.AspectJExpressionPointcut . java.lang.Class<> ) && ObjectUtils . nullSafeEquals ( this . java.lang.String[] , org.springframework.aop.aspectj.AspectJExpressionPointcut . java.lang.String[] ) && ObjectUtils . nullSafeEquals ( this . java.lang.Class<?>[] , org.springframework.aop.aspectj.AspectJExpressionPointcut . java.lang.Class<?>[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = ObjectUtils . nullSafeHashCode ( this . getExpression ( ) ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( this . java.lang.Class<> ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( this . java.lang.String[] ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( this . java.lang.Class<?>[] ) ; return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; if ( this . java.lang.String[] != null && this . java.lang.Class<?>[] != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; for ( int int = NUMBER ; int < this . java.lang.Class<?>[] . int ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( this . java.lang.Class<?>[] [ int ] . java.lang.String ( ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( this . java.lang.String[] [ int ] ) ; if ( ( int + NUMBER ) < this . java.lang.Class<?>[] . int ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; if ( getExpression ( ) != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( getExpression ( ) ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.aspectj.ContextBasedMatcher org.springframework.aop.aspectj.ContextBasedMatcher ( java.lang.String java.lang.String ) { return new org.springframework.aop.aspectj.AspectJExpressionPointcut.BeanContextMatcher ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . org.springframework.aop.aspectj.NamePattern = new NamePattern ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Deprecated public boolean boolean ( java.lang.Class java.lang.Class ) { return ( org.springframework.aop.aspectj.FuzzyBoolean ( java.lang.Class ) == FuzzyBoolean . YES ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Deprecated public boolean boolean ( java.lang.Class java.lang.Class , MatchingContext org.springframework.aop.aspectj.MatchingContext ) { return ( org.springframework.aop.aspectj.FuzzyBoolean ( java.lang.Class ) == FuzzyBoolean . YES ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MatchingContext org.springframework.aop.aspectj.MatchingContext ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.aspectj.FuzzyBoolean org.springframework.aop.aspectj.FuzzyBoolean ( MatchingContext org.springframework.aop.aspectj.MatchingContext ) { return org.springframework.aop.aspectj.FuzzyBoolean ( null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.FuzzyBoolean org.springframework.aop.aspectj.FuzzyBoolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.String java.lang.String = java.lang.String ( ) ; if ( java.lang.String == null ) { return FuzzyBoolean . MAYBE ; } if ( BeanFactoryUtils . isGeneratedBeanName ( java.lang.String ) ) { return FuzzyBoolean . NO ; } if ( java.lang.Class<> != null ) { boolean boolean = FactoryBean .class . boolean ( java.lang.Class<> ) ; return FuzzyBoolean . fromBoolean ( boolean ( boolean ? BeanFactory . FACTORY_BEAN_PREFIX + java.lang.String : java.lang.String ) ) ; } else { return FuzzyBoolean . fromBoolean ( boolean ( java.lang.String ) || boolean ( BeanFactory . FACTORY_BEAN_PREFIX + java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { return BeanFactoryAnnotationUtils . isQualifierMatch ( this . org.springframework.aop.aspectj.NamePattern :: matches , java.lang.String , org.springframework.aop.aspectj.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.io.ObjectInputStream java.io.ObjectInputStream ) throws java.io.IOException , java.lang.ClassNotFoundException { java.io.ObjectInputStream . void ( ) ; this . java.util.Map<java.lang.reflect.Method,org.springframework.aop.aspectj.ShadowMatch> = new java.util.concurrent.ConcurrentHashMap <> ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void ( ShadowMatch org.springframework.aop.aspectj.ShadowMatch , ShadowMatch org.springframework.aop.aspectj.ShadowMatch ) { this . org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.ShadowMatch ; this . org.springframework.aop.aspectj.ShadowMatch = org.springframework.aop.aspectj.ShadowMatch ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.aop.aspectj.ShadowMatch . alwaysMatches ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.aop.aspectj.ShadowMatch . maybeMatches ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.aop.aspectj.ShadowMatch . neverMatches ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.aspectj.JoinPointMatch org.springframework.aop.aspectj.JoinPointMatch ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , java.lang.Object [] java.lang.Object[] ) { try { return this . org.springframework.aop.aspectj.ShadowMatch . matchesJoinPoint ( java.lang.Object , java.lang.Object , java.lang.Object[] ) ; } catch ( ReflectionWorldException org.springframework.aop.aspectj.ReflectionWorldException ) { return this . org.springframework.aop.aspectj.ShadowMatch . matchesJoinPoint ( java.lang.Object , java.lang.Object , java.lang.Object[] ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MatchingContext org.springframework.aop.aspectj.MatchingContext ) { this . org.springframework.aop.aspectj.ShadowMatch . setMatchingContext ( org.springframework.aop.aspectj.MatchingContext ) ; this . org.springframework.aop.aspectj.ShadowMatch . setMatchingContext ( org.springframework.aop.aspectj.MatchingContext ) ; }  <METHOD_END>