<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { if ( java.lang.Object instanceof AopInfrastructureBean ) { return java.lang.Object ; } if ( java.lang.Object instanceof Advised ) { Advised org.springframework.aop.framework.Advised = ( Advised ) java.lang.Object ; if ( ! org.springframework.aop.framework.Advised . isFrozen ( ) && boolean ( AopUtils . getTargetClass ( java.lang.Object ) ) ) { if ( this . boolean ) { org.springframework.aop.framework.Advised . addAdvisor ( NUMBER , this . org.springframework.aop.framework.Advisor ) ; } else { org.springframework.aop.framework.Advised . addAdvisor ( this . org.springframework.aop.framework.Advisor ) ; } return java.lang.Object ; } } if ( boolean ( java.lang.Object , java.lang.String ) ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = org.springframework.aop.framework.ProxyFactory ( java.lang.Object , java.lang.String ) ; if ( ! org.springframework.aop.framework.ProxyFactory . isProxyTargetClass ( ) ) { evaluateProxyInterfaces ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.aop.framework.ProxyFactory ) ; } org.springframework.aop.framework.ProxyFactory . addAdvisor ( this . org.springframework.aop.framework.Advisor ) ; void ( org.springframework.aop.framework.ProxyFactory ) ; return org.springframework.aop.framework.ProxyFactory . getProxy ( getProxyClassLoader ( ) ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { return boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.Boolean java.lang.Boolean = this . java.util.Map<java.lang.Class<?>,java.lang.Boolean> . java.lang.Boolean ( java.lang.Class<> ) ; if ( java.lang.Boolean != null ) { return java.lang.Boolean ; } java.lang.Boolean = AopUtils . canApply ( this . org.springframework.aop.framework.Advisor , java.lang.Class<> ) ; this . java.util.Map<java.lang.Class<?>,java.lang.Boolean> . java.lang.Boolean ( java.lang.Class<> , java.lang.Boolean ) ; return java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> protected org.springframework.aop.framework.ProxyFactory org.springframework.aop.framework.ProxyFactory ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( ) ; org.springframework.aop.framework.ProxyFactory . copyFrom ( this ) ; org.springframework.aop.framework.ProxyFactory . setTarget ( java.lang.Object ) ; return org.springframework.aop.framework.ProxyFactory ; }  <METHOD_END>
<METHOD_START> protected void void ( ProxyFactory org.springframework.aop.framework.ProxyFactory ) {	}  <METHOD_END>