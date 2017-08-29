<METHOD_START> public void ( RedisTemplate < ? , ? > org.springframework.integration.redis.outbound.RedisTemplate<?,?> ) { Assert . notNull ( org.springframework.integration.redis.outbound.RedisTemplate<,> , STRING ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<?,?> = org.springframework.integration.redis.outbound.RedisTemplate<,> ; }  <METHOD_END>
<METHOD_START> public void ( RedisConnectionFactory org.springframework.integration.redis.outbound.RedisConnectionFactory ) { Assert . notNull ( org.springframework.integration.redis.outbound.RedisConnectionFactory , STRING ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<?,?> = new RedisTemplate < java.lang.Object , java.lang.Object > ( ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<,> . setConnectionFactory ( org.springframework.integration.redis.outbound.RedisConnectionFactory ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<,> . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( RedisSerializer < ? > org.springframework.integration.redis.outbound.RedisSerializer<?> ) { Assert . notNull ( org.springframework.integration.redis.outbound.RedisSerializer<> , STRING ) ; this . org.springframework.integration.redis.outbound.RedisSerializer<java.lang.Object> = ( RedisSerializer < java.lang.Object > ) org.springframework.integration.redis.outbound.RedisSerializer<> ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.redis.outbound.Expression ) { this . org.springframework.integration.redis.outbound.Expression = org.springframework.integration.redis.outbound.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . org.springframework.integration.redis.outbound.Expression = EXPRESSION_PARSER . parseExpression ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( ArgumentsStrategy org.springframework.integration.redis.outbound.ArgumentsStrategy ) { this . org.springframework.integration.redis.outbound.ArgumentsStrategy = org.springframework.integration.redis.outbound.ArgumentsStrategy ; }  <METHOD_END>
<METHOD_START> public void void ( EvaluationContext org.springframework.integration.redis.outbound.EvaluationContext ) { this . org.springframework.integration.redis.outbound.EvaluationContext = org.springframework.integration.redis.outbound.EvaluationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doInit ( ) ; if ( this . org.springframework.integration.redis.outbound.EvaluationContext == null ) { this . org.springframework.integration.redis.outbound.EvaluationContext = ExpressionUtils . createStandardEvaluationContext ( getBeanFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.redis.outbound.Message<?> ) { final java.lang.String java.lang.String = this . org.springframework.integration.redis.outbound.Expression . getValue ( this . org.springframework.integration.redis.outbound.EvaluationContext , org.springframework.integration.redis.outbound.Message<> , java.lang.String .class ) ; Assert . notNull ( java.lang.String , STRING ) ; byte [] [] byte[][] = null ; if ( this . org.springframework.integration.redis.outbound.ArgumentsStrategy != null ) { java.lang.Object [] java.lang.Object[] = this . org.springframework.integration.redis.outbound.ArgumentsStrategy . resolve ( java.lang.String , org.springframework.integration.redis.outbound.Message<> ) ; if ( ! ObjectUtils . isEmpty ( java.lang.Object[] ) ) { byte[][] = new byte [ [] java.lang.Object[] . int ][] ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { java.lang.Object java.lang.Object = java.lang.Object[] [ int ] ; byte [] byte[] = null ; if ( java.lang.Object instanceof byte [] ) { byte[] = ( byte [] ) java.lang.Object ; } else { byte[] = this . org.springframework.integration.redis.outbound.RedisSerializer<java.lang.Object> . serialize ( java.lang.Object ) ; } byte[][] [ int ] = byte[] ; } } } final byte [] [] byte[][] = byte[][] ; return this . org.springframework.integration.redis.outbound.RedisTemplate<,> . execute ( ( RedisCallback < java.lang.Object > ) connection -> connection . execute ( command , actualArgs ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object [] java.lang.Object[] ( java.lang.String java.lang.String , Message < ? > org.springframework.integration.redis.outbound.Message<?> ) { java.lang.Object java.lang.Object = org.springframework.integration.redis.outbound.Message<> . getPayload ( ) ; if ( java.lang.Object instanceof java.lang.Object [] ) { return ( java.lang.Object [] ) java.lang.Object ; } else { return new java.lang.Object [] { java.lang.Object } ; } }  <METHOD_END>
