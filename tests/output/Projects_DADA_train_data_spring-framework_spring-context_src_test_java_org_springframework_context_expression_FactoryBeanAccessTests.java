<METHOD_START> @ Test public void void ( ) { StandardEvaluationContext org.springframework.context.expression.StandardEvaluationContext = new StandardEvaluationContext ( ) ; org.springframework.context.expression.StandardEvaluationContext . setBeanResolver ( new org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver ( ) ) ; Expression org.springframework.context.expression.Expression = new SpelExpressionParser ( ) . parseRaw ( STRING ) ; assertEquals ( STRING , org.springframework.context.expression.Expression . getValue ( org.springframework.context.expression.StandardEvaluationContext ) ) ; org.springframework.context.expression.Expression = new SpelExpressionParser ( ) . parseRaw ( STRING ) ; assertEquals ( org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.CarFactoryBean .class . java.lang.String ( ) , org.springframework.context.expression.Expression . getValue ( org.springframework.context.expression.StandardEvaluationContext ) ) ; org.springframework.context.expression.Expression = new SpelExpressionParser ( ) . parseRaw ( STRING ) ; assertEquals ( STRING , org.springframework.context.expression.Expression . getValue ( org.springframework.context.expression.StandardEvaluationContext ) ) ; org.springframework.context.expression.Expression = new SpelExpressionParser ( ) . parseRaw ( STRING ) ; try { assertEquals ( org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Boat .class . java.lang.String ( ) , org.springframework.context.expression.Expression . getValue ( org.springframework.context.expression.StandardEvaluationContext ) ) ; fail ( STRING ) ; } catch ( BeanIsNotAFactoryException org.springframework.context.expression.BeanIsNotAFactoryException ) { } try { org.springframework.context.expression.Expression = new SpelExpressionParser ( ) . parseRaw ( STRING ) ; assertEquals ( STRING , org.springframework.context.expression.Expression . getValue ( org.springframework.context.expression.StandardEvaluationContext ) ) ; fail ( STRING ) ; } catch ( NoSuchBeanDefinitionException org.springframework.context.expression.NoSuchBeanDefinitionException ) { } try { org.springframework.context.expression.Expression = new SpelExpressionParser ( ) . parseRaw ( STRING ) ; assertEquals ( org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.CarFactoryBean .class . java.lang.String ( ) , org.springframework.context.expression.Expression . getValue ( org.springframework.context.expression.StandardEvaluationContext ) ) ; fail ( STRING ) ; } catch ( NoSuchBeanDefinitionException org.springframework.context.expression.NoSuchBeanDefinitionException ) { } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car ( ) { return new org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car> < org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car > java.lang.Class<org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car> ( ) { return org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Car .class ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public void ( ) { org.springframework.context.expression.StaticApplicationContext . registerSingleton ( STRING , org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.CarFactoryBean .class ) ; org.springframework.context.expression.StaticApplicationContext . registerSingleton ( STRING , org.springframework.context.expression.FactoryBeanAccessTests.SimpleBeanResolver.Boat .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( EvaluationContext org.springframework.context.expression.EvaluationContext , java.lang.String java.lang.String )				throws org.springframework.context.expression.AccessException { return org.springframework.context.expression.StaticApplicationContext . getBean ( java.lang.String ) ; }  <METHOD_END>
