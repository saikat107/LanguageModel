<METHOD_START> @ After public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ReloadableResourceBundleExpressionSource org.springframework.integration.expression.ReloadableResourceBundleExpressionSource = new ReloadableResourceBundleExpressionSource ( ) ; org.springframework.integration.expression.ReloadableResourceBundleExpressionSource . setBasename ( java.lang.String ) ; org.springframework.integration.expression.ReloadableResourceBundleExpressionSource . setCacheSeconds ( NUMBER ) ; DynamicExpression org.springframework.integration.expression.DynamicExpression = new DynamicExpression ( java.lang.String , org.springframework.integration.expression.ReloadableResourceBundleExpressionSource ) ; assertEquals ( STRING , org.springframework.integration.expression.DynamicExpression . getValue ( ) ) ; void ( STRING ) ; assertEquals ( STRING , org.springframework.integration.expression.DynamicExpression . getValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String ) { ClassPathResource org.springframework.integration.expression.ClassPathResource = new ClassPathResource ( java.lang.String ) ; byte [] byte[] = new java.lang.String ( java.lang.String + STRING + java.lang.String ) . byte[] ( ) ; try { java.io.FileOutputStream java.io.FileOutputStream = new java.io.FileOutputStream ( org.springframework.integration.expression.ClassPathResource . getFile ( ) ) ; java.io.FileOutputStream . void ( byte[] ) ; java.io.FileOutputStream . void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>