<METHOD_START> public void ( java.lang.String java.lang.String , RedisConnectionFactory org.springframework.integration.redis.outbound.RedisConnectionFactory ) { this( new LiteralExpression ( java.lang.String ) , org.springframework.integration.redis.outbound.RedisConnectionFactory ); }  <METHOD_END>
<METHOD_START> public void ( Expression org.springframework.integration.redis.outbound.Expression , RedisConnectionFactory org.springframework.integration.redis.outbound.RedisConnectionFactory ) { Assert . notNull ( org.springframework.integration.redis.outbound.Expression , STRING ) ; Assert . hasText ( org.springframework.integration.redis.outbound.Expression . getExpressionString ( ) , STRING ) ; Assert . notNull ( org.springframework.integration.redis.outbound.RedisConnectionFactory , STRING ) ; this . org.springframework.integration.redis.outbound.Expression = org.springframework.integration.redis.outbound.Expression ; this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> = new RedisTemplate < java.lang.String , java.lang.Object > ( ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> . setConnectionFactory ( org.springframework.integration.redis.outbound.RedisConnectionFactory ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> . setEnableDefaultSerializer ( false ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> . setKeySerializer ( new StringRedisSerializer ( ) ) ; this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( RedisSerializer < ? > org.springframework.integration.redis.outbound.RedisSerializer<?> ) { Assert . notNull ( org.springframework.integration.redis.outbound.RedisSerializer<> , STRING ) ; this . org.springframework.integration.redis.outbound.RedisSerializer<?> = org.springframework.integration.redis.outbound.RedisSerializer<> ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( EvaluationContext org.springframework.integration.redis.outbound.EvaluationContext ) { this . org.springframework.integration.redis.outbound.EvaluationContext = org.springframework.integration.redis.outbound.EvaluationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { super. onInit ( ) ; if ( this . org.springframework.integration.redis.outbound.EvaluationContext == null ) { this . org.springframework.integration.redis.outbound.EvaluationContext = ExpressionUtils . createStandardEvaluationContext ( getBeanFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected void void ( Message < ? > org.springframework.integration.redis.outbound.Message<?> ) throws java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.redis.outbound.Message<> ; if ( this . boolean ) { java.lang.Object = org.springframework.integration.redis.outbound.Message<> . getPayload ( ) ; } if ( ! ( java.lang.Object instanceof byte [] ) ) { if ( java.lang.Object instanceof java.lang.String && ! this . boolean ) { java.lang.Object = this . org.springframework.integration.redis.outbound.RedisSerializer<java.lang.String> . serialize ( ( java.lang.String ) java.lang.Object ) ; } else { java.lang.Object = ( ( RedisSerializer < java.lang.Object > ) this . org.springframework.integration.redis.outbound.RedisSerializer<> ) . serialize ( java.lang.Object ) ; } } java.lang.String java.lang.String = this . org.springframework.integration.redis.outbound.Expression . getValue ( this . org.springframework.integration.redis.outbound.EvaluationContext , org.springframework.integration.redis.outbound.Message<> , java.lang.String .class ) ; if ( this . boolean ) { this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> . boundListOps ( java.lang.String ) . leftPush ( java.lang.Object ) ; } else { this . org.springframework.integration.redis.outbound.RedisTemplate<java.lang.String,java.lang.Object> . boundListOps ( java.lang.String ) . rightPush ( java.lang.Object ) ; } }  <METHOD_END>
